package core.java;

public class StaticDemo {
	int roll;
	String name;
    static String college="St.john college of engineering and management";
	
	void display()
	{
		System.out.println(roll+" "+name+" "+college);	
	}
	   
	static void change()
	{
		college="Mumbai University";
	}

	
	
	public  StaticDemo(String name,int roll) {
		super();
		this.name=name;
		this.roll=roll;
	
	}
	
	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo("AAA",1);
		StaticDemo s2=new StaticDemo("BBB",2);
		s1.display();
		s2.display();
		
		StaticDemo.change();
		s1.display();
		s2.display();
	}

	
	}


	
	