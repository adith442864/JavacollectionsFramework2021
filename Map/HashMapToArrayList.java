package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
	
		HashMap<String,Integer> compMap = new HashMap<String,Integer>();
		compMap.put("Google", 1000);
		compMap.put("Walmart", 2000);
		compMap.put("Amazon", 3000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 4000);
		
		System.out.println("comp map size : " +compMap.size());
		
		Iterator it = compMap.entrySet().iterator();
		
		//printing all values from hashMap:
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey()+" "+pairs.getValue());
		}
		
		//lambda expression:
		compMap.forEach((k,v)-> System.out.println("key = "+k+" and value ="+v));
		
		System.out.println("------------------");
		//convert hashMap keys into ArrayList:
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		
		System.out.println(compNameList);
		
		for(String t : compNameList) {
			System.out.println(t);
		}
		
		System.out.println("--------------------------");
		
		//convert hashMap values into ArrayList:
		List<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
		System.out.println(empValuesList);
		for(Integer t : empValuesList) {
			System.out.println(t);
		}
		
		
		
		
		

	}

}
