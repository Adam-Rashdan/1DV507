package Count_Words;

import java.util.Iterator;

public class TreeWordSet implements WordSet {

	
	private BST root = null;
	private int size;
	private Word[] list = new Word[8];
	private int count = 0;

	public TreeWordSet() {
		size = 0;

	}
	
	
	private class BST {

		
		private Word word;
		private BST left = null;
		private BST right = null;

		
		public BST(Word word) {
			this.word = word;

		}

		
		private void add(Word word) {
			
			if (word.compareTo(this.word) < 0) {
				if (left == null) {
					left = new BST(word);
					size++;
				} else
					left.add(word);

			} else if (word.compareTo(this.word) > 0) {
				if (right == null) {
					right = new BST(word);
					size++;
				} else
					right.add(word);

			}

		}

		

		private boolean contains(Word word) {
			if (word.compareTo(this.word) < 0) {
				if (left == null)
					return false;
				else
					return left.contains(word);
			}

			else if (word.compareTo(this.word) > 0) {
				if (right == null)
					return false;
				else
					return right.contains(word);
			}
			return true;
		}

		
		private Word[] getWordArray() {
			if (left != null)
				left.getWordArray();

			if (count == list.length)
				resize();
			list[count] = word;
			count++;
			if (right != null)
				right.getWordArray();

			return list;
		}

	}

	
	
	@Override
	public void add(Word word) {
		if (root == null) {
			root = new BST(word);
			size++;

		} else {
			root.add(word);

		}

	}

	

	@Override
	public boolean contains(Word word) {
		if (size == 0)
			return false;
		else
			return root.contains(word);
	}

	
	@Override
	public int size() {
		return size;
	}

	
	@Override
	public String toString() {
		if (root == null)
			return "[ ]";
		
		else {
			StringBuilder sBuilder = new StringBuilder(); 
			 Iterator<Word> iter = iterator(); 
			 Word word;
			 sBuilder.append("[");
			 
			 while (iter.hasNext()) { 
				 word = iter.next(); 
				 sBuilder.append(word.toString()); 
				 if(iter.hasNext()) { 
					 sBuilder.append(", "); 
					 } 
				 } 
			 sBuilder.append("]");
			 return sBuilder.toString();
		}
			
		

	}

	

	private void resize() {
		Word[] temp = new Word[list.length * 2];
		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}

	@Override
	public Iterator<Word> iterator() {
		return new TreeIterator();
	}
	
	private class TreeIterator implements Iterator<Word> {

		
		private int count = 0;

		
		public TreeIterator() {
			root.getWordArray(); 
		}

		
		@Override
		public boolean hasNext() {
			if (root == null)
				return false;
			
			else if (list[count] == null)
				return false;

			else
				return count < list.length;
		}

		
		@Override
		public Word next() {
			return list[count++];
		}
	}
}
