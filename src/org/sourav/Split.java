package org.sourav;

public class Split {
	
	public static void main(String[] args) {
		
	String s="welcome to java class";
	System.out.println(s);
	
	String[] split = s.split("l");
	
	for (String s1 : split) {
		System.out.println(s1);
		
	}
		
	}

}
