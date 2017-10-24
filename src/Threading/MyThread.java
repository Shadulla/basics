package Threading;

public class MyThread {
public static void main(String[] args) {
	
	System.out.println("I am started executing the thread");
		
	new Thread("Thread1")
	{
		@Override
		public void run() {
			System.out.println("i am from Thread t1");
			System.out.println(this.getName());
			try {
			
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}.start();
	
	new Thread("Thread2")
	{
		@Override
		public void run() {
			System.out.println("i am from Thread t1");
			System.out.println(this.getName());
		}
	}.start();
		
}

}
