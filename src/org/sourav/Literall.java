package org.sourav;

public class Literall {
	
	public static void main(String[] args) {
		String s="Nisha";
		String s1="Rengan";
		String s2="NishaRengan";
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		int i = System.identityHashCode(s);
		int i1 = System.identityHashCode(s1);
		int i2 = System.identityHashCode(s2);
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		
	}

}
