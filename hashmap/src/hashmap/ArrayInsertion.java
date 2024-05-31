package hashmap;
import java.util.HashMap;

public class ArrayInsertion {
	
	public static void ai(int[] arr1, int[] arr2) {
		//hashmap object creatinon
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int al1 = arr1.length;
		int al2 = arr2.length;
		
		//adding all the arr1 elements in map as key and frequency
		for(int i = 0;i<al1;i++) {
			int n = arr1[i];
			if(map.containsKey(n)) {
				int val = map.get(n);
				map.put(n,val+1);
				continue;
			}
			map.put(n,1);
		}
		
		//now arr2 to compare with the arr1
		for(int i= 0;i<al2;i++) {
			int n = arr2[i];
			if(map.containsKey(n)) {
				int val = map.get(n);
				if(val>0) {
					map.put(n,val-1);
					System.out.print (n+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,2,2,3,6,2,5};
		int[] arr2 = {2,4,2,3,5,6,6};
		ai(arr1, arr2);

	}

}
