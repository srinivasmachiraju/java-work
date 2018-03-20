import java.util.*;
import java.io.*;
public class DogTest
{
	public static void main(String args[]) throws Exception
	{
		Dog d1 = new Dog("Snoopy",13);
		Dog d2 = new Dog("Dobber",10);
		Dog d3 = new Dog("Rob",5);
		ArrayList<Dog> a = new ArrayList<Dog>();
		a.add(d1);
		a.add(d2);
		a.add(d3);
		Collections.sort(a);
		for(Dog du:a)
		{
			System.out.println(du.getName() + "  " + du.getAge());
		}
	}
}