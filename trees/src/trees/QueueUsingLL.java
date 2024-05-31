package trees;
import java.util.LinkedList;
public class QueueUsingLL<T> {
	
	// instance member
	LinkedList<T> list;
	
	//constructor
	QueueUsingLL(){
		list = new LinkedList<>();
	}
	
	//enqueue
	public void enqueue(T element) {
		list.add(element);
	}
	
	//dequeue
	public T dequeue() {
		if(isEmpty()) {
			return null;
		}
		return list.removeFirst();
		
	}
	
	//isEmpty
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
}
