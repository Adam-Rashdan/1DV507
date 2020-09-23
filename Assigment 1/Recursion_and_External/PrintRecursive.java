/**
 * 
 */
package Recursion_and_External;

/**
 * @author Adam
 *
 */
public class PrintRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		 String str = "Hello Everyone!";
		
		   print(str, 0);
		   System.out.println(); // Line break
		   printReverse(str, 0);

	}
	
	public static void print(String str, int pos) {
		
		if(pos < str.length()){
            System.out.print(str.substring(pos,pos+1));
            pos++;
            print(str,pos);
		
	}
	}
		
		private static void printReverse(String str, int pos) {
			
			if(pos < str.length()) {
		            System.out.print(str.substring(str.length()-pos-1,str.length()-pos));
		            pos++;
		            printReverse(str,pos);
		        }
	    }
	
	
}