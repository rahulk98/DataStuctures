

import java.util.Scanner;

public class Queue{
	public int[] Queue;
	public int front = -1;
	public int back = -1;
	public int size = 15;
	public Queue(){
		Queue = new int[15];
	}
	public Queue(int size){
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
			back++;
			Queue[back] = n;
		}
	}
	public void Dequeue(){
		if(IsEmpty() == 1){
			System.out.println("Queue is empty");
		}
		
		else{
			front++;
		}

	}
	public int IsEmpty(){
		if (front == -1)
			return 1;
		else
			return 0;
		}
	public int IsFull(){
		if (back == size-1)
			return 1;
		else
			return 0;
		}
	public void display(){
		for(int i=front;i<=back;i++){
			System.out.print(Queue[i] + " ");
			
		}			System.out.println("");

	}
	public int getSize(){
		return size;
	}
	public int getNo(){
		return back-front+1;
	}
	public int getFront(){
		if(front ==-1)
			return front;
		else
			return Queue[front];
	}
	public boolean equals(Queue another){
		if(this.getFront()==-1)
			{System.out.println("Empty");
			return false;}
		else if(this.getFront() != another.getFront())
			return false;
		else if(this.getNo()!=another.getNo()){
			return false;
		}
		else{
			for(int i=0, j=this.front,k=another.front;i<this.getNo();i++,j++,k++){
				if(this.Queue[j] != another.Queue[k]){
					return false;
				}
			}
		}
		return true;
		
	}
	
}
