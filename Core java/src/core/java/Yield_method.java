
package core.java;

public class Yield_method {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		Thread obj=new Thread(t);//for runnable interface create new thread 
		
		obj.start();
	
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
	}

}
}
class MyThread extends Thread
//class MyThread extends Thread//runnable
{
public void run()	
{
	for (int i=0;i<10;i++)
	{
		System.out.println("Child Thread...");
		Thread.yield();
	}
}}