package ConditionalStatements;

public class Largestofthreenumbers {

	public static void main(String[] args) {
		double n1 = -1.0, n2 = 4.5, n3 = -5.3;
		if ((n1 > n2) && (n1>n3)) {
			System.out.println(n1 + " is largest number of three numbers");

		} else {

			if (n2 > n3) {
				System.out.println(n2 + " is the largest of three numbers");
			} else {
				System.out.println(n3 + " is the largest of three numbers");
			}
		}

	}

}
