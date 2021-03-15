package learningVariables;

public class ConstructorExample {

	

	int totalCTC = 100000;
	int a;
	float b;
	String s;
	
	public ConstructorExample() {
		
		totalCTC = 200000;
		a=10;
		b=2.5f;
		s="tax";
		System.out.println("nonparcon"+a+","+b+","+s);
	}

	public int getTotalCTC() {
		return totalCTC;
	}

	public void setTotalCTC(int totalCTC) {
		this.totalCTC = totalCTC;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	

	public ConstructorExample(int totalCTC, int a, float b, String s) {
		super();
		this.totalCTC = totalCTC;
		this.a = a;
		this.b = b;
		this.s = s;
		
		//System.out.println("parcon"+a+","+b+","+s);
	}

	public static void main(String[] args) {
		
		ConstructorExample npc = new ConstructorExample();
		
		System.out.println("a =" + npc.getA());
		
		ConstructorExample pc = new ConstructorExample(11,12, 12.5f, "rebate");
		
				System.out.println("a =" + pc.getA());
				
				pc.setA(4);

				System.out.println("a =" + pc.getA());
	}

}
