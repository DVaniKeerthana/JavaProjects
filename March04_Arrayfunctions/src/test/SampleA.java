package test;

import java.util.Arrays;

public class SampleA {

	public static void main(String[] args) {
           int a[]= {20,53,74,41,83,35,58,68};
           
           System.out.println(Arrays.toString(a));
           
           Arrays.sort(a);
           System.out.println(Arrays.toString(a));
          
           Arrays.copyOfRange(a, 2,4);
           System.out.println(Arrays.toString(a));
               
           System.out.println(a[2]);
           System.out.println(Arrays.toString(a));
           
	}
	
}
