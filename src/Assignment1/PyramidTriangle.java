package Assignment1;

public class PyramidTriangle {
	public static void main(String args[]) 
	{ 
	System.out.println("Pyramid pattern of star in Java : "); 
	drawPyramidPattern(); 
	}
	public static void drawPyramidPattern() 
	{ 
	for (int i = 0; i < 10; i++) 
	{ 
	for (int j = 0; j < 10 - i; j++) 
	{ 
	System.out.print(" "); 
	} 
	for (int k = 0; k <= i; k++) 
	{ 
	System.out.print(" 0"); 
	} 
	System.out.println(); 
	}
	}
}
