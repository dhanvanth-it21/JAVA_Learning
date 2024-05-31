package priorityQueueCBT;

public class HeapSortOptimized {
	
	public static void swap(int i, int j, int[] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void downHeap(int[] arr,int p,int n){
		if(n == 0) return;
		// int p = 0;
		int lc = p*2 +1;
		int rc = p*2 +2;
		int min = p;
		
		while(lc < n){
			if(arr[min] > arr[lc]) min = lc;
			if(rc < n && arr[min] > arr[rc]) min = rc;
			if(min == p) return;
			swap(min,p,arr);
			p = min;
			lc = p*2 +1;
			rc = p*2 +2;
		}
	}
	
	public static void inplaceHeapSort(int arr[]) {

		int n = arr.length;
		int non_leaf =n /2;
		for(int i = non_leaf-1; i>=0;i--){
			downHeap(arr,i,n);
		}
		for(int i = n-1;i>=0;i--){
			swap(0,i,arr);
			downHeap(arr,0,i);
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] arr = {5,2,6,3,1,4};
		inplaceHeapSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");

	}

}
