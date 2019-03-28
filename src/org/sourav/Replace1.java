package org.sourav;
import java.util.Scanner;

public class Replace1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your mail id");
		String s=input.nextLine();
		
		//boolean b = s.contains("gmail");
		
		if(s.contains("gmail"))
			
		{
			
			String r = s.replace("gmail", "yahoo");
			System.out.println("Replaced email id"+r);
		}
	}
}
