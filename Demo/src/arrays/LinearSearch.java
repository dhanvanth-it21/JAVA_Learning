package arrays;
import java.util.Scanner;

public class LinearSearch {
	public static int numSearch(int[] arr, int n,int s) {
		int l = -1;
		for(int i = 0;i<n;i++) {
			if(arr[i] == s) {
				l = i;
				break;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int s = sc.nextInt();
			System.out.println(numSearch(arr,n,s));
		}

	}

}
