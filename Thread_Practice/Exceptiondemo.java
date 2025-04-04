package Thread_Practice;

class stuff extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		Thread t=new Thread();
		t.start();
	}
}
public class Exceptiondemo {

	public static void main(String[] args) throws InterruptedException 
	{
//		Thread t=new Thread();
//		t.start();
		stuff s1=new stuff();
		stuff s2=new stuff();
		System.out.println("Thread is avalaible or not :"+s1.isAlive());
		s1.start();
//		s2.join();
		System.out.println("Thread is avalaible or not :"+s1.isAlive());
		System.out.println(Thread.currentThread().getName());
//		s2.start();
		
	
	
	}
}
