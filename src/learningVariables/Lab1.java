package learningVariables;

public class Lab1 {

	public static void main(String[] args) {

		short length = 23, breadth = 10;
		int areaOfRectangle = length * breadth;

		System.out.println("Area of Triangle=" + areaOfRectangle);

		int perimeterOfRectangle = 2 * (length + breadth);

		System.out.println("Perimeter of Triangle=" + perimeterOfRectangle);
		
		int quotient = length/breadth;
		System.out.println("Quotient="+quotient);
		
		int reminder = length%breadth;
		System.out.println("Reminder="+reminder);
		
		

	}

}
