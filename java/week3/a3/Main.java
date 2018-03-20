/*
m.s.srinivas
am.en.u4cse16506
cse c*/
import java.util.Scanner;
class Myexception{
	Myexception(String msg){
		System.out.println(msg);
	}
}
	
class Main{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int f;
	int c=0,sum=0;
	int g;
	System.out.println("press -1 to discontinue rest of integers to continue");
	f=s.nextInt();
	while(f!=-1){	
	c=c+1;
	sum=sum+f;
	
	System.out.println("press -1 to discontinue rest of integers to continue");
	f=s.nextInt();
	}
	if(c<5){
	try{
		System.out.println(100/0);
	}catch(Exception e){
	Myexception m=new Myexception("check argument");
	}
	}
	else{
	System.out.println("sum is "+sum);
	}
}
}

