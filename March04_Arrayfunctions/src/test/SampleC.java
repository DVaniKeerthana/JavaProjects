package test;

import java.util.Arrays;

public class SampleC {

	public static void main(String[] args) {

		int[][] a= {{22,24},{30,33}};
		
		
		int[][] b = {{22,24},{34,33}};
		
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		
		int[][] c= new int[2][3];
		
		c[0][0] = 22;
		c[0][1] = 24;
		c[0][2] = 26;
		c[1][1] = 34;
		c[1][1] = 33;
		c[1][2]= 56;
		
		System.out.println("Two Dimensional Arrays");
	
		for(int row=0;row<=1;row=row+1)
		{
			for(int col=0;col<=2;col=col+1)
			{
				System.out.println(c[row][col]);
			}
		}
		
		
		System.out.println(Arrays.deepEquals(a,b));
		
		System.out.println(Arrays.toString(c));
		for(int[] x2:c)
		{
			for(int x3:x2)
			{
			System.out.println(x3);
			}
		}


	}

}
