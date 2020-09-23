package Queue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.io.UncheckedIOException;

import org.junit.jupiter.api.*;

class QueueTest {

	LinkedQueue queue = new LinkedQueue();

	ArrayQueue arrayQueue = new ArrayQueue();

	private static int count = 0;

	/* Executed before every test method. */
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
		// Test the Linked Queue
		assertEquals(0, queue.size());

		// Test the Array Queue
		assertEquals(0, arrayQueue.size());
	}

	@Test
	public void testIsEmpty() {

		// Test the Linked Queue
		assertTrue(queue.isEmpty());
		assertEquals(queue.size(), 0);

		// Test the Array Queue
		assertTrue(arrayQueue.isEmpty());
		assertEquals(arrayQueue.size(), 0);
	}
	
	@Test
	public void testEnqueue() {
	
		// Test the Linked Queue
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
		
		assertTrue(!queue.isEmpty());
		assertEquals(queue.size(), 3);
		
		Random random = new Random();
       
		for (int i = 0; i < 10000; i++) 
            queue.enqueue(random.nextInt());
        
        assertEquals(10003, queue.size());

          // Test the Array Queue
		for (int i = 0; i < 4; i++) 
			arrayQueue.enqueue(i);
		
		assertTrue(!arrayQueue.isEmpty());
		assertEquals(arrayQueue.size(), 4);
		
		for (int i = 0; i < 10000; i++) 
            arrayQueue.enqueue(random.nextInt());
        
        assertEquals(10004, arrayQueue.size());
		 
	}
	
	@Test
	public void testDequeue() {
	
		// Test the Linked Queue
		queue.enqueue(1);
		assertEquals(queue.dequeue(), 1);

		// Test the Array Queue
		arrayQueue.enqueue(1);
		assertEquals(arrayQueue.dequeue(), 1);

	}
	
	@Test
	public void testFirst() {
	
		// Test the Linked Queue
		queue.enqueue("First");

		int size = queue.size();

		assertEquals(queue.first(), "First");

		assertEquals(queue.size(), size);


		// Test the Array Queue
		arrayQueue.enqueue("Second");

		int arrSize = arrayQueue.size();

		assertEquals(arrayQueue.first(), "Second");

		assertEquals(arrayQueue.size(), arrSize);

	}
	
	@Test
	public void testLast() {
	
		// Test the Linked Queue
		for (int i = 0; i < 10; i++) 
			queue.enqueue(i);
	
		assertEquals(queue.last(), 9 );
		
		// Test the Array Queue
		for (int i = 0; i < 100000; i++) 
			arrayQueue.enqueue(i);
		
		assertEquals(arrayQueue.last(), 99999 );
		
		
	}
	
	
	
	@Test
	public void testException() {
	
	// Test the Linked Queue
	// Test if get first throws exception 
	assertTrue(queue.isEmpty());
    assertThrows(NoSuchElementException.class, () -> queue.first());
    
    // Test the Array Queue
    // Test if get first throws exception 
    assertTrue(arrayQueue.isEmpty());
    assertThrows(UncheckedIOException.class, () -> arrayQueue.dequeue());
    

	}
	

	@Test
	public void testtoString() {
		
		// Test the Linked Queue and Array Queue
		assertEquals("[ ]", queue.toString(), arrayQueue.toString());

	}



}

