package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleB {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>();
		
		Integer[] b = {10,20,40,50,80,120,33,65,60};
		
		a.addAll(Arrays.asList(b));
		
		System.out.println(a);
		
		
		System.out.println(a.contains(12));
		
		System.out.println(a.contains(40));
		
		System.out.println(a.containsAll(Arrays.asList(40,50,120)));//true
		
		System.out.println(a.containsAll(Arrays.asList(10,20,30)));
		
		LinkedList<Integer> c = new LinkedList<Integer>();
		
		c = (LinkedList) a.clone();
		
		System.out.println(c);
		
		
		System.out.println(a.equals(Arrays.asList(10,20,30,50,80)));
		
		System.out.println(a.equals(c));
		
		a.add(7000);
		
		System.out.println(a);
		System.out.println(c);
		
		System.out.println(a.equals(c));
		

	}

}
