package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		// does not maintain any index -- no order
		// stores value -- Key,Value(k,v) pair
		// key cannot be duplicate
		// can store n number of null values but one one null key
		// hashmap is not thread-safe - unsynchronized..
		
		
		HashMap<String,String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London12");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA"); 
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		//remove
		capitalMap.remove("France");
		
		System.out.println(capitalMap.get("USA"));
//		System.out.println(capitalMap.get("Germany")); //null
		System.out.println(capitalMap.get("UK")); 
		
		System.out.println(capitalMap.get(null)); 
		System.out.println(capitalMap.get("France")); 
		System.out.println(capitalMap.get("Russia")); 
		
		System.out.println("------------");
		
		//fetch the values/traverse
		//iterator: over the keys: by using keySet()
		Iterator<String> it =capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key = "+key+" value = " +value);
		}
		
		System.out.println("----------");
		
		//iterator: over the keys: by using entrySet()
		Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,String> entry = it1.next();
			System.out.println("key = "+entry.getKey()+" and value = "+entry.getValue());
		}
		
		System.out.println("----------------");
		
		//iterate hashmap using Java 8 for each and lambda:
		capitalMap.forEach((k,v)->System.out.println("key =" +k +"value = " +v));
		

	}

}
