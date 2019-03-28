package org.sourav;
import java.util.Scanner;

public class LowerCase {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("input");
	String s=input.nextLine();
	String l = s.toLowerCase();
	System.out.println(l);
	
	Scanner upper=new Scanner(System.in);
	System.out.println("input 1");
	String s1=upper.nextLine();
	String u = s1.toUpperCase();
	System.out.println("in upper case  "+u);
}
}
