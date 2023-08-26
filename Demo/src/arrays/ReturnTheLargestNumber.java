package arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReturnTheLargestNumber {
	public static int largestNumber(int[] arr) {
		int l;
		l = arr[1];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>l){
				l = arr[i];
			}
		}
		return l;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String s = br.readLine();
		String[] sarr = s.split("\s");
		int [] arr = new int[sarr.length];
		for(int i = 0;i<sarr.length;i++) {
			arr[i] = Integer.parseInt(sarr[i]);
		}
		System.out.println(largestNumber(arr));
		
		
		

	}

}
