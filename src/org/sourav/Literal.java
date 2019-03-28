package org.sourav;

public class Literal {
	
	public static void main(String[] args) {
	String name="Nisha";
	String name1="Nisha";
	System.out.println(name);
	System.out.println(name);

	int i = System.identityHashCode(name);
	int i1 = System.identityHashCode(name1);
	
	System.out.println(i);
	System.out.println(i1);
	
	}

}
