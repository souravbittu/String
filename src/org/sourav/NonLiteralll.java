package org.sourav;

public class NonLiteralll {
	
	public static void main(String[] args) {
		String s=new String("Nisha");
		String s1=new String("Rengan");
		String s2=new String("NishaRengan");
	
		
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
