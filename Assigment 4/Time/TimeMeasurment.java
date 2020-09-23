/**
 * 
 */
package Ar223hf_assign4;



/**
 * @author Adam
 *
 */
public class TimeMeasurment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	for(int i = 0 ; i < 5 ; i++) {
		
		//oneCharacterString();
		//eightyCharactersString();
		//oneCharacterStringBuilder();
		eightyCharactersStringBuilder();

	  }
	
	}
	public static void oneCharacterString () {
		
		String str = "";
		long startTime = System.currentTimeMillis();
		
		while (System.currentTimeMillis() - startTime < 1000) {
			str += "a";
		}
		
		long endTime = System.currentTimeMillis();
		
		int executionTime = (int) (endTime - startTime);
		
		System.out.println("Execution time: " + executionTime + " milliseconds." + " Total concatenations: "
				+ str.length() + ".  Total length: " + str.length() + "\n");
		
	}
	
	public static void eightyCharactersString () {
		
		String str = "";
		long startTime = System.currentTimeMillis();
		
		while (System.currentTimeMillis() - startTime < 1000) {
			
				str += "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab";
			
		}
		
		long endTime = System.currentTimeMillis();
		
		int executionTime = (int) (endTime - startTime);
		
		System.out.println("Execution time: " + executionTime + " milliseconds." + " Total concatenations: "
				+ (str.length()/ 80) + ".  Total length: " + str.length() + "\n");
		
	}
	
	public static void oneCharacterStringBuilder () {
		
		StringBuilder builder = new StringBuilder();
		long startTime = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - startTime < 1000) {
			builder.append("a");
		}
		
		long endTime = System.currentTimeMillis();
		int executionTime = (int) (endTime - startTime);
		
		long beforeToStringTime = System.currentTimeMillis();
		builder.toString();
		long afterToStingTime = System.currentTimeMillis();
		
		int toStringTime = (int) (afterToStingTime - beforeToStringTime);
		
		StringBuilder builder2 = new StringBuilder();
		long startTime2 = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime2 < 1000 - toStringTime) {
			builder2.append("a");
		}
		long endTime2 = System.currentTimeMillis();
		int executionTime2 = (int) (endTime2 - startTime2);
		
		System.out.println("Before ToString:  Execution time: " + executionTime + " milliseconds."+ " Total concatenations: " + builder.length() +
				".  Total length: " + builder.length());
		
		System.out.println("ToString time: " + toStringTime + " milliseconds.");
		
		System.out.println("After ToString:  Execution time: " + (executionTime2 + toStringTime)
				+ " milliseconds.  Total concatenations: " + builder2.length() + ".  Total Length: "
				+ builder2.length() + "\n");
		
	}
	
	public static void eightyCharactersStringBuilder() {
		
		StringBuilder builder = new StringBuilder();
		long startTime = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - startTime < 1000) {
			builder.append("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
		}
		
		long endTime = System.currentTimeMillis();
		int executionTime = (int) (endTime - startTime);
		
		long beforeToStringTime = System.currentTimeMillis();
		builder.toString();
		long afterToStingTime = System.currentTimeMillis();
		
		int toStringTime = (int) (afterToStingTime - beforeToStringTime);
		
		StringBuilder builder2 = new StringBuilder();
		long startTime2 = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime2 < 1000 - toStringTime) {
			builder2.append("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab");
		}
		long endTime2 = System.currentTimeMillis();
		int executionTime2 = (int) (endTime2 - startTime2);
		
		System.out.println("Before ToString:  Execution time: " + executionTime + " milliseconds."+ " Total concatenations: " + builder.length() +
				".  Total length: " + builder.length());
		
		System.out.println("ToString time: " + toStringTime + " milliseconds.");
		
		System.out.println("After ToString:  Execution time: " + (executionTime2 + toStringTime)
				+ " milliseconds.  Total concatenations: " + builder2.length() + ".  Total Length: "
				+ builder2.length() + "\n");
		
	}
	
	
	

}
