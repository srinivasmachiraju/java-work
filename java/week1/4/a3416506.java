
import java.io.InputStream;
import java.io.*;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

class Four{
public static void main(String [] args){
int i=0,j=0,k,c=0,n=0;
String [] a=new String[100];
/*char []b=new char [5];
	b[0]='a';
	b[1]='e';
	b[2]='i';
	b[3]='o';
	b[4]='u';*/
char x;
try{
File f=new File("test.txt");
 Scanner s=new Scanner(f); 
while (s.hasNext()){
	a[i]=s.next();
	i++;
	c++;
	}
	System.out.println(c);
	int [] d= new int [c];
	for(i=0;i<c;i++){
	d[i]=a[i].length();
	//System.out.println(d[i]);
	}
	for(i=0;i<c;i++){
	//System.out.println("1");
		int l=0;
		for(j=0;j<d[i];j++)
		{
		//System.out.println("2");
			x=a[i].charAt(l);
			l++;
			System.out.println(x);
				if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
				n=n+1;
				
				}
		}
	}
	System.out.println("no of vowels are "+n);
	s.close();
	}catch(Exception e){
		System.out.println("error");
	}
}
}
