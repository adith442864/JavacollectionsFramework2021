package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListVirtualCapacity {

	public static void main(String[] args) {
		
		
		ArrayList<Object> ar = new ArrayList<Object>(20);
		System.out.println(ar.size()); //0
		
		//default virtual capacity : 0 to 9
		
		ar.add(100);
		System.out.println(ar.size());
		
		
		ar.add(200);
		ar.add(300);
		ar.add(500);
		
		System.out.println(ar.size());
		
	}

}
