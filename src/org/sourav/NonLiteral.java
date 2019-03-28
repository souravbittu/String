package org.sourav;

public interface NonLiteral {
	
public static void main(String[] args) {
	String s=new String("Nisha");
	String s1=new String("Nisha");
	
System.out.println(s);
System.out.println(s1);

int i = System.identityHashCode(s);
int i1 = System.identityHashCode(s1);

System.out.println(i);
System.out.println(i1);
	
	
}

}
