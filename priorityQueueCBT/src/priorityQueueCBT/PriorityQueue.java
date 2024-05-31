package priorityQueueCBT;
import java.util.ArrayList;
public class PriorityQueue<T> {
	// we use the arrayList for the implementation of Heap
	// each element will have the ""Value"" and ""Priority""
	
	public ArrayList<Element<T>> heap;
	
	public PriorityQueue () {
		heap = new ArrayList<Element<T>>();
	}
	
	// Operation:
		//	Insertion
		//	getMin/Max
		//	Remove
		//	Size
		//	isEmpty
	
	
	/////////////////INSERTION_MIN//////////////////////
	public void insert (T value, int priority) {
		Element<T> e = new Element<T>(value,priority);
		heap.add(e);
		
		int childIndex = size()-1;
		int parentIndex = (childIndex-1)/2;
		
		while(childIndex > 0) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}
			else {
				return;
			}
		}
		
		
		
	}
	///////////////getMIN//////////////////////////
	public T getMin() throws PrioritQueueException {
		if(isEmpty()) {
			throw new PrioritQueueException();
		}
		return heap.get(0).value;
	}
	///////////////////REMOVE_MIN///////////////////////
	public T removeMin() throws PrioritQueueException {
		if(isEmpty()) {
			throw new PrioritQueueException();
		}
		
		Element<T> removed = heap.get(0);
		T ans = removed.value;
		
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(size()-1);
		
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		
		while(leftChildIndex < size()) {
			int minIndex = parentIndex;
			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = rightChildIndex;
			}
			if(minIndex == parentIndex) break;
			
			Element<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex+1;
			rightChildIndex = 2*parentIndex+2;
		}
		return ans;
	}
	//////////////////SIZE//////////////////////////
	public int size() {
		return heap.size();
	}
	////////////////isEMPTY///////////////////////////
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}
}
