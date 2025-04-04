package Thread_Practice;

public class Anonymous_innerClassUsingThread_withReference extends Thread
{
	public static void main(String[] args)  
	{
		Thread t=new Thread()
		{
			@Override
			public void run() {
				String name =Thread.currentThread().getName();
				System.out.println("Anonymous thread name Is:"+name);
		}
	};t.start();
	System.out.println(Thread.currentThread().getName());

 }
}
