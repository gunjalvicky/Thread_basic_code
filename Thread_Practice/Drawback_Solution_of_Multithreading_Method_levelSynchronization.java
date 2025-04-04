package Thread_Practice;
class Table
{
	public synchronized void printable(int num)
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(num+"x"+i+"="+num*i);
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Drawback_Solution_of_Multithreading_Method_levelSynchronization {

	public static void main(String[] args) {
		Table t=new Table();
		Thread t1=new Thread()
				{
			@Override
			public void run()
			{
				t.printable(10);
			}
				};
				
				Thread t2=new Thread()
						{
					public void run()
					{
						t.printable(5);
					}
						};
						t1.start();
						t2.start();
	}

}
