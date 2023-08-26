package arrays;

public class ArrayStart {
	public static void print(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void inc(int[] arr) {
		for(int i  = 0;i<arr.length;i++) {
			arr[i]++;
		}
	}
	public static void p(int[] arr) {
		int[] arr1 = {10,20,30,40,50};
		arr = arr1;// arr and arr1 are just reference variable not the array name  very important
		print(arr);
		
	}
	public static int[] arrays() {
		int[] A = new int[5];
		A[0] = 11;
		A[1] = 22;
		A[2] = 33;
		A[3] = 44;
		A[4] = 55;
		
		return A;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[20];
		// datatype[] arrRefVar = new datatype[arraySize];
		// new keyword : create the array and returns the reference;
		// the above syntax will assign the reference to the arrRefVar		
		print(arr);
		inc(arr);
		System.out.println(" " );
		print(arr);
		System.out.println(" " );
		p(arr);
		System.out.println(" " );
		int[] A = arrays();
		print(A);

	}

}
