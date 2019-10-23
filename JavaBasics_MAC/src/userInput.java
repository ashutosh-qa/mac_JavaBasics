import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input your details:");
		
		String s=input.nextLine();
		System.out.println("You entered: "+s);
		
		
		int i=input.nextInt();
		System.out.println("You entered: "+i);
		
		double d=input.nextDouble();
		System.out.println("You entered: "+d);
		
		
	}

}
