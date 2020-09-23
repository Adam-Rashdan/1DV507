package Queue;





public class QueueMain {

	public static void main(String[] args) {
		
		LinkedQueue queue = new LinkedQueue();
		
		queue.enqueue(3);
    	queue.enqueue(6);
    	queue.enqueue(9);
    	queue.enqueue(12);
    	queue.enqueue(15);
    	queue.enqueue(18);
    	

		System.out.println("Is Empty ? " + queue.isEmpty());
		System.out.println("Current size: " + queue.size());
		System.out.println("Current queue: " + queue.toString());

		System.out.println("First: " + queue.first());
		System.out.println("Last: " + queue.last());

		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Current size: " + queue.size());
		System.out.println("Current queue: " + queue.toString());

		queue.dequeue();
		queue.dequeue();
		System.out.println("Current size: " + queue.size());
		System.out.println("Current queue: " + queue.toString());
		queue.dequeue();
		System.out.println("Is Empty? " + queue.isEmpty());
		
		
    

	}

}
