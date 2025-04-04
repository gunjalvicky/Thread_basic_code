package Thread_Practice;


class ramu extends Thread
{
	@Override
	public void run()
	{
		System.out.println("run method call");
		
	}
}
public class Is_alive 
{

	public static void main(String[] args)
	{
		Thread t=new Thread();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
		
		

	}

}
