package Loops;

public class PrimeNumbers {

	public static void main(String[] args) {
		int A = 2, B = 10;

		while (A < B) {
			boolean flag = false;

			for (int i = 2; i <= A / 2; ++i) {

				if (A % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && A != 0 && A != 1)
				System.out.print(A + " ");

			++A;
		}

	}

}
