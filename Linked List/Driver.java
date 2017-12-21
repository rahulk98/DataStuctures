
import java.util.Scanner;
public class Driver {
	public static void main(String args[]){
		int choice=0,n=0,pos=0;
		LinkedList l = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while(choice!=19)
		{
			System.out.println("Enter 1 to add element at head");
			System.out.println("Enter 2 to add element at tail");
			System.out.println("Enter 3 to add element at position");
			System.out.println("Enter 4 to delete element at head");
			System.out.println("Enter 5 to delete element at tail");
			System.out.println("Enter 6 to delete element at position");
			System.out.println("Enter 7 to delete element with value");
			System.out.println("Enter 8 to print the list");
			System.out.println("Enter 9 to get the number of elements");
			System.out.println("Enter 10 to get sum of all nodes");
			System.out.println("Enter 11 to change data of a node");
			System.out.println("Enter 12 to search for a node");
			System.out.println("Enter 13 to delete all even elements");
			System.out.println("Enter 14 to move largest node to the end of the list");
			System.out.println("Enter 15 to concatenate two linked lists");
			System.out.println("Enter 16 to reverse a linked list non-recursively");
			System.out.println("Enter 17 to reverse a linked list recursively");
			System.out.println("Enter 18 to split linked list into odd and even elements");
			System.out.println("Enter 19 to exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the value to add");
					n=sc.nextInt();
					l.insert_at_head(n);
					break;
				}

				case 2:
				{
					System.out.println("Enter the value to add");
					n=sc.nextInt();
					l.insert_at_tail(n);
					break;
				}

				case 3:
				{
					System.out.println("Enter the value to add");
					n=sc.nextInt();
					System.out.println("Enter the position");
					pos=sc.nextInt();
					l.insert_at_position(n,pos);
					break;
				}

				case 4:
				{
					l.delete_at_head();
					break;
				}

				case 5:
				{
					l.delete_at_tail();
					break;
				}

				case 6:
				{
					System.out.println("Enter the position");
					pos=sc.nextInt();
					l.delete_at_position(pos);
					break;
				}

				case 7:
				{
					System.out.println("Enter the value");
					n=sc.nextInt();
					l.delete_a_value(n);
				}
				
				case 8:
				{
					l.print();
					break;
				}
				
				case 9:
				{
					System.out.println(l.getLength());
					break;
				}
				
				case 10:
				{
					System.out.println(l.getSum());
					break;
				}
				
				case 11:
				{
					int d,v;
					System.out.println("Enter the value to replace");
					v=sc.nextInt();
					System.out.println("Enter the data to replace it with");
					d=sc.nextInt();
					l.changeData(v,d);
					break;
				}
				
				case 12:
				{
					System.out.println("Enter the value to search for");
					n=sc.nextInt();
					l.searchNode(n);
					break;
				}
				
				case 13:
				{
					l.deleteEven();
					break;
				}
				
				case 14:
				{
					l.largestNode();
					break;
				}
				
				case 15:
				{
					LinkedList l2=new LinkedList();
					System.out.println("Enter the number of nodes of the new linked list");
					n=sc.nextInt();
					System.out.println("Enter the elements of the linked list");
					for(int i=0;i<n;i++)
					{
						l2.insert_at_head(sc.nextInt());
					}	
					l.concatenate(l2.head);
					break;
				}
				
				case 16:
				{
					l.reverse();
					break;
				}
				
				case 17:
				{
					Node temp = l.reverseRecur(l.head);
					temp.next = null;
					l.print();
					break;
				}
				
				case 18:
				{
					l.split();
					break;
				}

				case 19:
				{
					break;
				}
			}
		}

		
		
	}

}