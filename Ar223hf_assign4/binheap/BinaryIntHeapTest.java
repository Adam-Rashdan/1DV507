package binheap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryIntHeapTest {
	
	//BinaryIntHeap bHeap = new BinaryIntHeap();

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
    void isEmptyTest() {
        
		BinaryIntHeap bHeap = new BinaryIntHeap();

        assertTrue(bHeap.isEmpty());

        bHeap.insert(1);
        assertFalse(bHeap.isEmpty());
    }
	
	@Test
    void toStringTest() {
		BinaryIntHeap bHeap = new BinaryIntHeap();
		assertEquals(bHeap.toString(), "[]");

        bHeap.insert(1);
        bHeap.insert(2);
        bHeap.insert(3);
        bHeap.insert(4);
        assertEquals(bHeap.toString(), "[4,3,2,1]"); 
    }
	
	 @Test
	    void insertTest() {
	        
		 BinaryIntHeap bHeap = new BinaryIntHeap();

		 	bHeap.insert(1);
	        bHeap.insert(2);
	        bHeap.insert(3);
	        bHeap.insert(4);
	        assertEquals(bHeap.toString(), "[4,3,2,1]");

	        
	        bHeap.insert(5);
	        assertEquals(bHeap.toString(), "[5,4,2,1,3]");

	       
	        bHeap.insert(0);
	        assertEquals(bHeap.toString(),"[5,4,2,1,3,0]");
	        
	        bHeap.insert(5);
	        assertEquals(bHeap.toString(), "[5,4,5,1,3,0,2]");

	        
	    }
	 
	 @Test
	    void pullHighestTest() {
		 BinaryIntHeap bHeap = new BinaryIntHeap();

		 	bHeap.insert(1);
	        bHeap.insert(2);
	        bHeap.insert(3);
	        bHeap.insert(4);
	        bHeap.insert(5);
	      
	        assertEquals(5, bHeap.pullHighest());
	        assertEquals(bHeap.toString(), "[4,3,2,1]");

	      
	       assertEquals(4, bHeap.pullHighest());
	       assertEquals(bHeap.toString(), "[3,1,2]");

	    }
	 
	 @Test
	    void sizeTest() {
		 BinaryIntHeap bHeap = new BinaryIntHeap();
	        assertEquals(bHeap.size(), 0);

	    	bHeap.insert(12);
	        bHeap.insert(21);
	        bHeap.insert(32);
	        bHeap.insert(47);
	        bHeap.insert(55);
	        bHeap.insert(97);
	        bHeap.insert(75);
	        
	        assertEquals(bHeap.size(), 7);

	        bHeap.pullHighest();
	        assertEquals(bHeap.size(), 6);

	        bHeap.pullHighest();
	        bHeap.pullHighest();
	        bHeap.pullHighest();
	        bHeap.pullHighest();
	        bHeap.pullHighest();
	        bHeap.pullHighest();
	      
	        assertEquals(bHeap.size(), 0);

	        bHeap.insert(11);
	        assertEquals(bHeap.size(), 1);
	    }


}
