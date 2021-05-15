package learningVariables;

public class LearningMethods {

	public static void main(String[] args) {

		LearningMethods obj = new LearningMethods();

		int d = obj.sum(7, 15);
		System.out.println(d);

		System.out.println(obj.sum(5, 10));

		System.out.println(mul(5, 10));
	}

	
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int mul(int a, int b) {
		return a * b;
	}
}
/**
 * Access Modifier is public return type is int function name is sum
 * 
 * @param a
 *            : first no
 * @param b
 *            : second no
 * @return : result of a+b as integer
 */