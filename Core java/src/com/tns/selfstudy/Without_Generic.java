package com.tns.selfstudy;
import java.util.ArrayList;
public class Without_Generic {

	public static void main(String[] args) {
		

ArrayList myArrayList = new ArrayList();
myArrayList.add(10);  //Integer value
myArrayList.add("RUTUJA"); //String value
myArrayList.add(20.2); //Double value

int x = (int) myArrayList.get(0);//object typecasted into integer
System.out.println(x);

}
}