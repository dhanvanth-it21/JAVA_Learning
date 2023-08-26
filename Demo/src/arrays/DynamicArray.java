package arrays;
import java.util.Arrays;

public class DynamicArray {
	public static void print(int[][] arr) {
		
		//
		
		for(int row = 0;row<arr.length;row++) {
			
			for(int col = 0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
		//for each loop
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			{1,2,3,4},
			{1,2},
			{1,2,3,4,5,6}
		};
		print(arr);
	

	}

}
