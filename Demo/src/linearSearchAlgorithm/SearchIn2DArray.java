package linearSearchAlgorithm;

import java.util.Arrays;


public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr  = {
				{1,2,3,4},
				{5,6,7,8},
				{14,21,54,52,32}
		};
		int target = 21;
		int[] ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));

	}
	
	
	// to find the element in the 2d array
	static int[] search(int[][] arr,int target) {

		
		for (int rows = 0; rows < arr.length; rows++) {
			for (int columns = 0; columns < arr[rows].length; columns++) {
				if(arr[rows][columns] == target) {

					
					return new int[] {rows,columns};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	
	
	// to find the max element in the 2d array
	static int max(int[][] arr) {
		int maxValue = Integer.MIN_VALUE;
		for (int rows = 0; rows < arr.length; rows++) {
			for (int columns = 0; columns < arr[rows].length; columns++) {
				if(maxValue < arr[rows][columns]) {
					maxValue = arr[rows][columns];
				}
			}
		}
		return maxValue;
	}

}
