
package hw_1;

public class Problem_2 {

	public static void main(String[] args) {
		int nValues = 15;
		
		outerLoop:
		for (int i = 2; i <=nValues; i++) {
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if (i%j==0) {
					continue outerLoop;
					
				}
			}
			System.out.println(i);
			
		}

	}

}
