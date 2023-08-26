package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		//int[row_size][col_size]
		//col_size is not manditory
		
		int[][] arr1 = {
				{1,2,3},
				{2,3},
				{1,2,3,4,5,6}	
		};
		
		
		
		System.out.println(Arrays.toString(arr1[2]));
		int row = 0;int col = 0;
		for(row = 0;row<arr.length;row++) {
			for(col = 0;col < arr[row].length;col++) {
				arr[row][col]  =sc.nextInt();			}
		}
		for(row = 0;row<arr.length;row++) {
			for(col = 0;col < arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");			
				}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}

	}
	

}
