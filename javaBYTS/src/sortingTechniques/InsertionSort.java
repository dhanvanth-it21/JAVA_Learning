package sortingTechniques;

import java.util.Arrays;

public class InsertionSort {
	int[] arr;
	public InsertionSort(int[] arr) {
		this.arr = arr;
		insertionSort(this.arr);
	}
	public String toString() {
		return "The Array is sorted as : "+Arrays.toString(arr);
	}
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]  =temp;
				}else {
					break;
				}
			}
		}
		
	}

}
