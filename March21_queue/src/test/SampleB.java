package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleB {

	public static void main(String[] args) {
	LinkedList<Integer> a = new LinkedList<Integer>	();
	
	System.out.println(a.size());
	a.addAll(Arrays.asList(200,400,700,800));
	a.addAll(3,Arrays.asList(2000,4000,7000));
	System.out.println(a);
	
	System.out.println(a.size());
	System.out.println(a.contains(800));
	System.out.println(a.contains(7000));
	
	System.out.println(a.containsAll(Arrays.asList(700,200,4000)));
	System.out.println(a.containsAll(Arrays.asList(200,500,4000)));
	
	
	System.out.println(a.equals(Arrays.asList(100, 200, 400, 4000, 7000, 8000)));
	System.out.println(a.equals(Arrays.asList(100, 200, 300, 500, 6000)));
	
	System.out.println(a.isEmpty());
	a.clear();
	System.out.println(a);
	
	System.out.println(a.isEmpty());
	
	System.out.println(a.size());
}

}
	
