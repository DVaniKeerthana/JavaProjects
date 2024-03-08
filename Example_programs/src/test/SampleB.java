package test;
import java.util.Scanner;
public class SampleB {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		int x=scan.nextInt();
		if(x%2==0)
		{
			System.out.println("Even");
		}
		else 
		{
		    System.out.println("Odd");
		}
	}

}

