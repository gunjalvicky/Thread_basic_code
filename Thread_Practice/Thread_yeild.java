package Thread_Practice;
class MyThread implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("i value is :"+i+" by "+name);
			
			if(name.equals("Child1"))
			{
				
				Thread.yield();
			}
		}
		System.out.println("-----------------------------");
	}
}

public class Thread_yeild {

	public static void main(String[] args) throws InterruptedException 
	{
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt, "Child1");
		Thread t2 = new Thread(mt, "Child2");
		
		t1.start(); 
		t1.join();
		t2.start();
		

	}

}