package linearSearchAlgorithm;

import java.util.Iterator;

public class LinearSearchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,14,18,77,55,27,45,62};
		int target = 145;
		int ans = linearSearch(nums, target);
		System.out.println(ans);

	}
//	If the length of the array is equal to 0 
//	then we assume that the target element 
//	cannot be found and returning -1  
	static int linearSearch(int[] nums,int target) {
		if(nums.length == 0) {
			return -1;
		}
		for (int index = 0; index < nums.length; index++) {
			int element = nums[index];
			if(element == target) {
				return index;
			}
		}
//		If the element is not found through the 
//		iteration of the for loop, then we will 
//		be returning -1 by concluding the 
//		element or target is not found in the given array 
		return -1;
		
	
	}

}
