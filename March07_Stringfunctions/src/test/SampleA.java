package test;

import java.util.Arrays;

public class SampleA {

	public static void main(String[] args) {
		
		String a="HELLO ALL";
		String b="hope you all are doing good";
		String c="HAvE A NICEDAY";
		String d="thankyou all";
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		System.out.println(d.length());
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toUpperCase());
		System.out.println(c.toUpperCase());
		System.out.println(d.toUpperCase());
		
		System.out.println(a.toLowerCase());
		System.out.println(c.toLowerCase());
		
		System.out.println(Arrays.toString(a.split("O")));
		System.out.println(Arrays.toString(b.split("ll")));
		
		System.out.println(a.replace("L", "l"));
		System.out.println(c.replace("NICE", "BEAUTIFULL "));
		
		System.out.println(b.indexOf("i"));
		System.out.println(d.lastIndexOf("l"));
		
		System.out.println(a.contains("LLO"));
		System.out.println(c.contains("IE"));
		
		System.out.println(b.equals(d));
		System.out.println(a.equals(c));
		
		System.out.println(a.startsWith("H"));
		System.out.println(c.startsWith("h"));
		
		System.out.println(b.endsWith("od"));
		System.out.println(d.endsWith("ll"));

	}

}
