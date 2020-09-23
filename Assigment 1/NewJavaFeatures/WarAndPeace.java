/**
 * 
 */
package NewJavaFeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Adam
 *
 */
public class WarAndPeace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = null;
		try {
			text = readText("/Users/Adam/Desktop/LNU/WarAndPeace.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   // My own method
		String[] words = text.split(" ");  // Simple split, will be cleaned up later on
		System.out.println("Initial word count: "+words.length);   // We found 577091
				
		Stream<String> stream = Arrays.stream(words);
		
		long counter = stream.map(word -> word.toLowerCase().replaceAll("[^a-z-']", "")).distinct().count();
			
		System.out.println("Number of unique words: " + counter);
	}
	

	
	
	
	private static String readText(String path) throws IOException {
		// TODO Auto-generated method stub
		return new String(String.valueOf(Files.readAllLines(
                Paths.get(path))));
	}

}
