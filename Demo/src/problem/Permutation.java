package problem;
import java.util.Scanner;
public class Permutation {
	
	public static void swap(char[] arr , int i, int fi) {
		char temp = arr[i];
		arr[i] = arr[fi];
		arr[fi] = temp;
	}
	
	public static void permutation(char[] arr, int fi) {
		if(fi == arr.length - 1) {
			System.out.println(arr);
			return;
		}
		for(int i = fi;i<arr.length;i++) {
			swap(arr,i,fi);
			permutation(arr,fi+1);
			swap(arr,i,fi);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		permutation(str.toCharArray(),0);

	}

}
