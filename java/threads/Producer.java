public class Producer extends Thread
{
	Messagebox box1;
	Producer(Messagebox box1)
	{
		this.box1=box1;
	}

	public void run()
	{
		box1.putmessage("Nikhil");
		box1.putmessage("KK");
		box1.putmessage("Jaguar");
	}
}