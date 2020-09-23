package Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * This class implements Queue interface
 * @author Adam Rashdan
 * @versio 1.0
 *
 */

public class LinkedQueue implements QueueInterface {

	private int size = 0;
	private Node head;
	private Node tail;

	public LinkedQueue() {

	}
	
	/**
	 * Returns an integer represent the size of the queue
	 */

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	/**
	 * Returns true if the queue is empty and false if not
	 */

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	
	/**
	 * Adds element at end of queue 
	 */
	
	@Override
	public void enqueue(Object element) {

		Node node = new Node();

		if (isEmpty()) {
			node.value = element;
			head = node;
			tail = head;

		} else {

			node.value = element;
			tail.next = node;
			tail = tail.next;
		}
		size++;
	}
	
	/**
	 * Returns and removes first element
	 */

	@Override
	public Object dequeue() {

		if (isEmpty())
			throw new NoSuchElementException();

		Object obj = head.value;
		head = head.next;
		size--;
		return obj;
	}
	
	/**
	 * Returns (without removing) first element
	 */

	@Override
	public Object first() {

		if (isEmpty())
			throw new NoSuchElementException();

		else
			return head.value;

	}
	
	/**
	 * Return (without removing) last element 
	 */

	@Override
	public Object last() {

		if (isEmpty())
			throw new NoSuchElementException();

		else
			return tail.value;
	}
	
	/**
	 * Returns a string representation of the object. 
	 */

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		Node node = new Node();
		node = head;
		builder.append("[ ");
		while (node != null) {
			builder.append(node.value + " ");
			node = node.next;
		}

		builder.append("]");

		return builder.toString();
	}
	
	/**
	 * Iterates through all elements of queue.
	 */

	@Override
	public Iterator<Object> iterator() {

		return new LinkedQueueIterator();
	}

	private class LinkedQueueIterator implements Iterator<Object> {

		private Node position = head;

		@Override
		public boolean hasNext() {

			return (position != null);
		}

		@Override
		public Object next() {

			if (!hasNext())
				throw new NoSuchElementException();

			if (position == null)
				position = head;

			else
				position = position.next;

			return position.value;

		}

	}

	private class Node {

		private Object value;
		private Node next;

	}

}
