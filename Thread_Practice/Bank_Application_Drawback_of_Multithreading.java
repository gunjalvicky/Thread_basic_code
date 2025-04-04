package Thread_Practice;

class Customer
{
	private double availableBalance = 20000;	
	private double withdrawAmount;
	
	public Customer(double withdrawAmount) 
	{
		super();
		this.withdrawAmount = withdrawAmount;
	}
	
	public void withdraw()
	{
		String name = null;
		
		if(withdrawAmount<= availableBalance)
		{
			name = Thread.currentThread().getName();
			System.out.println(withdrawAmount+ " Amount, withdraw by :"+name);
			availableBalance = availableBalance - withdrawAmount;
			System.out.println("available Balance :"+availableBalance);
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!"+name+" you have insufficient Balance");
		}		
	}
	
}

public class Bank_Application_Drawback_of_Multithreading {

	public static void main(String[] args) throws Exception
	{
		Customer obj = new Customer(200);
		
		Runnable r1 = ()-> 
		{ 
		  obj.withdraw();
		};
		
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		
		t1.start();  
			//t1.join();
		t2.start();
	}

}