package LearnArrays;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=5, s=1;
		
		for(int i=0;i<r; i++) {
			int j= r-i-1;
			for(; j>0 ;j--) {
				System.out.print("*");
			}
			int k = i*2 +1;
			for(; k>0 ; k--) {
				System.out.print(s + " ");
				s++;
			}
			System.out.println("");	
		}
	}

}
