package intCollection;

public class CollectionMain {

	public static void main(String[] args) {
		
		ArrayIntList list = new ArrayIntList () ;
		
		list.add(10);
		// Print 6
		System.out.println(list.get(0));
	
		// Print 0 
		System.out.println(list.indexOf(10));
		
		// Print -1 (1 does not exist in list)
		System.out.println(list.indexOf(1));
		
		list.remove(0);
	
		// Print -1 (5  removed)
		System.out.println(list.indexOf(6));
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// Print 2 (index of 3)
		System.out.println(list.indexOf(3));
		
		list.addAt(777, 4);
		
		// Print 4 (the index of 555)
		System.out.println(list.indexOf(555));
		
		
		ArrayIntStack stack = new ArrayIntStack();
		
		stack.push(666);
		stack.push(777);
		stack.push(888);
		
		System.out.println("\n"+stack.peek()+"\n");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		

	}

}
