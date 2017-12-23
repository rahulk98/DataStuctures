
import java.util.Scanner;

public class DoublyLinkedList {
	public Node2 head = null;
	
	public void insert_at_head(int value){
		Node2 newnode = new Node2(value);
		if(head==null)
		{
			newnode.next=head;
			newnode.prev = head;
			head=newnode;

		}
		else
		{
			head.prev = newnode;
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void insert_at_tail(int value){
		Node2 newnode = new Node2(value);
		if(head==null)
		{
			head=newnode;
			newnode.next = head;
			newnode.prev = head;
		}
		else
		{
			Node2 temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
			newnode.prev = temp;
		}
	}
	public void insert_at_position(Node2 temp,int k){
		Node2 newnode = new Node2(k);

		if(head == null){
			head = newnode;
		}
		else
		{
			Node2 temp2=head;
			while(temp2.data!=temp.data)
				temp2 = temp2.next;
			newnode.next=temp2.next;
			temp2.next.prev = newnode;
			newnode.prev = temp2;
			temp2.next=newnode;
		}
				
	}
	public int getLength(){
		Node2 temp=head;
		int c=0;
		while(temp.next!=null)
		{
			temp=temp.next;
			c++;
		}
		c=c+1;
		return c;
	}
	public void print(){
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Node2 temp=head;
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data + " ");
		}
	}
	public void delete_at_head(){
		if(head==null)
			System.out.println("Empty List");
		else if(head.next==null)
			head=null;
		else
		{
			head=head.next;
			head.prev = null;
		}
	}
	
	public void delete_at_tail(){
		if(head==null)
			System.out.println("list Empty");
		else if (head.next ==head)
			head = null;
		else
			
		{
			Node2 temp=head;
			while(temp.next.next!=null)
				temp=temp.next;
			temp.prev.next=null;
			temp.prev = null;
		}
	}
	
	public void delete_at_position(int k){
		if(k<0 || k>getLength())
			System.out.println("Invalid Index");
		else if(k==0)
			delete_at_head();
		else if(k==getLength()-1)
			delete_at_tail();
		else
		{
			Node2 curr=null,prev=null;
			int count=0;
			curr=head;
			while(count!=k)
			{
				prev=curr;
				curr=curr.next;
				count++;
			}
			prev.next=curr.next;
			curr.next.prev = prev;
		}
	}
	public void deleteByValue(int value){
		if(head == null)
			System.out.println("Empty");
		else{
			Node2 curr = null, prev = null;
			curr = head;
			while(curr.data != value){
				prev = curr;
				curr = curr.next;
				
			}
			if(curr == head){
				head = head.next;
				head.prev = null;
			}
			else if(curr.next == null){
				prev.next = null;
				curr.prev = null;
			}
			else{
				prev.next = curr.next;
				curr.next.prev = prev;
			}
			
		}
		
	}
	
	public void reverse( int k){
			int x = k;
			Node2 head_next=null;
			Node2 h = head;
			Node2 head_prev = null;
			while(h!=null && x>0){
				head_next = h.next;
				h.next = head_prev;
				h.prev = head_next;
				head_prev = h;
				h = head_next;
				x--;
			}
			head.next = head_next;
			head = head_prev;
		}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		DoublyLinkedList d = new DoublyLinkedList();
		int choice = 0;
		while (choice != 6) {
			System.out.println("Enter 1 to insert elements into the list");
			System.out.println("Enter 2 to insert at a position");
			System.out.println("Enter 3 to delete a value");
			System.out.println("Enter 4 to reverse first n elements");
			System.out.println("Enter 5 to print the elements");
			System.out.println("Enter 6 to exit");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					int value = s.nextInt();
					d.insert_at_head(value);
					break;
				case 2:
					int val = s.nextInt();
					int pos = s.nextInt();
					Node2 temp = new Node2(val);
					d.insert_at_position(temp, pos);
					break;

				case 3:
					int val2 = s.nextInt();
					d.deleteByValue(val2);
					break;
				case 4:
					int n = s.nextInt();
					d.reverse(n);
					break;
				case 5:
					d.print();
					break;
			}
		}
	}

}
