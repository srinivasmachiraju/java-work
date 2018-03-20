import java.util.Scanner;
class Two{
public static void main(String [] args){
int i,j,k,l;
Scanner s=new Scanner(System.in);
System.out.println("enter the strength of class");
int n=s.nextInt();
String [] a=new String [n];
int [] b=new int [n];
int [] p1=new int [n];
int [] p2=new int [n];
int [] p3=new int [n];
for(i=0;i<n;i++){
System.out.println("Please enter  roll number ");
b[i]=s.nextInt();
System.out.println("Please enter students names ");
a[i]=s.next();
System.out.println("please enter first periodical marks");
p1[i]=s.nextInt();
System.out.println("please enter second periodical marks");
p2[i]=s.nextInt();
System.out.println("please enter third periodical marks");
p3[i]=s.nextInt();
}
System.out.println("enter the ast no till which marks are printed")
l=s.nextInt();
if(l<n+1){
System.out.println("no     name            p1     p2      p3");
for(i=0;i<l;i++){
System.out.println(b[i]+"     "+a[i]+"       ss     "+p1[i]+"     "+p2[i]+"      "+p3);
}
}
else{
	System.out.println("invalid count");
 }
}
}

