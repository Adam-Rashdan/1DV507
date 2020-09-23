/**
 * 
 */
package Ar223hf_assign3;

/**
 * @author Adam
 *
 */
public class EuclideanMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(gcd(10,2));
		System.out.println(gcd(56, 42));
		System.out.println(gcd(24, 54));
		System.out.println(gcd(48, 180));
		System.out.println(gcd(12, 18));

	}

	
	
	public static int gcd(int num1, int num2) {
      
        if (num1 % num2 == 0) 
            return num2;
      
        else 
            return gcd(num2, num1 % num2);
        
    }
}
