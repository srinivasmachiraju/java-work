 class Messagebox extends Thread
{
	String message;
	boolean hasmessage=false;
	public void putmessage(String msg)
	{
		while(hasmessage)
		{
			try
			{

				wait();
			}
			catch(Exception e)
			{
			}
		}
		
		try
		{
		this.message=msg;
		hasmessage=true;
		notify();
		
		}
		catch(Exception e)
		{
		}
	}

	public void getmessage()
	{
		while(!hasmessage)
		{
			try

			{
				wait();
			}
			catch(Exception e)
			{}
		}
		try
		{
		System.out.println(this.message);
		hasmessage=false;
		notify();
		}
		catch(Exception e)
		{}
	}
}