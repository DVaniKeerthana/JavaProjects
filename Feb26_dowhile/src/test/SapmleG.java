package test;

import java.util.Scanner;

public class SapmleG {

		import java.util.Scanner;

		public class SampleF {

			public static void main(String[] args) {
				int a=1;
				Scanner scan=new Scanner(System.in);    
				System.out.println("Enter table value");
				int table=scan.nextInt();
				scan.close();
				
				do
				{
					System.out.print(a+"x"+table+"="+a*table);
					a=a+1;
				}while(a<=10);
				

			}

		}

