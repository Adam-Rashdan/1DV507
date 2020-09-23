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
public class WordCount1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try {
		
		File file = new File("/Users/Adam/Desktop/LNU/words.txt");
		Scanner scan = new Scanner(file);
		
		HashSet<Word> set = new HashSet<>();
		TreeSet<Word> set2 = new TreeSet<>();
		
		
		while (scan.hasNext()) {
			Word word = new Word(scan.next());
			set.add(word);
			set2.add(word);
		}
		
		System.out.println("Hash words: " + set.size() +" words: "+ set.toString()+"\n");
		System.out.println("Tree words: " + set.size() +" words: "+ set2.toString());
		
		scan.close();
		
		} catch (Exception e) {
			
			e.getStackTrace();
		}
		
	
	}

}
