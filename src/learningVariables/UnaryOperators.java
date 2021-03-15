package learningVariables;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int n1 = 4, n2 = 5;
		
        int n3 = n1++ + ++n2;    //4+6
        System.out.println(n3);
        
        n3 = n1++ + ++n2;        //5+7
        System.out.println(n3);
        
        int n4 = (++n1 + n2++) + n1;  //7+7 =14 +6+1
        System.out.println(n4);
        
        int n5 = (++n1 + n2++) + n2;  //8+8+8+1
        System.out.println(n5);
        
        int n6 = n2 + (++n1 + n2++);   //9+9+9
        System.out.println(n6);


	}

}
