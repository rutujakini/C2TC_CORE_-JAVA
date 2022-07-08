package com.tns.selfstudy;
public class Inheritance {
	public static void main(String[] args) {
	a a1=new a();

	a1.v();
	}

}
class a extends b{

}
class b {
	int s=1;
	int y=2;
	int z=s+y;
	
	void v()// apply method
	{
		System.out.println("z is:"+z);
	}
}