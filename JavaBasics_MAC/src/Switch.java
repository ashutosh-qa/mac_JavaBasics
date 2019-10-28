import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your command:");
		
		String text=input.nextLine();
		
		switch (text) {
		case "start":
		System.out.println("Machine Started");
		break;
		
		case "stop":
		System.out.println("Machine Stopped");
		break;
		
		default:
		System.out.println("Invalid Command");
		
		
		}

	}

}
