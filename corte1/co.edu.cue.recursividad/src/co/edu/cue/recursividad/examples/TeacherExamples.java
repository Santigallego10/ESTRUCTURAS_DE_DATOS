package co.edu.cue.recursividad.examples;

public class TeacherExamples {
    public TeacherExamples() {
    }

    public long sumNInts(int n) {
        if (n==1)
            return 1;
        else
            return n + sumNInts(n-1);
    }

    public int fibonacci(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public long factorial(int n) {
        if (n<=1)
            return 1;
        else
            return n * factorial(n-1);
    }

    //Alphabet

    public void methodA(char c) {
        if (c > 'A')
            methodB(c);
        System.out.println(c+" ");
    }

    public void methodB(char c) {
        methodA(--c);
    }

    //--------------------------------

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1)
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public boolean palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length()-1)) {
                System.out.println(str.substring(1, str.length()-1));
                return palindrome(str.substring(1, str.length()-1));
            } else {
                return false;
            }
        }
    }

    public int smallerNumber(int[] array, int start, int end) {
        int smaller = array[start-1];

        if (start != end) {
            if(array[start] < smaller) {
                smaller = array[start];
            }
            return smallerNumber(array, start+1, end);
        }
        return smaller;
    }

    public int binarySearch(int[] numArray, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right-left) / 2;

            if (numArray[mid] == key)
                return mid;
            if (numArray[mid] > key)
                return binarySearch(numArray, left, mid-1, key);
            return binarySearch(numArray, mid+1, right, key);
        }
        return -1;
    }




}