package com.tns.selfstudy;

interface Anonymous
{
	void show();
}

public class LambdaDemo {

	public static void main(String[] args) {
		Anonymous l=()->
	{
		
System.out.println("lambda Demo Print");
	};
	
l.show();

}
}