package Thread_Practice;

public class Anonymous_innerClassUsingThread_withoutReference 
{

	public static void main(String[] args) 
	{
		new Thread()
		{
			@Override
			public void run()
			{
				String name =Thread.currentThread().getName();
				
				System.out.println("Thread name is:"+name );
			}
		}.start();
		
	}

}
