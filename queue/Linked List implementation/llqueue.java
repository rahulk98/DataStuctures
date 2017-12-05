
import java.util.Scanner;

public class llqueue {
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice!=4)
		{
			System.out.println("Enter 1 to enqueue");
			System.out.println("Enter 2 to dequeue");
			System.out.println("Enter 3 to print");
			System.out.println("Enter 4 to exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter the element to enqueue");
					l.insert_at_tail(sc.nextInt());
					break;
				}
			case 2:
				{
					l.delete_at_head();
					break;
				}
			case 3:
				{
					l.print();
					break;
				}
			case 4:
				{
					break;
				}
			}
			
		}
	}

}
