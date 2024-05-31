package rotateMatrix;

import java.util.Scanner;

public class RotateMatrix {

	

	

	public static void rotate(int[][] arr,int n) {



//		int rot = n/2;

//		if(n%2 != 0) rot++;
		int length = n;
		for(int k = 1;k<=n/2;k++) {
			
			
			for(int i = k;i<length;i++){

				int j = k;

				int wh = 4;

				int temp = arr[i-1][j-1];

				while(wh > 0) {

					int backIndex = find(i,n);

					int temp1 = arr[j-1][backIndex-1];

					arr[j-1][backIndex-1] = temp;

					temp = temp1;

					i=j;

					j = backIndex;

					wh--;

				}

			}
			length --;
		}

		

	}

	

	public static int find(int i, int n) {

		int res;

		res = i+(n-1);

		if(res > n) {

			int rem = res-n;

			res = n;

			while(rem >0) {

				res--;

				rem--;

			}

		}

		return res;

		

	}

	

	

	

	

//	public static void print(int[][] arr, int n){

//		

//		int s = 0;

//		int e = n-1;

//		for(int i = 0;i<4;i++) {

//			row = i;

//			printRow(arr,s,e,row);

//			printCOl(s,e);

//			printRow(arr, s,e);

//			printCOl(s,e);

//		}

//

//	}

//	

	

	public static void printRow(int[][] arr ,int s, int e,int row) {

		for(int i = s;i<=e;i++) {

			

		}

	}

	public static void printCOl(int s, int e) {

		

	}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Size of the square matrix: ");

		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		//taking the matrix input : 

		System.out.println("Enter the Elements of the Martix: ");

		for(int i = 0;i<n;i++) {

			for(int j = 0;j<n;j++) {

				arr[i][j] = sc.nextInt();

			}

		}

		// theta input:

		System.out.println("Enter the Theta degree : ");

		int th = sc.nextInt();

		int rot = th;

		if(th < 0) {

			rot = 360 + th;

		}

		rot = rot%360;

		for(int i = 0;i < rot;i = i+90)

			rotate(arr, n);

		

		for(int i = 0;i<n;i++) {

			for(int j = 0;j<n;j++) {

				System.out.print(arr[i][j] +" ");

			}

			System.out.println("");

		}

		

		//printing the circular array : 

//		print(arr,n);

	}



}