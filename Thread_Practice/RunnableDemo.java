package Thread_Practice;
//
//class Ravi implements Runnable
//{
//	@Override
//	public void run() 
//	{
//		System.out.println("Thread is performing my task ");		
//	}	
//}
//
//public class RunnableDemo
//{
//   public static void main(String [] args)
//   {
//	   System.out.println("Main");        
//        
//        Thread t1 = new Thread(new Ravi());//Go to the ruunable interface
//        t1.start();
//       
//   }
//}   
//
//??case 3
public class RunnableDemo {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(()-> System.out.println(Thread.currentThread().getName()));
		t1.start();//with Reference
		
		System.out.println("................");
		
		new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
		//without reference
		
		System.out.println("................");
		
		new Thread(()-> System.out.println(Thread.currentThread().getName()),"Scott").start();
		
	}

}