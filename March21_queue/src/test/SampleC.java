package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleC {

	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		System.out.println(a.size());
		a.addAll(Arrays.asList(100,200,400,700));
		a.addAll(3,Arrays.asList(4000,5000,7000));
		System.out.println(a);
		
		a.offer(200);
		System.out.println(a);
		
		a.offerFirst(1000);
		System.out.println(a);
		
		a.offerLast(4000);
		System.out.println(a);
		
		System.out.println(a.get(3));
		
		System.out.println(a.getFirst());
		
		System.out.println(a.getLast());
		
		System.out.println(a.peek());
		
		System.out.println(a.peekFirst());
		
		System.out.println(a.peekLast());
		
		
		System.out.println(a.poll());
		System.out.println(a);
		
		System.out.println(a.pollFirst());
		System.out.println(a);
		
		System.out.println(a.pollLast());
		System.out.println(a);
		
		a.pop();//remove a value in list 
		System.out.println(a);
		
		a.push(1234);
		System.out.println(a);
		
		
		
	}

}

