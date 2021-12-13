package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		//1. Using Sort and then equals:
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2)); //false
		
		Collections.sort(l3);
		System.out.println(l1.equals(l3)); //true
		
		//2. compare two list - find out additinal elements:
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
//		l4.removeAll(l5);
//		System.out.println(l4); //[F] -- additonal element available in l4 not in l5
		
		//3. findout missing element:
		l5.removeAll(l4);
		System.out.println(l5); //[E]
		
		//4. findout the common elements:
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","ruby","c#","js"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","ruby","c#","php"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		
	}

}
