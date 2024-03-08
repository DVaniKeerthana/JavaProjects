package test;

public class SampleC {

		public int a=20;
		public static int b=50;

		public static void main(String[] args) {
		System.out.println(b);
		
		SampleC d=new SampleC();
		d.testing();
		}
			public void test()
			{
				System.out.println(this.a+b);
			}
			public void testing()
			{
				this.test();
			}

	}


