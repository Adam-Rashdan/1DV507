package intCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
		
		if (size >= values.length) 
			
			resize();
		
		values[size] = n;
		size++;
		
		
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		
		values[index] = n;
		size++;
		
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		
		values[index] = 0;
		size--;	
		
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		
		if (!checkIndex(index,size)) 
			
			return -1;
			
		return values[index];
	}

	@Override
	public int indexOf(int n) {
		
		for (int i = 0 ; i < size ; i++) {
			
			if (values[i] == n)
				
				return i ; 
		}
			
		return -1;
	}
	
	

}
