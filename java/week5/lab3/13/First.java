import java.util.Scanner;
class First{
public static void main(String[] args){
	int k;
	Scanner s=new Scanner(System.in);
	FirstSub s1=new FirstSub();
	System.out.println("start entering the elements");
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	k=s1.getmin();
	System.out.println("minimum no entered till now is"+k);
	System.out.println("start entering the elements");
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	k=s1.getmin();
	System.out.println("minimum element is"+k);
	}
	}
