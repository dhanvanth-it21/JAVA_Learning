package arrays;

import java.util.Arrays;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,3,6,54,8,96,21};
		System.out.println(Arrays.toString(arr));
		System.out.println("After Swapping");
		swap(arr,0,3);
		System.out.println(Arrays.toString(arr));
		

	}
	static void swap(int[] arr, int index1 ,int index2) {
		int temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}

}
