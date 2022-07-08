package core.java;

public class Static_ {

	int roll;
	String name;
    static String college="St.john college of engineering and management";
	
	void display()
	{
		System.out.println(roll+" "+name+" "+college);	
	}
//	Static_(int r, String n){  
//		   roll = r;  
//		   name = n;  
		   
	static void change()
	{
		college="Mumbai University";
	}

	
	
	public  Static_(String name,int roll) {
		super();
		this.name=name;
		this.roll=roll;
	
	}
	
	public static void main(String[] args) {
		Static_ s1=new Static_("AAA",1);
		Static_ s2=new Static_("BBB",2);
		s1.display();
		s2.display();
		
		Static_.change();
		s1.display();
		s2.display();
	}

	
	}


	