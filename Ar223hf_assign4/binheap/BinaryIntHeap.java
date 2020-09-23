package binheap;

public class BinaryIntHeap {

	private int size;
	private static int[] heap;
	private int pos;
	private int currentSize;

	public BinaryIntHeap() {
		pos = 1;
		size = 8;
		currentSize = 0;
		heap = new int[size];
	}

	// Add n to heap
	public void insert(int n) {

		if (pos == size)
			resize();

		heap[pos] = n;
		pos++;
		currentSize++;

		int child = pos - 1;
		int parent = child / 2;

		while (heap[parent] < heap[child] && parent > 0) {
			int temp = heap[parent];
			heap[parent] = heap[child];
			heap[child] = temp;

			child = parent;
			parent = child / 2;
		}

	}

	// Return and remove element with highest priority
	public int pullHighest() {
		int highest = 0;
		if (isEmpty()) {
			throw new IllegalArgumentException("Queue is Empty");
		}

		else if (currentSize == 1) {
			highest = heap[1];
			heap[1] = heap[0];
			currentSize--;
		} else {
			highest = heap[1];
			heap[1] = heap[size - 1];
			compareAndSwap();
			currentSize--;
		}
		return highest;
	}

	// return current heap size
	public int size() {
		return currentSize;

	}

	// return true if heap is empty
	public boolean isEmpty() {
		return currentSize == 0;
	}

	private static void compareAndSwap() {
		int k = 1;
		int left = 2 * k;
		while (left < heap.length) {
			int max = left;
			int right = left + 1;
			if (right < heap.length) {
				if (heap[right] > heap[left]) {
					max++;
				}
			}
			if (heap[k] < heap[max]) {
				int temp = heap[k];
				heap[k] = heap[max];
				heap[max] = temp;
				k = max;
				left = 2 * k;
			} else
				break;
		}
	}

	private void resize() {
		int[] temp = new int[2 * size];
		System.arraycopy(heap, 0, temp, 0, heap.length);
		heap = temp;
		size = 2 * size;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 1; i <= currentSize; i++) {
			builder.append(heap[i]);
			
			if (i != currentSize) 
                builder.append(",");
            
		}
	
		builder.append("]");
		return builder.toString();
	}

}
