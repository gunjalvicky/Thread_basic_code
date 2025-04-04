package Thread_Practice;

public class ThreadGroup extends Thread 
{
	@Override
	public void run()
	{
		System.out.println();
	}

	public static void main(String[] args)
	{
		ThreadGroup tg=new ThreadGroup();
		Thread t1=new Thread(tg,"smith");
		t1.start();
		System.out.println(tg.activeCount());
		System.out.println(tg.getName());
		System.out.println(tg.getThreadGroup());
		System.out.println(tg.toString());
	}

}
