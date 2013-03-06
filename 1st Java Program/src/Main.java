
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Hello! This is a calculater.");
		System.out.println("Made by Abraham Close!");
		System.out.println("Type the first number.");
		Scanner input = new Scanner( System.in );
		int num1;
		int num2;
		String operation;
		System.out.println("What operation? (+,-,*,/)");
		operation = input.next();
		if (operation.equals("square")) {
			System.out.println(num1);
		}
		num1 = input.nextInt();
		System.out.println("Type the second number.");
		num2 = input.nextInt();
		if (operation.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operation.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operation.equals("*")) {
			System.out.println(num1 * num2);
		} else if (operation.equals("/")) {
			System.out.println(num1 / num2);
		} 
	}

}
