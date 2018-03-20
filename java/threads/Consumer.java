public class Consumer extends Thread
{
	Messagebox box1;

	Consumer(Messagebox box1)
	{
		this.box1=box1;
	}

	public synchronized void run()
	{
	 box1.getmessage();
	 box1.getmessage();
	 box1.getmessage();
	}
}