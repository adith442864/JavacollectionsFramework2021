package Set;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {
	
	// Extending Abstractclass and implementing Set Interface
	// it is not synchronized.. high performance java collection member
	// faster than HashSet.
	// All the methods are implemented using Bitwise arithmetic operations
	
	enum Lang{
		JAVA,
		CSharp,
		JAVASCRIPT,
		PYTHON,
		RUBY
	}

	public static void main(String[] args) {
		
		//created a new enumset using enum:
		EnumSet<Lang> langSet = EnumSet.allOf(Lang.class);
		System.out.println(langSet);
		
		//empty enum set:
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		
		//range(e1,e2):
		EnumSet<Lang> range = EnumSet.range(Lang.JAVA, Lang.PYTHON);
		System.out.println(range);
		
		//of
		EnumSet<Lang> cSharpEnum = EnumSet.of(Lang.CSharp);
		System.out.println(cSharpEnum);
		
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.RUBY);
		System.out.println(multipleEnum);
		
		//add and addAll():
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		
		lang2.add(Lang.JAVASCRIPT);
		System.out.println(lang2);
		
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		System.out.println("----------------");
		//iterate enumSet:
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullLang.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.println(" , ");
		}
		
		//remove()and removeAll():
		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println(newLang);
		
		boolean b = newLang.remove(Lang.CSharp);
		System.out.println(b);
		
		System.out.println(newLang);
		
		boolean b1 = newLang.removeAll(newLang);
		System.out.println(b1);
		System.out.println(newLang);
		

	}

}
