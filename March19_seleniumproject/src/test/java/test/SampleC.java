package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SampleC {

	public static void main(String[] args) {
		
		List<Integer> a = new LinkedList<>();  
		List<String> b = new ArrayList<String>();
		List<Integer> c = new Vector<>();
		
		
		
		a.add(20);
		a.add(40);
		a.add(30);
		
		System.out.println(a);
		
		a.add(1, 50);
		
		System.out.println(a);
		
		System.out.println(a.size());

		
		b.add("Hello");
		b.add("good");
		b.add("morning");
		System.out.println(b);
		
		b.add(0, "hello");
		System.out.println(b);
		b.add("very");
		System.out.println(b);
		System.out.println(b.size());
		
		System.out.println(b.get(2));
		System.out.println(b.get(1));
		
		
		a.set(0, 100);
		System.out.println(a);
		
		
		b.set(4, "All");
		System.out.println(b);
		
		
		
		System.out.println(a.indexOf(40));
		
		System.out.println(a.indexOf(50));
		
		System.out.println(b.indexOf("good"));
		
	}

}

