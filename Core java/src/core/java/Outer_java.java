package core.java;

public class Outer_java {

	
		
			int x=10;
			static int r=500;
			
			static class inner
			{
				public void demo()	
				{
		System.out.println("I am inner class");
		r=300;
		System.out.println();
				}
			}
			public static void main(String[] args) {
			Outer_java.inner obj=new Outer_java.inner();
			obj.demo();
				

}	}


