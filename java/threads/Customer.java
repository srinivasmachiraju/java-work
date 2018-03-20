import java.io.*;
public class Customer implements Serializable
{
	int customerAge;
	String customerName;
	int customerId;
	Customer(int ca,String cn,int ci)
	{
		customerAge=ca;
		customerName=cn;
		customerId=ci;
	}
	public String toString()
	{
		return customerAge + "   " + customerName + "   " + customerId;
	}
}