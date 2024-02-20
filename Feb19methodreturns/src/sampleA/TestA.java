package sampleA;

public class TestA {

	public static void main(String[] args) {
		
		addTwovalues(20,30);
		addTwovalues(70,90);
		addThreevalues(60,340,880);
		addThreevalues(90,550,660);
		addThreevalues(40,60,880);
		addThreevalues(30,60,900);
		addThreevalues(40,70,400);
		addThreevalues(250,60,60);
		addTwovalues(220,340);
		addTwovalues(204,390);
		addTwovalues(299,304);
		addTwovalues(203,330);
		
	}	
		
		public static void addTwovalues(int v,int k)
		{
		System.out.println(v+k);	
		}
		public static void addThreevalues(int e,int f,int g)
		{
			System.out.println(e+f+g);
		}
}
