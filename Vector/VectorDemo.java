package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		myVector.add(14);
		myVector.add(16);
		
		System.out.println(myVector);
		System.out.println(myVector.get(2));
		
		myVector.remove(3);
		System.out.println(myVector);
		
		Vector<Integer> yourVector = new Vector<Integer>();
		yourVector.add(10);
		yourVector.add(20);
		
		myVector.addAll(yourVector);
		System.out.println(myVector);
		
		//traverse
		for(Integer e:myVector) {
			System.out.println(e);
		}
		
		// for loop:
		for(int p=0; p<myVector.size(); p++) {
			System.out.println(myVector.get(p));
		}
		
		//iterator:
		Iterator it = myVector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//sort:
		Collections.sort(myVector);
		System.out.println(myVector);
		
		//2d Vector:
		
		

	}

}
