package Count_Words;

public class Word implements Comparable<Word>  {

	private String word;

	   public Word(String str) {
		   
		   this.word = str.toLowerCase() ;
		   
		   }
	   
	   public String toString() { 
		 
		   return word;
		   
		   }

	   /* Override Object methods */
	   public int hashCode() { 
		   
		   return word.hashCode();
		   
	   }
	   
	   
	   public boolean equals(Object other) {
		   
		   if (word.hashCode() == other.hashCode()) {
	           
			   return true;
		   }
		   
	        return false;
	        
		   }
	
	
	
	@Override
	public int compareTo(Word o) {
		
		return this.word.compareTo(o.word);
	}
	
	

}
