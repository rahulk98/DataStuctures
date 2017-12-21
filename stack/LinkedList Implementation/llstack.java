

import java.util.Scanner;
public class llstack {
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice!=4)
		{
			System.out.println("Enter 1 to push");
			System.out.println("Enter 2 to pop");
			System.out.println("Enter 3 to print");
			System.out.println("Enter 4 to exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter the element to push");
					l.insert_at_head(sc.nextInt());
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
