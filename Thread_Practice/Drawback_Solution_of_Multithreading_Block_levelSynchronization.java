package Thread_Practice;


class ThreadName
{
	public void printThreadName() throws InterruptedException  
	{		  		
	  String name = Thread.currentThread().getName();
	  System.out.println("Thread inside the method is :"+name);
			
		   synchronized(this)  //synchronized Block
		   {  			   
			for(int i=1; i<=9; i++)   
			{
				Thread.sleep(1000);
				System.out.println("i value is :"+i+" by :"+name);
			}
			System.out.println(".............................");
		   }		
	}
}
public class Drawback_Solution_of_Multithreading_Block_levelSynchronization 
{
	public static void main(String[] args)
	{
		ThreadName obj1 = new ThreadName(); //lock is created	
		
		Runnable r1 = () -> {
			try {
				obj1.printThreadName();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(r1,"Child1"); 
		Thread t2 = new Thread(r1,"Child2"); 
		t1.start(); t2.start();				
	}
}