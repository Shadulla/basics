package Threading;

public class NotifyProg {
	
	public static void main(String[] args) {
		
			Message msg = new Message("Process it!!");
			Waiter waiter = new Waiter(msg);
			new Thread(waiter,"Waiter").start();
			Notifier notify = new Notifier(msg);
			new Thread(notify,"Notify").start();
	}
	
}

class Waiter implements Runnable
{

	Message message;
	Waiter(Message message)
	{
		this.message=message;
	}
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		synchronized (message) {
			try
			{
				System.out.println(name+"waiting to get notified at"+System.currentTimeMillis());
				message.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "notified at the the time"+System.currentTimeMillis());
			System.out.println("Processed the message"+ message.getMsg());
		}
	}
}


class Notifier implements Runnable {

    private Message msg;
    
    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" notifier started !!");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                msg.notify();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}


class Message
{
	public Message(String msg) {
		this.msg=msg;
	}
String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

}
