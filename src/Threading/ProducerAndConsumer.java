package Threading;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> sharedList = new ArrayList<Integer>();
		Thread t1 = new Thread(new Producer(sharedList),"Produce Thread");
		t1.start();
		Thread t2 = new Thread(new Consumer(sharedList),"Consumer Thread");

		t2.start();
	}

}

class Consumer implements Runnable
{

	public Consumer(List sharedList) {
		this.sharedList = sharedList;
	}

	List sharedList;
	public void run() {
		 try {
			 while(true)
			 {
			consume();
			 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void consume() throws InterruptedException
	{
		synchronized (sharedList) {
			while(sharedList.isEmpty())
			{
				System.out.println("Waiting fot the Producer Thread to produce ....");
				sharedList.wait();
			}
			synchronized (sharedList) {
				Thread.sleep(1000);
				System.out.println("consumer Reading the consumer Thread");
				System.out.println(sharedList.remove(0));
				sharedList.notify();
			}

	}
	

}
}

class Producer implements Runnable
{

	List<Integer> sharedList;
	int i=0;
	int MAX_SIZE_VAL =1;
	
	public Producer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	public void run() {
		try {
			while(true)
			{
			Produce(i++);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void Produce(int i) throws InterruptedException
	{
		synchronized (sharedList) {
			while(sharedList.size() == MAX_SIZE_VAL)
			{
				System.out.println("Shared List is full lets consmer thread consume");
				sharedList.wait();
			}
		}
		
		synchronized (sharedList) {
			System.out.println("Adding the data"+ i);
			sharedList.add(i);
			Thread.sleep(500);
			sharedList.notify();
		}
	}
	
}