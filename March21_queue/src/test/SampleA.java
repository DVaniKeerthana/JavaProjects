package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleA {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();

		
		a.add(10);
		a.add(20);
		System.out.println(a);
		a.addFirst(30);
		System.out.println(a);
		a.addLast(40);
		System.out.println(a);
		a.add(1,200); 
		System.out.println(a);
		a.addAll(Arrays.asList(100,500,700,200));	
		System.out.println(a);
		a.addAll(3,Arrays.asList(2000,4000,7000));
		System.out.println(a);
		
		a.remove();
		System.out.println(a);
		a.removeFirst();
		System.out.println(a);
	    a.removeLast();
	    System.out.println(a);
		a.addAll(3,Arrays.asList(40,10,80));
		System.out.println(a);
		
		a.removeFirstOccurrence(40);
		System.out.println(a);
		
		a.removeLastOccurrence(10);
		System.out.println(a);
		
		a.removeAll(Arrays.asList(200,80,300));
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
	}

	}

