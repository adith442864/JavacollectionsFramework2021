package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistMethods {

	public static void main(String[] args) {
		
		//LinkedList is a default class in Java
		// it can be used as List, Stack, Queue 
		//it allows the null entry
		// dynamic collections - hence insertion and deletion can be implemented
		// it can contain duplicate elements
		// it is not synchronized - thread-safe
		// in LL, manipulation is fast as compared to AL, we don't need any shifting
		
		
		// LL Constructors:
			// 1. LinkedList()
			// 2. LinkedList(Collections c)
		
		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size()); //0
		
		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Lisa");
		
		System.out.println(names.size());
		System.out.println(names);
		
		System.out.println(names.get(0));
		
		//iterate:
//		for(String s:names) {
//			System.out.println(s);
//		}
		
		System.out.println("-------------");
		
		Iterator it  = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(4, "Steve");
		System.out.println(names);
		
		
		names.add(2, "Ram"); //Ram is added at index 2, previous name will be shifted...
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>();
		users.add("Peter");
		users.add("Trump");
		
		names.addAll(users);
		System.out.println(names);
		
		
		names.addFirst("Kamala");
		System.out.println(names);
		
		names.addLast("Shivin");
		System.out.println(names);
		
		
		//remove
		names.remove(2);
		System.out.println(names);
		
		names.removeAll(users);
		System.out.println(names);
		
		
		names.removeFirst();
		names.removeLast();
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(names.size()); //0
		
		lang.add("Java");
		lang.add("Python");
		lang.add("Ruby");
		lang.add("Javascript");
		
		System.out.println(lang.size());
		
		//reverse the linked list:
		Iterator itr = lang.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sort:
		Collections.sort(lang);
		System.out.println(lang);

	}

}
