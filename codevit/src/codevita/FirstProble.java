package codevita;
import java.util.Scanner;
import java.util.HashMap;

public class FirstProble {
	public static int minCount(int arr[],int w, int n, int d) {
		if(arr.length <= 1) return 0;
		
		
		
		HashMap<Integer, Integer> ith = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> jth = new HashMap<Integer, Integer>();

		int i = 0, j = arr.length-1;
		int count = 0;
		
		
		while(i<j){
			if(arr[i] == arr[j]) {
				i++;j--;
				continue;
			}
			for(int r = 0;r<n;r++) {
				ith.put((arr[i]+ 4*r) > n?(arr[i]+ 4*r)%5:(arr[i]+ 4*r), r);
				jth.put((arr[j]+ 4*r) > n?(arr[j]+ 4*r)%5:(arr[j]+ 4*r), r);
				
	
			}
			System.out.println(ith.get(5));
			i++;j--;
			
			
			

		
			if(!jth.containsKey(arr[i])) return -1;
			
			if(jth.get(arr[i]) > ith.get(arr[j])) {
				arr[i] = arr[j];
				count += ith.get(arr[j]);
			}
			else {
				arr[j] = arr[i];
				count += jth.get(arr[i]);
			}
			ith.clear();
			jth.clear();
			i++;
			j--;
			
			
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		
		
		return count;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w,n,d;
		w = sc.nextInt();
		n = sc.nextInt();
		d = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int count = minCount(arr,w,n,d);
		System.out.println(count);

	}

}
