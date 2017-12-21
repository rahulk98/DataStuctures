
public class LinkedList {
	public Node head=null;
	
	public void insert_at_head(int value){
		Node newnode = new Node(value);
		if(head==null)
			head=newnode;
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void insert_at_tail(int value){
		Node newnode = new Node(value);
		if(head==null)
			head=newnode;
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
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
		else if(head.next==null)
			head=null;
		else
			head=head.next;
	}
	
	public void delete_at_tail(){
		if(head==null)
			System.out.println("list Empty");
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
				temp=temp.next;
			temp.next=null;
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
		while(temp.next!=null)
		{
			temp=temp.next;
			c++;
		}
		c=c+1;
		return c;
	}
	
	public int getSum()
	{
		Node temp=head;
		int sum=0;
		while(temp!=null)
		{
			sum+=temp.data;
			temp=temp.next;
			
		}
		
		return sum;
	}
	
	public void changeData(int value,int dat)//test
	{
		if(head==null)
			System.out.println("List empty");
		else
		{
			Node temp=head;
			while(temp.data!=value)
			{
				temp=temp.next;
			}
			temp.data=dat;
		}
	}
	
	public void searchNode(int value)
	{
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Node temp=head;
			int pos=0;
			while(temp.data!=value)
			{
				temp=temp.next;
				pos++;
			}
			System.out.println("Node found at position: "+pos);
		}
	}
	
	public void deleteEven()
	{
		if(head==null)
			System.out.println("Empty List");
		else
			{
				Node curr=null,prev=null;
				curr=head;
				while(curr.next!=null)
				{
					prev=curr;
					curr=curr.next;
					if(curr.data%2==0)
					{
						prev.next=curr.next;
					}
				}
			}
	}
	
	public void largestNode()
	{
		if(head==null)
			System.out.println("List empty");
		else{
			int l = head.data;
			Node temp = head;
			Node lar=head; ;
			while(temp.next!=null){
				temp = temp.next;
				if(l < temp.data) {
					l = temp.data;
					lar = temp;
				}
			}
			Node temp3;
			temp3= head;
			
			if(lar == head) {
				head = head.next;
				
			}
			else {
				while(temp3.next!=lar) {
					temp3 = temp3.next;
				
				}
				temp3.next = lar.next;
			}
			temp.next = lar;
			lar.next = null;
		}
	}
	
	public Node concatenate(Node head2){
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = head2;
		return head;
	}
	
	public void reverse(){
		if(head==null){
			System.out.println("Empty");
		}
		else{
			Node prev=null;
			Node curr = head;
			Node nxt = head.next;
			head.next = null;
			while(nxt.next!=null){
				curr.next = prev;
				prev = curr;
				curr = nxt;
				nxt = curr.next;

			}
			if(nxt.next == null){
				nxt.next = curr;
				curr.next = prev;
				head = nxt;
			}
		}
	}
	public Node reverseRecur(Node temp){
		if(temp.next == null)
		{
			this.head = temp;
			return temp;
		}
		else
		{
			Node temp1 = reverseRecur(temp.next);
			temp1.next = temp;
			return temp;
		}

	}
	
	public void split(){
		if(head==null)
		{
			System.out.println("Empty");
		}
		
		else{
			LinkedList head1 = new LinkedList();
			LinkedList head2 = new LinkedList();
			Node temp = head;
			int c =1;
			while(temp!=null){
				if(c%2==0){
					head1.insert_at_head(temp.data);
				}
				else{
					head2.insert_at_head(temp.data);
				}
				temp = temp.next;
				c++;
			}
			this.head = head1.head;
			head1.print();
			System.out.println();
			head2.print();
		}
	}

	
	public void print(){
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	
	
}