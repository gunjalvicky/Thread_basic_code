package Thread_Practice;

class Dostuff extends Thread 
{
	@Override
	public void run()
	{
		String Name= Thread.currentThread().getName();
		System.out.println("NAme of the thread:"+Name);
		
	}
	
}
public class Set_and_getvalues_usedThread 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Dostuff s=new Dostuff();
		
		s.setName("vicky");
		s.start();
		
		Dostuff s1=new Dostuff();
		s1.setName("sai");
		
		s1.start();
		s.join();
		s1.join();
		
		
	}

}
