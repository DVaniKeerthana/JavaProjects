package test;

import java.util.Arrays;

public class SampleB {

	public static void main(String[] args) {
		 int a[]={3,4,5,6,7};
		 int b[]=a;
		 
		 System.out.println(a);
		 
		 int c[]=Arrays.copyOf(a,a.length);
		 
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
		 System.out.println(Arrays.toString(c));
		 
		  c[3]=5;
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
		 System.out.println(Arrays.toString(c));

	}

}
