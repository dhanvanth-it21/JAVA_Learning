package sortingTechniques;

import java.util.Arrays;

public class SelectionSort {
	
	int[] arr;
	public SelectionSort(int[] arr) {
		this.arr = arr;
		selectionSort(this.arr);
		
	}
	public  String toString() {
		return "The Array is sorted as : "+ Arrays.toString(arr);
	}
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int maxIndex = 0;
			for(int j = 0;j<n-i;j++) {
				if(arr[j] > arr[maxIndex]) {
			  		maxIndex = j;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[n-i-1];
			arr[n-i-1] = temp;
			
		}
	}

}
