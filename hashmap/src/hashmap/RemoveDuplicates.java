package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> rd(int[] arr){
		//ArrayList for the output
		ArrayList<Integer> output = new ArrayList<Integer>();
		//hashmap object
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		//iterate the array
		for(int i = 0;i<arr.length;i++) {
			int n = arr[i];
			//checking whether the key is already present in the map
			if(map.containsKey(n)) {
				continue;
			}
			output.add(n);
			map.put(n, true);
		}
		
		
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,2,5,6,4,8,7,8,9,3,2,5,7,8};
		ArrayList<Integer> ans = rd(arr);
		System.out.println(ans);
	}

}
