package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleA {

	public static void main(String[] args) {
		
	List<Integer> a = new LinkedList<>();
	
		
		Integer[] b = {10,20,30,50,80,120,33,65,60};
		
		a.addAll(Arrays.asList(b));
		
		System.out.println(a);
		
		
		a.remove(3);//only index
		
		System.out.println(a);
		
		
		List<String> x= new LinkedList<String>();
		
		x.add("I");
		x.add("am");
		x.add("Vani");
		x.add("Keerthana");
		
		System.out.println(a);
		
		
		a.remove("am");
		
		System.out.println(a);
		
		a.remove(4);
		
		System.out.println(a);
		
		a.removeAll(Arrays.asList(40,30,20,70));
		
		
		System.out.println(a);
		
		
		x.removeAll(Arrays.asList("Keerthana"));
		
		System.out.println(x);
		
		
		System.out.println(a.isEmpty());
		
		a.clear();
		
		
		System.out.println(a);
		
		
		System.out.println(a.isEmpty());

	}

}

