package intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	@Override
	public void push(int n) {
		
		if (size >= values.length) 
			
			resize();
			 
			
			 values[size++] = n;
			 
		
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		
		if (size == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		return values[--size];
		
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		
		if (size == 0)
			throw new IllegalStateException("Stack is empty");
			
			
			return values[size - 1];
	}

}
