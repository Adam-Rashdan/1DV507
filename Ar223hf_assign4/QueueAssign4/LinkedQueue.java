package QueueAssign4;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class LinkedQueue<T> implements Queue<T> {
	
	private int size = 0;
	private Node head;
	private Node tail;

	public LinkedQueue() {

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public void enqueue(T element) {

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

	@Override
	public T dequeue() {

		if (isEmpty())
			throw new NoSuchElementException();

		T element = head.value;
		head = head.next;
		size--;
		return element;
	}

	@Override
	public T first() {

		if (isEmpty())
			throw new NoSuchElementException();

		else
			return head.value;

	}

	@Override
	public T last() {

		if (isEmpty())
			throw new NoSuchElementException();

		else
			return tail.value;
	}

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

	@Override
	public Iterator<T> iterator() {

		return new LinkedQueueIterator<T>();
	}

	private class LinkedQueueIterator<X> implements Iterator<X> {

		private Node position = head;

		@Override
		public boolean hasNext() {

			return (position != null);
		}

		@SuppressWarnings("unchecked")
		@Override
		public X next() {

			if (!hasNext())
				throw new NoSuchElementException();

			if (position == null)
				position = head;

			else
				position = position.next;

			return (X) position.value;

		}

	}

	private class Node {

		private T value;
		private Node next;

	}


}
