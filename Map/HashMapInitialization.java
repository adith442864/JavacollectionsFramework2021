package Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	
	public static Map<String,Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		
	}

	public static void main(String[] args) {
		
		//1. using HashMap class:
		
		HashMap<String,String> map1=new HashMap<>();
		
		Map<String,String> map2=new HashMap<>();
		
		//2. static way: static hashmap:
		System.out.println(HashMapInitialization.marksMap.get("A"));
		
		//3. immutableMap with only one single entry:
		
		Map<String,Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
//		map3.put("abc", 200);//UnsupportedOperationException
		
		//4. JDK 1.8 : creating 2D array of Strings using Stream and collecting in the form map
		
		Map<String,String> map4 = Stream.of(new String[][]{
			{"Tom", "A Grade"},
			{"Naveen","A+ Grade"},
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++Grade");
		System.out.println(map4.get("Lisa"));
		
		//5. using simpleEntry: mutable method using javaStream
		Map<String,String> map5 = Stream.of (
		new AbstractMap.SimpleEntry<>("Naveen","Java"),
		new AbstractMap.SimpleEntry<>("Tom","Java")	
		).collect(Collectors.toMap(Map.Entry::getKey,  Map.Entry::getValue));
		
		System.out.println(map5.get("Naveen"));
		map5.put("Lisa", "C#");
		System.out.println(map5.get("Lisa"));
		
		//6. JDK 1.9:
		
		// empty map:
		Map<String,String> emptyMap = Map.of();
		//emptyMap.put("Tom", "Python");
		//System.out.println(emptyMap.get("Tom")); //UnsupportedOperationException
		
		//singleton Map
		Map<String,String> singletonMap = Map.of("k1","v1");
		System.out.println(singletonMap.get("k1"));
//		singletonMap.put("k2", "v2"); ////UnsupportedOperationException
		
		//multivalues Map: max 10 pairs can be stored:
		Map<String,String> multiMap = Map.of("k1","v1","k2","v2","k3","v3");
		System.out.println(multiMap.get("k3"));
		
		//OfEntries method: no limiations on paris(k,v)
		//immutable - cannot change the values
		Map<String,Integer> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("C",300)
				);
		
		System.out.println(map7.get("C"));
		
		map7.put("D", 400);
		//System.out.println(map7.get("D")); //java.lang.UnsupportedOperationException
		
		//using guava:
//		Map<String,String> titleMaps = ImmutableMap.of("Google","Google India");
		
		
		
		
		

	}

}
