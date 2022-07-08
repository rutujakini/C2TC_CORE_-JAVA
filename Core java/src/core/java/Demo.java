package core.java;

public class Demo {

	int roll;
	String name;
    static String college="SJCEM";
	
	
	Demo(int r, String n){  
		   roll = r;  
		   name = n;  
		   }  
	static void change()
	{
		college="Mumbai University";
	}

	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}

	public static void main(String[] args) {
		
		Demo.change();
	
		Demo s1=new Demo(1,"Riya");
		Demo s2=new Demo(2,"Sara");
		s1.display();
		s2.display();
	

	
	}

}
