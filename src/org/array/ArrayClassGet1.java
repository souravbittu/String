package org.array;

import java.util.ArrayList;

public class ArrayClassGet1 {
public static void main(String[] args) {
	
 ArrayList<Integer> a=new ArrayList<Integer>();
 
    a.add(105);
	a.add(205);
	a.add(305);
	a.add(405);
	a.add(505);
	a.add(605);
    a.add(705);
    a.add(805);
 
    int size = a.size();
   System.out.println(size);

for(int i=0;i<a.size();i++) {
	
	System.out.println(a.get(i));
	
	}

}
}
