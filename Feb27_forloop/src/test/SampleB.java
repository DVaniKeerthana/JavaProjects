package test;

import java.util.Scanner;

public class SampleB {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter value of Table:- ...! ");	
		int table =d.nextInt();
		for(int a=1;a<=5;a=a+1) 
		{
			System.out.println(a+"x"+table+"="+a*table);
		}
           d.close();
	}

}
