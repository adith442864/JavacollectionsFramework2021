package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		Map<String,Integer> marks = new HashMap<String,Integer>();
		
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);
		
		
		marks.put(null, 600);
		
		System.out.println(marks.get("Lisa"));
		
		//hashcode of Lisa -- 210678
		// index=15
		//.equals to check the key name
		//Lisa
		//return value
		
		
//		marks.put(null, 700);
//		marks.put("Nav", 900);
		
		//hashing: hashcode() -> Object class
		
		/*
		 * public V(K key, V value){
		 * int hash = hashCode(key);
		 * int index= mod(n);
		 * n=16 (map size)
		 * 
		 * Node<K,V>
		 * int hash
		 * K key
		 * V value
		 * Node<K,V> next;
		 *
		 * Naveen|210678|100|null
		 * 
		 *hashcode for null value : 0 , index =0
		 *
		 *threshold : 8 nodes are added, it will be converted as balanced tree (O(logn))
		 *
		 * 
		 */
		
		

	}

}
