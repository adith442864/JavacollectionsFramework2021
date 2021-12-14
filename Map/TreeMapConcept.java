package Map;

import java.net.Socket;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		// TreeMap is implementing SortedMap Interface -> Map
		// maintains red-black tree which is a type of binary tree.
		// hasing concept is not allowed...
		// all black nodes are equal from root to NULL Nodes...
		
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(12000, "Naveen");
		map.put(1300, "Robby");
		
		System.out.println(map);
		
		map.forEach((k,v)->System.out.println("key = "+k+" value ="+v));
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		Set<Integer> keys = map.headMap(3000).keySet();
		System.out.println(keys);
		
		Set<Integer> keysgreater = map.tailMap(3000).keySet();
		System.out.println(keysgreater);
		
		System.out.println("---------------------");

		TreeMap<String,Integer> userMap = new TreeMap<>();
		
		userMap.put("James", 100);
		userMap.put("Brad",  200);
		userMap.put("Albert",400);
		userMap.put("George",300);
		userMap.put("Larry", 50);
		userMap.put("Ted",   120);
		userMap.put("Paul",  700);
		
		//sorting the keys in ascending:
		userMap.forEach((k,v)->System.out.println("key is ="+k+"value is "+v));
	
		
		
		System.out.println("------------------");
	
		//descending order:

		TreeMap<Integer,String> map1 = new TreeMap<>(Comparator.reverseOrder());
		map1.put(1000, "Tom");
		map.put(2000, "Peter");
		map1.put(3000, "Steve");
		map1.put(12000, "Naveen");
		map1.put(1300, "Robby");
		
		System.out.println(map1);
		
		
		
		
		
		
		
		

	}

}
