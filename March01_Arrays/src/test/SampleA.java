package test;

public class SampleA {

	public static void main(String[] args) {
		  int a[]=new int[100];
		   a[21]=22;
		   a[77]=57;
		   
		   	System.out.println(a[77]);
		   	System.out.println(a[21]);
		   	
		   	
		  double b[]=new double[200];
		    b[0]=47.5;
		    b[4]=190.7;
		    b[1]=76.8;
		    b[3]=120.7;
		    b[2]=90.7;
		    
		    int index=0;
		    
		    while(index<5)
		    	{
		    	System.out.println(b[index]);
		    	index=index+1;
		    	}
		   

	}

}
