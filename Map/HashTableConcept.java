package Map;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		/*
		 * JDK 1.1
		 * Legacy Collection API
		 * <k,v>
		 * HT is synchronized
		 * it does not allow any null key and null values
		 * initial capacity of HT =11, Load Factor = 0.75
		 * implementation of Map Interface
		 *
		 */
		Hashtable<String, Integer> marks = new Hashtable<>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);
//		marks.put(null, 700); // java.lang.NullPointerException
//		marks.put("test", null); //java.lang.NullPointerException

		System.out.println(marks.get("Naveen"));
		System.out.println(marks.get("Peter"));
//		System.out.println(marks.get("test"));
		System.out.println(marks);







	}

}
