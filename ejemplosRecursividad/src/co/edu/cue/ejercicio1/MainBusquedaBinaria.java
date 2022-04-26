package co.edu.cue.ejercicio1;


import java.util.Arrays;

class Binary_Search {
        // recursive binary search
        int binarySearch(int numArray[], int left, int right, int key)   { // este es el metodo que recibe como parametro el array, la primera posicion de la izquierda, la ultima poscion de la derecha y el elmento a buscar.
            if (right >= left) { // si el valor de la posicion en la variable right es mayor o igual al valor que tiene la variable left
                //calculate mid of the array
                int mid = left + (right - left) / 2; // calcule un valor para la variable  mid
                // if the key is at mid, return mid
                if (numArray[mid] == key) // si el numero 16 es igual al que esta en la posicion ( valor en mid)
                    return mid; // retorne el valor de mid.
                // if key < mid, recursively search the left subarray
                if (numArray[mid] > key) // si el valor que esta en la posicion del array que indica el mid que el de 16
                    return binarySearch(numArray, left, mid - 1, key); // vuelva a realizar  una busqueda binaria de forma recursiva
                // Else recursively search in the right subarray
                return binarySearch(numArray, mid + 1, right, key);
            }
            // no elements in the array, return -1
            return -1;
        }
    }
    class Main{
        public static void main(String args[])   {
            Binary_Search ob = new Binary_Search(); // se instancia la clase busqueda binaria.
            //declare and print the array
            int numArray[] = { 4,6,12,16,22}; // Array donde se buscara el numero
            System.out.println("The given array : " + Arrays.toString(numArray));
            int len = numArray.length;              //length of the array o largo  del array en este caso son 5 espacios
            int key = 16;                           //key to be searched o numero a buscar 16
            int result = ob.binarySearch(numArray, 0, len - 1, key); // se toma el array, la primera posicion del array hacia la izquierda , la ultima posicion del array hacia la derecha. El resultado ( la posicion del elemento) se guarda en esta variable.
            if (result == -1)   // En el  caso que el resultado ( variable result) sea igual a   -1
                System.out.println("Element " + key + " not present"); // El elemento que se busca no se encuentra en el array.
            else
                System.out.println("Element " + key + " found at index " + result); //  Caso contrario el elemento se encuentra en el indice : valor de la variable result
        }
    }


