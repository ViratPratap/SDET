package Assignment1;

import java.util.Scanner;

public class areaoftriangle {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the Triangle:");
		double length = scanner.nextDouble();

		System.out.println("Enter the height of the Triangle:");
		double height = scanner.nextDouble();

		double area = (length * height) / 2;
		System.out.println("Area of Triangle is: " + area);
	}
}
