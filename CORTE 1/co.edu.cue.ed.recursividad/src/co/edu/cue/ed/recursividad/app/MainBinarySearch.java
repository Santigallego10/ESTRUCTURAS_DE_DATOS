package co.edu.cue.ed.recursividad.app;

import java.util.Arrays;

import co.edu.cue.ed.recursividad.model.BinarySearch;

public class MainBinarySearch {

	public static void main(String[] args) {
		BinarySearch biSe= new BinarySearch();
		int numArray[]= {4,6,12,16,22};
		System.out.println("The given array: "+Arrays.toString(numArray));
		int len= numArray.length;
		int key=22;
		int result= biSe.binarySearchh(numArray, 0, len-1, key);
		
		if (result==-1) {
			System.out.println("Element "+ key+" not present");
		} else {
			System.out.println("Element "+ key+" found at index "+ result);
		}
	}

}
