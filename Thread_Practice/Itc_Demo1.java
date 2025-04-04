package Thread_Practice;

 class ravi extends Thread
{
	public void run()
	{
	 synchronized (this)
	 {
		try
	{
		notify();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
  }
 }
}
public class Itc_Demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ravi r=new ravi();
		Thread t1=new Thread(r);
		
		synchronized(r)
		{
			r.start();
			r.wait();
		}
		System.out.println("Thread execution");
		
	}

}
