import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

class First{
public static void main(String [] args)
{
	int i=0,c=0;
	String []a=new String[100]; 
	
	File f=new File("a3116506.java");
	try{
	Scanner s=new Scanner(f);
	/*while(s.hasNext()){
	System.out.println(s.nextLine());

	}*/
	while(s.hasNext()){

	i+=1;
	c+=1;
	System.out.println(c);
	}
	s.close();
	}catch(Exception fnfe){
	System.out.println("error");
}
	System.out.println(c);
	for(i=c-1;i!=-1;i--){
	System.out.println(a[i]);
	}

}
}
