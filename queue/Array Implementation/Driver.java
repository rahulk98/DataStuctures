

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
			Queue arr = new Queue();
			Scanner s = new Scanner(System.in);
			int ch = -1;
			while(ch !=4){
			System.out.println("Enter an option");
			System.out.println("1:Insert an element");
			System.out.println("2:Delete an element");
			System.out.println("3:Display");
			System.out.println("4:Display front element");
			System.out.println("5:Check if two queues are equal");
			System.out.println("6:Exit");

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
					Queue another = new Queue(n);
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
				case 6:break;
				default:System.out.println("Wrong option");
			}
		}
	}

	

}
