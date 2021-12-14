package Vector;

import java.util.Vector;

public class Vector2DConcept {

	public static void main(String[] args) {
		
		Vector<String> langVector = new Vector<>();
		langVector.add("Java");
		langVector.add("Python");
		langVector.add("Ruby");
		langVector.add("JavaScript");
		langVector.add("c#");
		
		
		Vector osVector = new Vector();
		osVector.add(langVector);
		
		for(int i=0; i<langVector.size(); i++) {
			String str = (String) ((Vector<String>) osVector.get(0)).get(i);
			System.out.println(str);
		}
		

	}

}
