package core.java;

class MyThread extends Thread
{
public void run()	
{
	for (int i=0;i<10;i++)
	{
		System.out.println("Child Thread...");
		
	}

try 
{
	Thread.sleep(1000);
}
catch(InterruptedException e) {
}
}}
public class Join_method {
	
	public static void main(String[] args)throws InterruptedException 
	{
		
		MyThread t=new MyThread();
		//Thread obj=new Thread(t);//for runnable interface create new thread 
		t.start();
		
		//obj.start();
	t.join();
		//obj.join();//main method invoking
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
	}

}
}