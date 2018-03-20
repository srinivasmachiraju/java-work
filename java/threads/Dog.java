import java.util.*;
public class Dog implements Comparable<Dog>
{
	String name;
	int age;
	Dog(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Dog dog)
	{
	  if(age==dog.age)
	  	return 0;
	  else if(dog.age<age)
	  	return 1;
	  else
	  	return -1;
	}
	public void setName(String na)
	{
		name=na;
	}
	public void setAge(int ag)
	{
		age=ag;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}