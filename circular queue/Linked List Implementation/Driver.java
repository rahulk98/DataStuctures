
import java.util.Scanner;
public class Driver {
	public static void main(String args[])
	{
		CircularList c = new CircularList();
		Scanner sc = new Scanner(System.in);
		int choice = 0,n=0,pos=0;
		while(choice!=8)
		{
			System.out.println("Enter 1 to insert at head");
			System.out.println("Enter 2 to insert at tail");
			System.out.println("Enter 3 to insert after a node");
			System.out.println("Enter 4 to delete with data");
			System.out.println("Enter 5 to delete with position");
			System.out.println("Enter 6 to merge two lists");
			System.out.println("Enter 7 to print the list");
			System.out.println("Enter 8 to exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the value to insert");
				n = sc.nextInt();
				c.insert_at_head(n);
				break;
			}
			case 2:
			{
				System.out.println("Enter the value to insert");
				n = sc.nextInt();
				c.insert_at_tail(n);
				break;
			}
			case 3:
			{
				System.out.println("Enter the value to insert");
				n = sc.nextInt();
				System.out.println("Enter the position");
				pos = sc.nextInt();
				c.insert_at_position(n,pos);
				break;
			}
			case 4:
			{
				System.out.println("Enter a value to delete");
				n=sc.nextInt();
				c.delete_a_value(n);
				break;
			}
			case 5:
			{
				System.out.println("Enter a position");
				pos = sc.nextInt();
				c.delete_at_position(pos);
				break;
			}
			case 6:
			{
				CircularList cl = new CircularList();
				System.out.println("Enter number of elements of new list");
				n=sc.nextInt();
				System.out.println("Enter the elements");
				for(int i=0;i<n;i++)
					cl.insert_at_head(sc.nextInt());
				c.merge(cl.head);
				break;
			}
			case 7:
			{
				c.print();
			}
			case 8:
			{
				break;
			}
			}
			
		}
	}
}