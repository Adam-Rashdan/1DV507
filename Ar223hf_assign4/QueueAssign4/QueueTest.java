package QueueAssign4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	private static int count = 0;
	
	@BeforeEach
	public void setUp() {
		System.out.println("Run test method: " + (++count));
	}

	/* Executed after every test method. */
	@AfterEach
	public void tearDown() {
		System.out.println(" --- done with test " + count);
	}
	
	@Test
	public void testSize() {
	
		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();

		assertEquals(0, intQueue.size()); 
		assertEquals(0, stringQueue.size());

		for (int i = 0; i < 100; i++) { 
			intQueue.enqueue(50);
			stringQueue.enqueue("" + 100);
		}
		assertEquals(100, intQueue.size()); 
		assertEquals(100, stringQueue.size());
	}
	
	@Test
	public void testIsEmpty() {

		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();

		assertTrue(intQueue.isEmpty());
		assertEquals(intQueue.size(), 0); 
		
		assertTrue(stringQueue.isEmpty());
		assertEquals(stringQueue.size(), 0);

		intQueue.enqueue(1); 
		stringQueue.enqueue("Johan");

		assertEquals(false, intQueue.isEmpty());
		assertEquals(false, stringQueue.isEmpty());
	}
	
	@Test
	public void testEnqueue() {
		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();

		for (int i = 0; i < 1000; i++) {
			intQueue.enqueue(i);
			stringQueue.enqueue("" + i);

			assertFalse(intQueue.isEmpty());
			assertFalse(stringQueue.isEmpty());			
		}
	}
	
	@Test
	public void testDequeue() {
		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();
		

		
		for (int i = 0; i < 100; i++) {
			intQueue.enqueue(i);
			stringQueue.enqueue("" + i);
			
		}

		
		for (int i = 0; i < 100; i++) {
			assertEquals(i, (int) intQueue.dequeue()); 
			assertEquals("" + i, stringQueue.dequeue());
			
		}
	}

	@Test
	public void testFirst() {
		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();

		for (int i = 0; i < 100; i++) { //adding to queue
			intQueue.enqueue(i);
			stringQueue.enqueue("" + i);
		}

		assertEquals(0, (int) intQueue.first());
		assertEquals("" + 0, stringQueue.first());

		

	}
	
	@Test
	public void testLast() {
		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();

		for (int i = 0; i < 100; i++) { //adding to queue
			intQueue.enqueue(i);
			stringQueue.enqueue("" + i);
			
			assertEquals(i, (int) intQueue.last());
			assertEquals("" + i, stringQueue.last());
		}

		
	}
	
	@Test
	public void testString() {
		
		Queue<Integer> intQueue = new LinkedQueue<Integer>();
		Queue<String> stringQueue = new LinkedQueue<String>();

		String str = "[ ]";
		assertEquals(str, intQueue.toString());
		assertEquals(str, stringQueue.toString());

	}

	@Test
	public void testIterator() {
		
		Queue<Integer> intQueue = new LinkedQueue<Integer>(); 
		Queue<String> stringQueue = new LinkedQueue<String>();

		Iterator<Integer> intIter = intQueue.iterator();
		Iterator<String> stringIter = stringQueue.iterator();

		assertFalse(intIter.hasNext());
		assertFalse(stringIter.hasNext());

		for (int i = 0; i < 100; i++) { //adding to queue
			intQueue.enqueue(i);
			stringQueue.enqueue("" + i);

		}
		
		int i = 0;
		while (intIter.hasNext() && stringIter.hasNext() ) {
			assertEquals(i, (int) intIter.next());
			assertEquals("" + i, stringIter.next());
			i++;
			
		}
		
	}

}
