package hashmap;

//library
import java.util.HashMap;
import java.util.Set;

public class BasicOfHashMap {
	
//System.out.println();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating object for the HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// map. put("key", value);
		map.put("abc", 1);
		map.put("bcd", 2);
		System.out.println(map);
		
		// map.ize
		System.out.println("map size : "+ map.size());
		
		//presence of key  => map.containsKey("Key")
		System.out.println(map.containsKey("abc"));
		
		// to get the value of the key => map.get("Key");
		if(map.containsKey("abc")) {
			int val1 = map.get("abc");
			System.out.println(val1);
		}
		
		//removing the key value from the hashmap
		if(map.containsKey("abc")) {
			map.remove("abc"); // => map.remove("key");
		}
		map.remove("key");// does nothing as the key is already 
						  // not present in hashMap
		System.out.println(map);
		System.out.println("map size : "+map.size());
		
		
		//while inserting the same existing key
		// the excited key's value will get updated
		map.put("bcd", 100);
		System.out.println(map);
		System.out.println(map.size());
		
		// inserting few keys and printing the map and size
		map.put("abc", 100);
		map.put("dhan", 300);
		map.put("vanth", 400);
		map.put("sb", 500);
		System.out.println(map);
		System.out.println(map.size());
		
		//iterate the hashmap
		Set<String> keys =map.keySet();
		for(String key : keys) {
			System.out.println(key);
			
		}

	}

}
