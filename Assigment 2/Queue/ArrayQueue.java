package Queue;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.*;


public class ArrayQueue implements QueueInterface {
	
	private int size = 0;
	private Object[] queue = new Object[5];
	private int first = 0;
	private int last = 0;

	
	public ArrayQueue() {

	}


	@Override
	public int size() {
		
		return size ;
	}
	
	


	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}
	
	


	@Override
	public void enqueue(Object element) {
		
		if (size == queue.length) {
			resize();
		}

		if (isEmpty()) { 
			queue[size] = element;
			first = size;
			last = first;
		} else {
			queue[size] = element;
			last = size;
		}
		size++;
	}
		
	

	@Override
	public Object dequeue() {
		
		 if (isEmpty()) 
	            throw new UncheckedIOException(new IOException("The queue is empty"));
	        
	     
		 Object obj = remove();
	     
	        return obj;
	}
	


	@Override
	public Object first() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("The queue is empty");
		}
		return queue[first];
	}
	


	@Override
	public Object last() {
		
		if (isEmpty()) 
			throw new NoSuchElementException("The queue is empty");
		
		return queue[last];
	}
	
	private void resize() {
		Object[] temp = new Object[queue.length * 2];
		for (int i = 0; i < size; i++) {
			temp[i] = queue[i];
		}
		queue = temp;
	}
	
	
	private Object remove() {
		Object[] temp = new Object[queue.length];
		Object object = queue[first];
		for (int i = 0; i < size - 1; i++) {
			temp[i] = queue[i + 1];
		}
		queue = temp;
		last = last - 1;
		
		size--;
		return object;

	}
	

	@Override
	 public String toString() {
	       
		StringBuilder builder = new StringBuilder();
	       
	        
	        for (int i = 0; i < size; i++) {
				builder.append(queue[i] + " ");
			}

	        return "[" + builder.toString() + "]";
	    }

	@Override
	public Iterator<Object> iterator() {
		
		return new ArrayQueueIterator() ;
	}
	
	private class ArrayQueueIterator implements Iterator<Object>{
		
		private int index = 0;
		
		
		@Override
		public boolean hasNext() {
		
			return index <= size;
		}

		@Override
		public Object next() {
			
			return (Object) queue[index++];
		}
		
		
	}
	
	

}
