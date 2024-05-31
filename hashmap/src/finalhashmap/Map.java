package finalhashmap;
//import ing the arraylist libray
import java.util.ArrayList;

public class Map<K,V> {
	
	//i need to make ArrayList bucket
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int numBuckets;
	
	public Map() {
		numBuckets = 5;
		buckets = new ArrayList<>();
		for(int i = 0;i<numBuckets;i++) {
			buckets.add(null);
		}
	}
	
	// size of the hashTable i.e number od nodes present
	public int  size() {
		return count;
	}
	
	//to get the value if the respective key
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	//to get the hashCode methods from the parent Object class
	private int getBucketIndex(K key){
		int hc = key.hashCode();
		return hc % numBuckets;	 
	}
	
	//to remove the node and return its value
	public V removeNode(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		MapNode<K,V> prev = null;
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev != null) {
					prev.next = head.next;
				}
				else {
					buckets.set(bucketIndex, head.next);
				}
				count--;
				return head.value;
			}
			prev= head;
			head = head.next; 
				
		}
		
		return null;
	}
	
	private void reHash() {
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets = new ArrayList<>();
		for(int i = 0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		count = 0;
		numBuckets = numBuckets*2;
		for(int i = 0;i<temp.size();i++) {
			MapNode<K,V> head = temp.get(i);
			while(head != null) {
				K key = head.key;
				V value = head.value;
				insert(key,value);
				head = head.next;
			}
		}
		
		
	}
	
	// load_factor function
	public double loadFactor() {
		return (1.0*count)/numBuckets;
	}
	
	
	//inserting or updating the key
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> newNode = new MapNode<>(key, value);// creating the new node of MapNode type
		MapNode<K,V> head = buckets.get(bucketIndex);
		//Element is already there? just update its value
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		//Element is not there. insert at 0th position of the linked list
		head = buckets.get(bucketIndex);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		// rehashing for better time complexity
		//load factor > 0.7
		double load_factor = (1.0*count)/numBuckets;
		if(load_factor > 0.7) {
			reHash();
		}
		
	}

	

}
