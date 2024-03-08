package test;

public class SampleB extends SampleA {

	public static void main(String[] args) {
		SampleB c=new SampleB();
		c.mul(2, 4);
		

	}
         public void mul(int a,int b)
         {
        	 System.out.println(a*a*a+b*b*b);
         }
}
