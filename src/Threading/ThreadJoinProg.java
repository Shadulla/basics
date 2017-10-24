package Threading;

public class ThreadJoinProg {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("i am from threadt1");
				for(int i=0;i<=5;i++)
				{
					try {
						Thread.sleep(1000);
						System.out.println("Loop executing at thread1   "+i+ "  time");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		},"Thread1");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("i am from threadt2");
				for(int i=0;i<=5;i++)
				{
					try {
						Thread.sleep(2000);
						System.out.println("Loop executing at thread2    "+i+ "  time");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		},"Thread2");
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("i am from threadt3");
				for(int i=0;i<=5;i++)
				{
					try {
						Thread.sleep(3000);
						System.out.println("Loop executing at thread3   "+i+ "  time");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		},"Thread3");
		t1.start();
		//t1.join();
		t2.start();
		t2.join();
		t3.start();
		//t3.join();
	}
}
