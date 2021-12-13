package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		//synchronizedMap method in collections class
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1", "Tom");
		map1.put("2", "Naveen");

		map1.put("3", "Lisa");
		
		Map<String,String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//concurrent hashMap:
		//it does not throw any ConcurrentModificationException:
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String,String>();
		
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Python");
		concurrentMap.put("C", "Ruby");
		
		System.out.println(concurrentMap.get("A"));
		System.out.println(concurrentMap);
		

	}

}
