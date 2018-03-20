import java.util.Scanner;
class Banker{

int a;
Scanner s=new Scanner(System.in);
Message m=new Message();
Banker(){
a=1000;
}
Banker(int n){
a=a+n;
}
public void deposit(){
System.out.println("enter deposit amount");
a+=s.nextInt();
}
public void credit(){
final int minbalance=1000;
System.out.println("enter credited amount");
int k=s.nextInt();
if(k+minbalance>a){
Message m1=new Message("account out of cash");
a=a-k;
}
else{
	a=a-k;
}
}
public void display(){
System.out.println("amount left="+a);
}
}

