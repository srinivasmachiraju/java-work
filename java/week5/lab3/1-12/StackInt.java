import java.util.Scanner;
	
class StackInt{
	Scanner s=new Scanner(System.in);
	int []arr=new int[5];
	int []ar=new int[10];
	String []str=new String [5];
	String []st=new String [5];
	int top=-1;
	StackInt(){
		arr=new int[10];
		top=-1;
		}
	     StackInt(int sz) { 
    		arr = new int[sz]; 
    		top = -1; 
               }
	public void print(){
	for(int i=0;i<=top;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println(" ");
	}
	
		public void push(int item){
		try{
		if(top<arr.length)
			{
			top=top+1;
			arr[top]=item;
			}
		}
		catch(Exception e){
			System.out.println("cant push");
			top=top-1;
			}
		}
		public int gettop(){
		return top;
		}
	
	public int pop(){
		if(top>=0){
		int k=arr[top];
		top=top-1;
		return k;
		}
		else{
		System.out.println("Cant pop");
		return 0;
		} 
	}
	public int peek(){
	if(top>=0){
	int k=arr[top];
	return k;
	}
	else{	
		return -1;
	}
	}
		int flag=0;
	public boolean equals(StackInt s4)
	{
		if(this.arr.length==s4.arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(this.arr[i]!=s4.arr[i])
				{
					flag=1;
					break;
				}
			}
		}
		else
		{
			flag=1;
		}
		if(flag==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}


