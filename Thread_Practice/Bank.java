package Thread_Practice;

class Customer1 extends Thread
{
	private int balance =0;
	
	public synchronized void withdraw(int amount)
	{
		if(amount>balance )
		{
			
			try
			{
				System.out.println("Available balance not suffitient");
				wait();
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		balance=balance-amount;
		System.out.println("Available amount:"+balance);
		
		
	}
	public synchronized void diposit(int amount)
	{
		balance=balance+amount;
		System.out.println("balance Is"+balance);
		notify();
		
	}
	

} 

public class Bank {
	

public static void main(String[] args)
{
	Customer1 customer=new 	Customer1();
	Withdraw w=new Withdraw(customer);
	Dipositor s=new Dipositor(customer);
	
	w.start();
	s.start();
	
}
}
class Withdraw extends Thread
{
	private Customer1 amount;

	public Withdraw(Customer1 amount) {
		super();
		this.amount = amount;
	}
	
	public void run()
	{
		int[] wnumber= {2000,1000};
		for(int w:wnumber)
		{
			try
			{
				amount.withdraw(w);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{	
			}	
		}	
	}	
}
class Dipositor extends Thread
{
	private Customer1 amount;

	public Dipositor(Customer1 amount) {
		super();
		this.amount = amount;
	}
	public void run()
	{
		int[] dnumber= {2000,3000};
		for(int d:dnumber)
		{
			try 
			{
				amount.diposit(d);
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				
			}
		}
	}
	
}
