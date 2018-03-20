public class Driver extends Thread
{
	public static void main(String[] args)
	{
		Messagebox box2=new Messagebox();
		Producer p1=new Producer(box2);
		Consumer c1=new Consumer(box2);
		p1.start();
		c1.start();
	}
}