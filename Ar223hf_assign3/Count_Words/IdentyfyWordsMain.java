/**
 * 
 */
package Count_Words;

import java.io.*;
import java.util.*;

/**
 * @author Adam
 *
 */
public class IdentyfyWordsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			
			File in = new File("/Users/Adam/Desktop/LNU/HistoryOfProgramming.txt");
			Scanner scan = new Scanner(in);
			scan.useDelimiter("[^a-zA-Z\\s]+");
		
			File out = new File("/Users/Adam/Desktop/LNU/words.txt");
			FileWriter writert = new FileWriter(out);
			BufferedWriter bWriter = new BufferedWriter(writert);

			while (scan.hasNext()) {
				String word = (scan.next());
				
				bWriter.write(word);
			}
					
			bWriter.close();
			scan.close();
			System.out.println("New folder has been created");
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
