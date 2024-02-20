package sampleB;

public class TestB {
	
	public static void main(String[] args) {
		mul(1.2,3.4);
		mul(5.5,4.5);
		mul(8.888,6.7,4.4);
		mul(7.5,2.3,5.4);
	}
		
	
	public static void mul(double a,double b)
	{
		System.out.println(a*b);
	}
	public static void mul(double d,double e,double f)
	{
		System.out.println(d*e*f);
		
	}

}
