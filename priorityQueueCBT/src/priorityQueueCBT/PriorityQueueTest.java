package priorityQueueCBT;

public class PriorityQueueTest {

	public static void main(String[] args) throws PrioritQueueException {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("hdh", 90);
		pq.insert("dfdfhfsgh", 150);
		pq.insert("hgsfsdf", 120);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
		
	}

}
