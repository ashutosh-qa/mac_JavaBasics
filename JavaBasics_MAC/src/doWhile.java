import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int value=0;
		
		do {
			System.out.println("Enter the number:");
			value=scan.nextInt();
		}
		while (value !=5);
		System.out.println("Got 5!!!");

	}

}
