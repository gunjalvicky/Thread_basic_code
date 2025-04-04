package Thread_Practice;

class Alpha extends Thread 
{
	public void run () 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Alpha is start.");
		Beta b=new Beta();
		b.start();
		try
		{
			b.join();
			System.out.println("Alpha is a restart.");
		}catch( Exception e)
		{
			e.printStackTrace();
		}
			for(int i=0;i<5;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Alpha is Value"+i);
			}
			System.out.println("Alpha is Ended");
		
		
	}
}
public class Alpha_Beta_joinMethod 
{

	public static void main(String[] args) 
	{
		Alpha a=new Alpha();
		
		a.start();
		
	}

}

class Beta extends Thread 
{
	public void run()
	{
		
		System.out.println("Beta is Start");
			for(int i=0;i<5;i++)
			{
				try {
					Thread.sleep(1000);
					System.out.println("Beta Is :"+i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		
			
			System.out.println("Beta is Ended");
		
	}
}
