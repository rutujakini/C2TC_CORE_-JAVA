package core.java;
//
//public class Overriding_ {

	
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//
//		}
//
//	}
//	class Parent
//	{
//		void property()
//	{
//			System.out.println("house...monet...jwellery");
//	}
//		void marry()
//		{
//			System.out.println("xxxx");//defination
//		
////	class Child extends Parent
////	//
////void marry()
////		System.out.println("hgf huusubns");
////		
//	}
	//}

//}
public class Overriding_ {
	public static void main(String[] args) {
		child c=new child();
		c.property();
		c.marry();

	}
	static class parent {
		public void property() {
			System.out.println("you we get all my property");
		}
		public void marry() {
			System.out.println("you we have to marry whoever I say");

		}
	}
	 static class child extends parent{
		public void marry() {
			System.out.println("I Want to marry .... ");

		}
	}}
