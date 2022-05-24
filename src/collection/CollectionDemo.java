package collection;

import java.util.ArrayList;

public class CollectionDemo {
	
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Apurva");
		a1.add("Apurva");
		a1.add("Apu");
		System.out.println(a1);
		
		
		System.out.println(a1.get(0));
		
		a1.remove(1);
		System.out.println(a1);
		
		a1.add(2, "ABC");
		System.out.println(a1);
		
		a1.add(3, "ABC");
		System.out.println(a1);
		
		a1.set(1, "Rupali");
		System.out.println(a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Abc");
		a2.add("Xyz");
		a2.add("BCS");
		a2.add("AXT");
		
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		boolean ispresent=a1.contains("Rupali");
		
		System.out.println(ispresent);
		
		boolean isavailable = a1.containsAll(a1);
		System.out.println(isavailable);
		
		a1.removeAll(a2);
		System.out.println(a1);
		
		System.out.println(a1.remove("Apurva"));
		
		System.out.println(a1);
		
		a2.retainAll(a1);
		System.out.println(a1);
		
	}

}
