package Count_Words;

import java.io.File;
import java.util.Scanner;


public class WordCount2Main {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/Adam/Desktop/LNU/words.txt");
			Scanner scan = new Scanner(file);
			
			HashWordSet set = new HashWordSet(); 
			TreeWordSet set2 = new TreeWordSet();
			
			
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
