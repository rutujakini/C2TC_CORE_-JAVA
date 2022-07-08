package com.tns.selfstudy;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
ArrayList l =new ArrayList();
l.add("A");
System.out.println(l);
l.add(l);
l.add("B");
l.add("A");
l.add(null);


System.out.println(l);

l.remove(2);
System.out.println(l);

l.add(2,'N');
System.out.println(l);

//l.clear();
//System.out.println(l);
	}

}
