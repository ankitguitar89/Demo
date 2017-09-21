package testWebsite;

public class Mutex {
	
	boolean suspendFlag;
	
	public Mutex()
	{
		suspendFlag=false;
	}
	
	public void acquire() {
		System.out.println("Acquiring Mutex");
		synchronized(this) {
			while(suspendFlag)
			{
				System.out.println("Inside critical section");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		release();
	}
	
	public void mysuspend()
	{
		suspendFlag=true;
	}
	
	public void release()
	{
		System.out.println("Mutex Released");
		suspendFlag=false;
		notify();
	}
}
