
import java.util.Scanner;

public class CircularQueue {
	private int[] Queue;
	private int front = -1;
	private int back = -1;
	public int size = 15;
	public CircularQueue(){
		Queue = new int[15];
	}
	public CircularQueue(int size){
		this.size = size;
		Queue = new int[size];
	}
	public void Enqueue(int n){
		if(IsFull() == 1){
			System.out.println("Queue is full");
		}
		else if(IsEmpty() == 1){
			front = back =0;
			Queue[front] = n;
		}
		else{
			back = (back+1)%size;
			Queue[back] = n;
		}
	}
	public void Dequeue(){
		if(IsEmpty() == 1){
			System.out.println("Queue is empty");
		}
		else if(front == back)
			{front = -1;
			back = -1;
			}
		else{
			front = (front+1)%size;
		}

	}
	public int IsEmpty(){
		if (front == -1)
			return 1;
		else
			return 0;
		}
	public int IsFull(){
		if (front == (back+1)%size)
			return 1;
		else
			return 0;
		}
	public void display(){
		if(front<=back){
		for(int i=front;i<=back;i++){
			System.out.print(Queue[i] + " ");
			
		}			System.out.println("");
		}
		else{
			for(int i=front;i<=size-1;i++){
				System.out.print(Queue[i] + " ");
			}
			for(int j=0;j<=back;j++){
				System.out.print(Queue[j] + " ");
			}
		}
	}
	public int getNo(){
		if(IsEmpty()==1)
			return -1;
		else if(front>back)
			return size-front+back+1;
		else if(IsFull()==1)
			return size;
		else
			return back-front+1;
	}
	public int getSize(){
		return size;
	}
	public int getFront(){
		if(front ==-1)
			return front;
		else
			return Queue[front];
	}

	public boolean equals(CircularQueue another){
		if(this.getFront()==-1)
			{System.out.println("Empty");
			return false;}
		else if(this.getFront() != another.getFront())
			return false;
		else if(this.getNo()!=another.getNo())
			return false;
		else{
			if(front<back){
			for(int i=front;i>=back;i++){
				if(this.Queue[i] != another.Queue[i]){
					return false;
				}
			}
			}
			else{
				for(int i=front;i<=size-1;i++){
					if(this.Queue[i] != another.Queue[i]){
						return false;
				}
				for(int j=0;j<=back;j++){
					if(this.Queue[j] != another.Queue[j]){
						return false;
				}
			}
		}
		
		
	}
}
		return true;
		}
	public void splitq(){
		if(IsEmpty()==1)
			System.out.println("Queue is empty");
		
	else{
			Queue even = new Queue(size/2);
			Queue odd = new Queue(size/2);
			if(front<=back){
				for(int i=front,j=1;i<=back;i++,j++){
					if(j%2==0){
						even.Enqueue(this.Queue[i]);
						this.Dequeue();
					}
					else if(j%2!=0){
						odd.Enqueue(this.Queue[i]);
						this.Dequeue();
					}
					
				}			
				}
				else{
					for(int i=front,k=1;i<=size-1;i++,k++){
						if(k%2==0){
							even.Enqueue(this.Queue[i]);
							this.Dequeue();
						}
						else if(k%2!=0){
							odd.Enqueue(this.Queue[i]);
							this.Dequeue();
						}
					}
					for(int j=0, k=(size-1-front);j<=back;j++){
						if(k%2==0){
							even.Enqueue(this.Queue[j]);
							this.Dequeue();
						}
						else if(k%2!=0){
							odd.Enqueue(this.Queue[j]);
							this.Dequeue();
						}
					}
				}even.display();
				odd.display();
		}
		
		
		
	}
	public void getMin(){
		if(IsEmpty()==1)
			System.out.println("Queue is empty");
		else{
			int min = getFront();
			if(front<=back){
				
				for(int i=front;i<=back;i++){
					if(min>Queue[i])
						min = Queue[i];
					
				}			
				}
			else{
				
				for(int i=front;i<=size-1;i++){
					if(min<Queue[i])
						min = Queue[i];
				}
				for(int j=0;j<=back;j++){
					if(min<Queue[j])
						min = Queue[j];
				}
			}
		System.out.println("The minimum element is " + min);
		}
	}
	public static void main(String[] args){
		CircularQueue arr = new CircularQueue();
		Scanner s = new Scanner(System.in);
		int ch = -1;
		while(ch !=4){
		System.out.println("Enter an option");
		System.out.println("1:Insert an element");
		System.out.println("2:Delete an element");
		System.out.println("3:Display");
		System.out.println("4:Display front element");
		System.out.println("5:Check if two circular queues are equal");
		System.out.println("6:Split");
		System.out.println("7:Get Minimum element");
		System.out.println("8:exit");

		ch = s.nextInt();
		switch(ch){
			case 1:{
					System.out.println("Enter an element");

				int a = s.nextInt();
				arr.Enqueue(a);
				break;
			}
			case 2:arr.Dequeue();
			break;
			
			case 3: arr.display();
				break;
			case 4:System.out.println(arr.getFront()); 
				break;
			case 5:System.out.println("Enter size of queue");
				int n =s.nextInt();
				CircularQueue another = new CircularQueue(n);
					System.out.println("Enter the queue");
					for(int i=0;i<n;i++){
						int a = s.nextInt();
						another.Enqueue(a);
					}
				boolean b = arr.equals(another);
				if(b)
				System.out.println("Queues are equal");
				else
					System.out.println("Queues are not equal");
				break;
			case 6:arr.splitq();
				break;
			case 7:arr.getMin();
			break;
			case 8:break;
			default:System.out.println("Wrong option");
		}
	}
	}
}
