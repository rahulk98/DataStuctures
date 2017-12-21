
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		StackInt arr = new StackInt();
		Scanner s = new Scanner(System.in);
		int ch = -1;
		while(ch !=10){
		System.out.println("Enter an option");
		System.out.println("1:Insert an element");
		System.out.println("2:Delete an element");
		System.out.println("3:Display");
		System.out.println("4:Peek");
		System.out.println("5:Top");
		System.out.println("6:Exit");
		ch = s.nextInt();
		switch(ch){
			case 1:{
				System.out.println("Enter an element");
				int n = s.nextInt();
				arr.push(n);
				break;
			}
			case 2:arr.pop();
			break;
			
			case 3: arr.print();
				break;
			case 4: System.out.println(arr.peek());
				break;
			
			case 5: System.out.println(arr.getTop());
					break;
			
				
			case 6:break;
			default:System.out.println("Wrong option");
		}
	}

	}
	

}
