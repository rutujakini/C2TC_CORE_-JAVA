package core.java;

public class Overloading_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();	
		 t.m();//method call ... exact match is searched by the complier
			t.m(56);
			t.m(61.20);
			t.m('a');
			}

		}
		class Test
		{
			public void m()
			{
			System.out.println("no Argument");	
			}
			public void m(int i)//type of argument
			

			{
				System.out.println("integer Argument");		
			}
		public void m(double d)
		{
			System.out.println("Double Argument");
		}

		}

	
