package sortingTechniques;

import java.util.Arrays;

public class MergeSort {
	int[] arr;
	public MergeSort(int[] arr) {
		this.arr = arr;
	}
	public String toString() {
		return  "The Array is sorted as : "+ Arrays.toString(mergeSort(arr));

	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length ));
		return merge(left,right);
	}

	private static int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int n = left.length+right.length;
		int[] arr = new int[n];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] > right[j]) {
				arr[k] = right[j];
				j++;
			}
			else {
				arr[k] = left[i];
				i++;
			}
			k++;
		}
		while(i < left.length) {
			arr[k] = left[i];
			i++;k++;
		}
		while(j < right.length) {
			arr[k] = right[j];
			j++;k++;
		}
		
		return arr;
	}
	

}
