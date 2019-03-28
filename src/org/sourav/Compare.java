package org.sourav;
import java.util.Scanner;

public class Compare {
public static void main(String[] args) {
	Scanner input1=new Scanner(System.in);
	System.out.println("1st string is");
	String s=input1.nextLine();
	
	Scanner input2=new Scanner(System.in);
	System.out.println("enter 2nd string");
	String s1=input2.nextLine();
	
	int c = s.compareTo(s1);
	System.out.println(c);
}
}
