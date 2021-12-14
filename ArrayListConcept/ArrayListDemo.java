package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//default class
		//dynamic array
		//store data on basis of index
		
		//static Array:
		int i[] = new int[4];
		i[0]=100;
		System.out.println(i[0]);
		System.out.println(i[3]);
//		System.out.println(i[4]); //indexIndexOutOfBoundsException
		
		//default generics:
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar);
		
		System.out.println(ar.get(2));
//		System.out.println(ar.get(-1));	//indexIndexOutOfBoundsException
//		System.out.println(ar.get(5)); //indexIndexOutOfBoundsException
		System.out.println(ar.size());
		
		System.out.println("LI = " +0);
		System.out.println("HI = " +(ar.size()-1));
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		
		//create ArrayList with other collections:
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","python","ruby","JS","PHP"));
		System.out.println(names);
		System.out.println(names.size());
		
		

	}

}
