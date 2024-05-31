package searchinAndSorting;

public class BinarySearch {
	static int searchTheTarget(int[] arr, int t,int l,int h) {
		if(l>h) {
			return -1; // target not found
		}
		
		int mid = (l+h)/2;
		if(arr[mid] == t) {
			return mid;
		}
		else if(arr[mid] > t) {
			return searchTheTarget(arr, t,l,mid-1);
		}
		else {
			return searchTheTarget(arr, t,mid+1,h);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int target = 4;
		int low = arr[0], high = arr[arr.length - 1]; 
		System.out.println(searchTheTarget(arr, target,low,high));
		

	}

}
