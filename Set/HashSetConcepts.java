package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		
		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("testing");
		hs.add("Beta");
		hs.add("Gama");
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.contains("testing"));
		
		//for each loop:
		for(String e: hs) {
			System.out.println(e);
		}
		
		System.out.println("--------------");
		
		//iterator:
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.remove("Beta");
		System.out.println(hs);
		
		//mathematical operations:
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,4,3,4,5,3,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,0,9}));
		
		//get the union:
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("------------------");
		
		//get the intersection from two sets:
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		System.out.println("-------------------");
		
		//get the difference:
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
		
		
		
		

	}

}
