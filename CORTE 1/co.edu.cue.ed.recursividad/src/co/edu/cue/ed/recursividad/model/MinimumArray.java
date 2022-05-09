package co.edu.cue.ed.recursividad.model;

public class MinimumArray {

	
	public Integer minimumValue(int[] numArray, int start, int end){
		int less;
		int temp;
		if (start==end) {
			return less=numArray[start];
		}else {
			less= minimumValue(numArray, start+1, end);
			if (numArray[start]<less) {
				temp= numArray[start];
			} else {
				temp= less;
			}
		}
		return temp;
	}
	
	
//	public int minimumValue(int[] numArray, int start, int end){
//		if (start==end) {
//			return numArray[start];
//		}else {
//			if (numArray[end]<minimumValue(numArray, start, end-1)) {
//				return numArray[end];
//			}else {
//				return minimumValue(numArray, start, end-1);
//			}
//		}
//	}
	
}
