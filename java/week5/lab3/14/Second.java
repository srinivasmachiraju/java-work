import java.util.Scanner;
class Second{
public static void main(String[] args){
	int k;
	Scanner s=new Scanner(System.in);
	SecondSub s1=new SecondSub();
	System.out.println("start entering the elements");
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.push(s.nextInt());
	s1.copy1();
	s1.copy2();
	System.out.println("the copied stack is");
	s1.print();
	}
	}
