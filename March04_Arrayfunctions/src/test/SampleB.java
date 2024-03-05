package test;

import java.util.Arrays;

public class SampleB {

	public static void main(String[] args) {
	
		int a[]= {4,7,9,2,5,8,7};
        int b[]= {4,7,9,2,5,8,7};
		
		System.out.println(Arrays.mismatch(a, b));
		System.out.println(Arrays.compare(a, b));
		System.out.println(Arrays.compare(a, a));
		System.out.println(Arrays.compare(b, b));
		
		System.out.println(Arrays.equals(a, b));

		int c[]=new int[40];
		Arrays.fill(c, 20);
		System.out.println(Arrays.toString(c));
	}

}
