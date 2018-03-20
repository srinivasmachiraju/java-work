import java.util.Scanner;
class FirstSub{
	int []ar=new int[10];
	int top=-1;
public void push(int item){
	top=top+1;
	ar[top]=item;
	}
	public int getmin(){
	int min=ar[0];
	for(int i=1;i<top;i++){
	if(min>ar[i]){
		min=ar[i];
	}
	}
	return min;
	}
	}
