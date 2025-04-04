package Thread_Practice;

class sleep extends Thread
{
	@Override
	public void run() 
	{
		
		System.out.println(Thread.currentThread().getName());
		for(int i = 0;i<10;i++)
		{
			System.err.println("i value is :"+i);
			try
			{
				Thread.sleep(1000,500000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
	}
	
}
public class Threa_sleep {

	public static void main(String[] args) 
	{
			sleep s=new sleep();
			s.start();
			s.setName("Thread_Sleep -1000s,500000 Miliseconds");
			sleep s1=new sleep();
			
			
			
			
	}

}
