package linearSearchAlgorithm;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,6,9,874,-9,-1,7,6541,41,8};
		System.out.println(min(arr));

	}
	static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(ans > arr[i]) {
				ans = arr[i];
			}
		}
		return ans;
	}
	
//	To find the minimum element in the given array, we 
//	need to first make the first or the 0th element of 
//	the array as be the smallest array as an assumption 
//	after we need to iterate or traverses to the last 
//	element of the array, checking whether that the present 
//	minimum number is greater than the element that checked 
//	through the iteration. And if it is found to be true, 
//	then we need to make the minimum as the element which 
//	has been minimum than the current minimum number in the array.

}
