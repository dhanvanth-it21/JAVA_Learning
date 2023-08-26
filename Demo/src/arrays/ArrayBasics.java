package arrays;
import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		
//syntax for array
		//datatype[] arrRefVar = new datatype[arraySize];
		//datatype[] arrRefVar => compileTime
		//new datatype[arraySize] => runTime
		//datatype[]- tells the type of elements stored in the array				
		
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		String[] arr1 = new String[5];
		
		
//		System.out.println(arr[0]);   => 0
//		System.out.println(arr1[0]);   => null
		//primitive dataTypes default value is 0
		//non-primitive dataTypes default value is null
		
		
		
		
		// for loop for input
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		// for loop to print the array
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		
		//for each loop to print the array
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
		
		
		

	}

}
