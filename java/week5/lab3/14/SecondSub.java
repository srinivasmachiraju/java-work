class SecondSub{
	int []ar=new int[10];
	int []a=new int[10];
	int []cpy=new int[10];
	int top=-1;
	int top1=-1;
	int top2=-1;

public void push(int item){
		top=top+1;
		ar[top]=item;
	/* used to take input from user and store it in stack ar*/
	}
	public  void copy1(){
		for(;top!=-1;top--){
		push1(ar[top]);
		}
	}
	/*used to copy elements from input stack to temperary stack a*/
	public void push1(int item){
		top1=top1+1;
		a[top1]=item;
	/* used to push elements in to temperory stack*/
	}
	public  void copy2(){
		for(;top1!=-1;top1--){
		push2(a[top1]);
		}
	}
	/*used to copy elements from input temperary stack to cpy stack*/
	public void push2(int item){
		top2=top2+1;
		cpy[top2]=item;
	}
	/* used to push elements in to copy  stack*/
	public void print(){
		for(int i=0;i<10;i++){
		System.out.print(cpy[i]+" ");
		}
	}
}
