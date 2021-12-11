package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom"); //0
		studentList.add("Naveen"); //1
		studentList.add("Steve"); //2
		studentList.add("Lisa"); //3
		
		//1. for loop:
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("-------------");
		
		//2. for each:
		for(String s:studentList) {
			System.out.println(s);
		}
		
		System.out.println("-------------------");
		
		//3. Iterator:
		Iterator it = studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------");
		
		//4. Streams with Lambda
		studentList.stream().forEach(ele->System.out.println(ele));

	}

}
