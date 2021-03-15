package ConditionalStatements;

import java.util.Scanner;

public class LearnIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		if (x > 0) {

			System.out.println(x + " is positive number");

		} else if (x == 0) {
			System.out.println(x + " is neither negative nor positive");
		}

		else {
			System.out.println(x + " is negative number");

		}

	}

}
