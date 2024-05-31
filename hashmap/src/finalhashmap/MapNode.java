package finalhashmap;

public class MapNode<K,V> {
	//instance components of linked list
	K key;
	V value;
	MapNode<K,V> next;
	//making constructor to initialize the instance members
	public MapNode(K key, V value) {
		this.key =key;
		this.value = value;
	}
	
	
}
