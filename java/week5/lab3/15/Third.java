import java.util.Scanner;
class Third{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
	ThirdSub s1=new ThirdSub();
	System.out.println("start entering the string");
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	
	s1.push(s.next());
	s1.reverse();
	System.out.println("the reversed stack is");
	s1.print();
	}
	}
