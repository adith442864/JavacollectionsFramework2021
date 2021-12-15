package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
		
	}
}

public class PriorityQueueWithStringLength {

	public static void main(String[] args) {
		
		MyComparator comparator = new MyComparator();
		PriorityQueue<String> pr = new PriorityQueue<String>(10, comparator);
		
		pr.add("A");
		pr.add("AB");
		pr.add("ABC");
		pr.add("ABCD");
		pr.add("ABCDE");
		
		System.out.println(pr.poll());

	}

}
