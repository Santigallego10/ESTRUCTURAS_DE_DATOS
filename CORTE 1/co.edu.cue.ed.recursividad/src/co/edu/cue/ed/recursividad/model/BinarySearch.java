package co.edu.cue.ed.recursividad.model;

public class BinarySearch {

	
	public int binarySearchh(int numArray[], int left, int rigth, int key){
		if (rigth>=left) {
			int mid= left+(rigth-left)/2;
			if (numArray[mid]==key) {
				return mid;
			}
			if (numArray[mid]>key) {
				return binarySearchh(numArray, left, mid-1, key);
			} else {
				return binarySearchh(numArray, mid+1, rigth, key);
			}
		}
		return -1;
	}
}
