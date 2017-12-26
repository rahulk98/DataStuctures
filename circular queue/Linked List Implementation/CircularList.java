
public class CircularList {
	public Node head=null;
	
	public void insert_at_head(int value){
		Node newnode = new Node(value);
		if(head==null)
		{
			head=newnode;
			newnode.next=head;
		}
		else
		{
			newnode.next=head;
			Node temp = head;
			while(temp.next!=head)
				temp = temp.next;
			temp.next = newnode;
			head=newnode;
		}
	}
	
	public void insert_at_tail(int value){
		Node newnode = new Node(value);
		if(head==null)
		{
			head=newnode;
			newnode.next = head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
				temp=temp.next;
			temp.next=newnode;
			newnode.next = head;
		}
	}
	
	public void insert_at_position(int value,int k){
		Node newnode = new Node(value);
		if(k<1 || k>getLength())
			System.out.println("Invalid Index");
		else if(k==1)
			insert_at_head(value);
		else if(k==getLength())
			insert_at_tail(value);
		else
		{
			Node temp=head;
			for(int i=0;i<k-1;i++)
				temp=temp.next;
			newnode.next=temp.next;
			temp.next=newnode;
		}
				
	}
	
	public void delete_at_head(){
		if(head==null)
			System.out.println("Empty List");
		else if(head.next==head)
			head=null;
		else
		{
			Node temp = head;
			while(temp.next!=head)
				temp = temp.next;
			head=head.next;
			temp.next = head;
		}
	}
	
	public void delete_at_tail(){
		if(head==null)
			System.out.println("list Empty");
		else if (head.next ==head)
			head = null;
		else
			
		{
			Node temp=head;
			while(temp.next.next!=head)
				temp=temp.next;
			temp.next=head;
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
			Node curr=null,prev=null;
			int count=0;
			curr=head;
			while(count!=k)
			{
				prev=curr;
				curr=curr.next;
				count++;
			}
			prev.next=curr.next;
		}
	}
	
	public void delete_a_value(int value){
		if(head==null)
			System.out.println("List empty");
		else
		{
			Node temp=head;
			int pos=0;
			while(temp.data!=value)
			{
				temp=temp.next;
				pos++;
			}
			delete_at_position(pos);
		}
	}
	
	public int getLength(){
		Node temp=head;
		int c=0;
		while(temp.next!=head)
		{
			temp=temp.next;
			c++;
		}
		c=c+1;
		return c;
	}
	
	public Node merge(Node head2){
		Node temp = head;
		while(temp.next!=head){
			temp = temp.next;
		}
		temp.next = head2;
		temp = head2;
		while(temp.next!=head2)
			temp=temp.next;
		temp.next = head;
		return head;
	}
	
	public void print(){
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data + " ");
		}
	}
}