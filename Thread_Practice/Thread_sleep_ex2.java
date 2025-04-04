package Thread_Practice;

class join extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("i value is :"+i);
			try
			{
				 Thread.sleep(1000);
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class Thread_sleep_ex2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		join j1 =new join();
		
		join j2 =new join();
		
		join j3 =new join();
		
		j1.start();
		j1.join();
		System.out.println("Over the j1");
		j2.start();
		j2.join();
		System.out.println("Over the j2");
		j3.start();
		

	}

}
