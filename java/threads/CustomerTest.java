import java.io.*;
import java.util.*;
public class CustomerTest
{
	public static void main(String []args) throws Exception
	{
		Customer c1 = new Customer(20,"KK",1);
		Customer c2 = new Customer(30,"Jaguar",2);
		Customer c3 = new Customer(40,"Konijeti",3);
		Customer c4 = new Customer(50,"Nikhil",4);
		ArrayList<Customer> a = new ArrayList<Customer>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		FileOutputStream fos = new FileOutputStream("Nikhil.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		FileInputStream fis = new FileInputStream("Nikhil.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Customer> cu = (ArrayList<Customer>)ois.readObject();
		for(Customer cust : cu)
		{
			System.out.println(cust);
		}
	}
}