package com.tns.selfstudy;

public class Generic_2 {

	public static void main(String[] args) {
	a a1=new a();
	a1.my(10);
	a1.my("hii");
	

	}

}
class a<k>
{
	void my(k b)
	{
		System.out.println("b is:" +b);
	}
}