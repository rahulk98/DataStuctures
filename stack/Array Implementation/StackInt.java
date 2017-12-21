

public class StackInt {
	public int[] A;
	public int top = -1;
	public int size = 15;
	public StackInt(){
		A = new int[15];
	}
	public StackInt(int size){
		A = new int[size];
		this.size = size;
	}
	
	public void push(int n){
		if(IsFull() == 1){
			System.out.println("stack overflow");
		}
		else{
			top++;
			A[top] = n;
		}
		this.print();
	}
	public void pop(){
		if(IsEmpty() == 1){
			System.out.println("stack underflow");
		}
		else{
			top--;
		}
	this.print();

	}
	public int IsEmpty(){
		if (top == -1)
			return 1;
		else
			return 0;
		}
	public int IsFull(){
		if (top == size-1)
			return 1;
		else
			return 0;
		}
	public void print(){
		for(int i=top;i>=0;i--){
			System.out.print(A[i] + " ");
		}System.out.println("");
	}
	public int getTop(){
		return top;
	}
	public int peek(){
		if(top == -1){
			System.out.println("cant peek");
			return -1;
		}
		else{
			return A[top];
		}
		
	}
	
}
