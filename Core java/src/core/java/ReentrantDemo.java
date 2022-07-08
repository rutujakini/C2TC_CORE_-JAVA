package core.java;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {

	public static void main(String[] args) {
		
		ReentrantLock m=new ReentrantLock();
		m.lock();
   System.out.println(m.isLocked());
   System.out.println(m.isHeldByCurrentThread());
   System.out.println(m.getQueueLength());
   System.out.println(m.getHoldCount());

	}

}
