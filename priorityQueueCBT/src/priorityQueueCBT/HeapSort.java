package priorityQueueCBT;
import java.util.ArrayList;
public class HeapSort {
/////////////////Heap Sort inPlace//////////////////////////////
/////TC : O(n log n);	
// this approach taraverse all the nodes in the builded heap
// and for the each node in the heap it goes for DownHeapify()
// hence the heapify takes O(log_n) and as fo each node:
//	it takes """"O(n log_n)"""" of Time Complexity
	
	
	////////////////////////SWAP//////////////////////////////
	private static void swap(int c, int p, ArrayList<Integer> heap) {
		// TODO Auto-generated method stub
		int temp = heap.get(p);
		heap.set(p, heap.get(c));
		heap.set(c, temp);
		
	}
	///////////////////////DownHeapify///////////////////////////
	private static void downHeapify(ArrayList<Integer> heap) {
		// TODO Auto-generated method stub
		//p -parent
		//lc - leftchild
		//rc - rightchild
		int p = 0;
		int lc = 2*p+1;
		int rc = 2*p+2;
		int min = p;
		while(lc < heap.size()) {
			if(heap.get(min)  >heap.get(lc)) min = lc;
			if(rc <  heap.size() && heap.get(min)  >heap.get(rc)) min = rc;
			if(min == p) return;
			swap(p,min,heap);
			p = min;
			lc = 2*p+1;
			rc = 2*p+2;
		}
		
	}
	///////////////////////UpHeapify///////////////////////////
	private static void upHeapify(ArrayList<Integer> heap) {
		// TODO Auto-generated method stub
		// c - child
		// p - parent
		// heap construction
		//here the heap is build
		int c = heap.size()-1;
		int p = (c-1)/2;
		while(heap.get(c) < heap.get(p)) {
			swap(c,p,heap);
			c = p;
			p = (c-1)/2;
			
		}
	
	}	
	////////////////////////HeapSort///////////////////////////
	private static void heapSort(int[] arr) {
		ArrayList<Integer> heap = new ArrayList<Integer>();
		for(int i : arr) {
			heap.add(i);
			upHeapify(heap);
		}
		for(int i = heap.size()-1;i>=0;i--) {
			arr[i] = heap.get(0);
			swap(0,i,heap);
			heap.remove(i);
			downHeapify(heap);
		}
		
	}
    /////////////////////////Main///////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] arr = {5,2,6,3,1,4};
		heapSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		

	}

}
