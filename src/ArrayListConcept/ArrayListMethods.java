package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Testing");
		ar2.add("dev ops");
		
		//combine two arraylist:
//		ar1.addAll(ar2);
//		System.out.println(ar1);
		
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);
		
		//clear:empty arrayList
//		ar1.clear();
//		System.out.println(ar1);
		
		//clone:
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		//contains:
		System.out.println(ar1.contains("python"));
		System.out.println(ar1.contains("c"));
		
		//index of
		System.out.println(ar1.indexOf("ruby")>0);
		
		//lastIndexOf
		ArrayList<String> list1 = 
				new ArrayList<String>(Arrays.asList("Tom","Scott","Steve","Lisa","Tom"));
		System.out.println(list1); //not available, -1
		System.out.println(list1.lastIndexOf("Tom"));
		
		//remove:
		list1.remove(4);
		System.out.println(list1);
		
		list1.remove("Scott");
		System.out.println(list1);
		
		//removeif:
		ArrayList<Integer> numbers = 
				new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers);
		
		//retailAll -> retain only those values using singleton method:
		ArrayList<String> namesList = 
				new ArrayList<String>(Arrays.asList("Tom","Scott","Steve","Lisa","Tom"));
		System.out.println(namesList);
		namesList.retainAll(Collections.singleton("Tom"));
		System.out.println(namesList);
		
		//subList from main ArrayList:L
		ArrayList<Integer> numbers1 = new 
				ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);
		
		//ToArray -> convert ArrayList to Array:
		ArrayList<String> newList = 
				new ArrayList<String>(Arrays.asList("Tom","Scott","Steve","Lisa","Tom","Robert"));
		
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		//traverse:for loop:
		for(Object o :arr) {
			System.out.println((String)o);
		}
		
		
		
	}

}
