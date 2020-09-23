package Count_Words;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet {

	private Node[] bucket;
	private int size;

	public HashWordSet() { 
		size = 0;
		bucket = new Node[1];
	}



	@Override
	public void add(Word word) { 
		
		 if (contains(word)) { 
			 return; }
		 
		 int position = getBucketNumber(word); 
		 
		 Node node = new Node(word); 
		 node.next = bucket[position]; 
		 bucket[position] = node;
		 
		 size ++;
		 
		 if (size == bucket.length) {  
			 rehash(); 
			 } 
		 }
	
	@Override
	public boolean contains(Word word) { 

		int position = getBucketNumber(word); 
		Node node = bucket[position]; 

		while (node != null) { 
			
			if (node.data.equals(word)) {
				return true; 
			}
			node = node.next; 
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override 
	public String toString() { 
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
	
	
	@Override
	public Iterator<Word> iterator() {
		return new HashIterator();
	}
	
	private class HashIterator implements Iterator<Word> {

		private int position;
		private Node node;

		public HashIterator () {
			node = null;
			position = -1; 
		}
		
		
		@Override
		public boolean hasNext() {
			if (node != null && node.next != null) {
				return true;
			}

			for (int i = position + 1; i < bucket.length; i++) {
				if (bucket[i] != null) {
					return true;
				}
			}
			return false;
		}
		
		
		
		@Override
		public Word next() {

			if (node == null || node.next == null) {
				
				position++;
				while (bucket[position] == null && position < bucket.length) {																	
					position++;
				}
				if (position < bucket.length) {
					node = bucket[position];
				} else {
					throw new NoSuchElementException(); 
				}
			}
		
			else {
				node = node.next; 
			}
			return node.data;
		}
	}

	private void rehash() { 
		
		Node[] temp = bucket; 
		bucket = new Node[2 * temp.length]; 
		size = 0;
		
		for (Node node : temp) { 
			if (node == null)
				continue; 
			
			while (node != null) {
				add(node.data); 
				node = node.next;
			}
		}
	}

	private int getBucketNumber(Word word) { 
		
		int hcode = word.hashCode();
		
		if (hcode < 0) {
			hcode = -hcode; 
		}
		
		hcode = hcode % bucket.length;
		return hcode;
	}
	
	private class Node { 

		public Word data;
		public Node next;

		public Node(Word word) {
			data = word;
		}
	}

}
