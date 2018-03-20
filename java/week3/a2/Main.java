/*
m.s.srinivas
am.en.u4cse16506
cse c*/

import java.util.Scanner;
import java.io.*;
import java.util.*;

class Main{
public static void main(String[] args){
int i=0,c=0;
String []a =new String[50];
String b;
String h=" ";
File f=new File("test.txt");
	try{
	Scanner s=new Scanner(f);
	while(s.hasNext()){
		// reading the file and storing words in array
		a[i]=s.next();
		c=c+1;
		i=i+1;
		}
		s.close();
	}
	catch(Exception e){
		System.out.println("file not found");
	}
	try{
	Formatter k=new Formatter("test2.txt");
	for(i=0;i<c;i++){
			b=a[i];
		k.format("%s",b);
		k.format("%s",h);
	}
	k.close();
	}
	catch(Exception e){
			System.out.println("file not created");
	}
}
}
		
	
	
