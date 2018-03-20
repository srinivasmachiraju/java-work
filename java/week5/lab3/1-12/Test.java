class Test{

public static void main(String [] args){

StackInt si=new StackInt();
	System.out.println("Stack top is " + si.top);
	System.out.println("arry length is"+ si.arr.length);
	/*StackInt si2 = new StackInt(15); 
	System.out.println(si2.arr.length); */
	si.push(100);
	si.print();
	si.push(200);
	si.print();
	si.push(300);
	si.print();
	si.push(400);
	si.print();
	si.push(500);
	si.print();
	si.push(600);
	si.print();
	si.push(700);
	si.print();
	si.push(800);
	si.print();
	si.push(900);
	si.print();
	si.push(1000);
	si.print();
	si.push(1000);
	si.print();
	System.out.println(si.gettop());
	int ite0=si.pop();
	si.print();
	int ite1=si.pop();
	si.print();
	int ite2=si.pop();
	si.print();
	int ite3=si.pop();
	si.print();
	int ite4=si.pop();
	si.print();
	int ite5=si.pop();
	si.print();
	int ite6=si.pop();
	si.print();
	int ite7=si.pop();
	si.print();
	int ite8=si.pop();
	si.print();
	int ite9=si.pop();
	si.print();
	int ite10=si.pop();
	si.print();

	StackInt si3=new StackInt();
	/*int f=si3.peek();
	if(f!=-1)
	System.out.println(si3.peek()); 
	else {
		System.out.println("cant peek");
	}*/
	si3.push(100); 
	System.out.println(si3.peek()); 
	si3.push(200); 
	System.out.println(si3.peek()); 
	si3.push(300); 
	System.out.println(si3.peek());
	si3.push(400); 
	si3.push(300); 
	si3.push(500); 
	StackInt si1 = new StackInt(); 
	StackInt si2 = new StackInt(); 
	si1.push(100); 
	si2.push(100); 
	si1.push(200); 
	si2.push(200); 
	if (si1 == si2) {
		System.out.println(" ");
   	 System.out.println("Both si1 and si2 are same"); 
	}
	else {
	System.out.println(" ");
    	System.out.println("Both si1 and si2 are not the same");} 
	StackInt s3=new StackInt(); 
	StackInt s4=new StackInt(); 
	
	s3.push(100);
	s3.push(200);
	s3.push(300);
	s3.push(400);
	s3.push(500);
	s3.push(600);
	s3.push(700);
	s3.push(800);
	s3.push(900);
	s3.push(1000);

	s4.push(100);
	s4.push(200);
	s4.push(300);
	s4.push(400);
	s4.push(500);
	s4.push(600);
	s4.push(700);
	s4.push(800);
	s4.push(900);
	s4.push(1000);
	if(s3.equals(s4))
		{
			System.out.println(" ");
			System.out.println("s3 and s4 are same");
		}
		else
		{
			System.out.println(" ");
			System.out.println("s3 and s4 are not same");
		} 
	}
	}
