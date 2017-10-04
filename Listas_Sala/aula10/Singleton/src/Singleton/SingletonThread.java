package Singleton;


public class SingletonThread implements Runnable{
	
	
	public static void main(String args[])
	{
		SingletonThread st = new SingletonThread(); 
		
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.start();		
		t2.start();
	}
	
	public void run()
	{
		System.out.println(Singleton.getApplication());
	}
	
	
}
