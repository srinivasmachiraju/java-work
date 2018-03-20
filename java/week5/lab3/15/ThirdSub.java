class ThirdSub{
String []str=new String[10];
String []st=new String[10];
int top=-1;
int top1=-1;
public void push(String item) {
	if(top<10){
	top=top+1;
	
	str[top]=item;	
	}
	else{
		System.out.println("cant push");
	   }
	}
	public void push1(String item) {
	if(top<10){
	top1=top1+1;
	
	st[top1]=item;	
	}
	else{
		System.out.println("cant push");
	   }
	}
public void reverse(){
	
		for(;top!=-1;top--){
		push1(str[top]);
	}

	}
	public void print(){
		for(int i=0;i<10;i++){
			System.out.print(st[i]+" ");
		}
	}
}
