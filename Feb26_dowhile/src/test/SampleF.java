package test;

import java.util.Scanner;

public class SampleF {

	public static void main(String[] args) {
		int a=1;
		Scanner scan=new Scanner(System.in);    
		System.out.println("Enter table value");
		int table=scan.nextInt();
		scan.close();
		 
		scan.close();
		
		do
		{
			System.out.print(a);
			System.out.print("x");
			System.out.print(table);
			System.out.print("=");
			System.out.println(a*table);
			a=a+1;
		}while(a<=10);
		

	}


}
