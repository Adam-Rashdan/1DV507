/**
 * 
 */
package Queue;

import java.util.Iterator;

/**
 * @author Adam
 *
 */
public class ArrayQueueMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayQueue array = new ArrayQueue();
	
		
		
    	array.enqueue("one");
    	array.enqueue("two");
    	array.enqueue("three");
    	array.enqueue("four");
    	array.enqueue("five");
    	
    	array.dequeue();
    	array.dequeue();
    	
    	
    	array.enqueue("six");
    	array.enqueue("seven");
    	array.enqueue("eight");
    	array.enqueue("nine");
    	
    	System.out.println(array.toString());
    	System.out.println("The queue has "+array.size()+" elements");
    	System.out.println("First element in the queue: "+array.first());
    	System.out.println("Last element in the queue: "+array.last());
    	System.out.println("------------------------------------------------\n");
    	
    	array.dequeue();
    	System.out.println(array.toString());
    	System.out.println("The queue has "+array.size()+" elements");
    	System.out.println("First element in the queue: "+array.first());
    	System.out.println("Last element in the queue: "+array.last());
    	System.out.println("------------------------------------------------\n");
    	if(array.isEmpty())
    		System.out.println("Queue is empty");
    	
    	else
    		System.out.println("Queue is not empty");
    	
    	System.out.println("------------------------------------------------\n");
		Iterator <Object>itr = array.iterator();
    	System.out.print("Queue elements: ");
        while(itr.hasNext())
           System.out.print(itr.next() + " ");
        

	}

}
