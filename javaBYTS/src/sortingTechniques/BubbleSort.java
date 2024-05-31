package sortingTechniques;

import java.util.Arrays;

public class BubbleSort {
	
	private int[] arr;
	
	
	public BubbleSort(int[] arr) {
		this.arr = arr;
//		System.out.println(Arrays.toString(arr));
		bubble(arr);
	}
	public String toString() {
		return "The Array is sorted as : "+Arrays.toString(arr);
	}
	
	
	public void bubble(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			boolean swap = false;
			for(int j = 1;j<n-i;j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		
	}
	
	



}
