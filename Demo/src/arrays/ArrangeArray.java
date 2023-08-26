package arrays;
import java.util.Scanner;

public class ArrangeArray {
	public static int[] arrayArrange(int n) {
		int[] arr = new int[n];
		int low = 0;
		int high = n-1;
		int num = 1;
		for(int i = 0;i<n/2;i++) {
			if(low < high) {
				arr[low++] = num++;
				arr[high--] = num++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		//while(t-- > 0){
		int n = sc.nextInt();
		int[] arr = arrayArrange(n);
		for(int i = 01;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		//}

	}

}
