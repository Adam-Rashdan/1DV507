/**
 * 
 */
package Ar223hf_assign4;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * @author Adam
 *
 */
public class SortingTimeMeasurment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//	insertionSortTimeForInteger();
			
		//	insertionSortTimeForString();
			
		//	mergeSortTimeForInteger();
			
			mergeSortTimeForString();
		
		
		

	}
	
	public static void insertionSortTimeForInteger() {

		int[] list = randomIntArray(20, 40);
		int executionTime = 0;
		while (executionTime < 1000) {
			long beforeSorting = System.currentTimeMillis();
			insertionSort(list);
			long afterSorting = System.currentTimeMillis();
			executionTime = (int) (afterSorting - beforeSorting);
			System.out.println("Insertion Sort Time For Integer: " + executionTime + " millisec.  Total length: " + list.length);
			
			
			if (executionTime == 999 || executionTime == 1000 || executionTime == 1001) { 
				break;
			} else if (executionTime > 1001 && executionTime <= 1050) {
				list = randomIntArray(list.length - 1, list.length * 2); 
				executionTime = 0;
			} else if (executionTime > 1050) {
				list = randomIntArray(list.length - 500, list.length * 2);
				executionTime = 0;
			} else if (executionTime <= 950) {
				list = randomIntArray(list.length + 1000, list.length * 2);
				executionTime = 0;
			} else {
				list = randomIntArray(list.length + 1, list.length * 2);
			}
		}
	}
	
	
	public static void mergeSortTimeForInteger() {

		int[] list = randomIntArray(20, 40);
		int executionTime = 0;
		while (executionTime < 1000) {
			long beforeSorting = System.currentTimeMillis();
			mergeSort(list);
			long afterSorting = System.currentTimeMillis();
			executionTime = (int) (afterSorting - beforeSorting);
			System.out.println(
					"Merge Sort Time For Integer: " + executionTime + " millisec.  Total length: " + list.length);

			if (executionTime == 999 || executionTime == 1000 || executionTime == 1001) {
				break;
			} else if (executionTime > 1001 && executionTime <= 1050) {
				list = randomIntArray(list.length - 1, list.length * 2);
				executionTime = 0;
			} else if (executionTime <= 950) {
				list = randomIntArray(list.length + 1000, list.length * 2);
			} else if (executionTime > 1050) {
				list = randomIntArray(list.length - 1000, list.length * 2);
			} else {
				list = randomIntArray(list.length + 1, list.length * 2);
			}
		}
	}
	
	
	public static void insertionSortTimeForString() {

		String[] list = randomStringArray(100, 300);
		Comparator<String> c = null;
		int executionTime = 0;
		while (executionTime < 1000) {
			long beforeSorting = System.currentTimeMillis();
			insertionSort(list, c);
			long afterSorting = System.currentTimeMillis();
			executionTime = (int) (afterSorting - beforeSorting);
			System.out.println(
					"Insertion Sort Time For String: " + executionTime + " millisec.  Total length: " + list.length);

			if (executionTime == 999 || executionTime == 1000 || executionTime == 1001) {
				break;
			} else if (executionTime > 1001 && executionTime <= 1050) {
				list = randomStringArray(list.length - 1, list.length * 2);
				executionTime = 0;
			} else if (executionTime > 1050) {
				list = randomStringArray(list.length - 500, list.length * 2);
				executionTime = 0;
			} else if (executionTime <= 950) {
				list = randomStringArray(list.length + 1000, list.length * 2);
			} else {
				list = randomStringArray(list.length + 1, list.length * 2);
			}
		}
	}
	
	
	public static void mergeSortTimeForString() {
		
		String[] list = randomStringArray(100, 300);
		Comparator<String> c = null;
		int executionTime = 0;
		while (executionTime < 1000) {
			long beforeSorting = System.currentTimeMillis();
			mergeSort(list, c);
			long afterSorting = System.currentTimeMillis();
			executionTime = (int) (afterSorting - beforeSorting);
			System.out.println(
					" Merge Sort Time For String: " + executionTime + " millisec.  Total length: " + list.length);

			if (executionTime == 999 || executionTime == 1000 || executionTime == 1001) {
				break;
			} else if (executionTime > 1001 && executionTime <= 1050) {
				list = randomStringArray(list.length - 1, list.length * 2);
				executionTime = 0;
			} else if (executionTime > 1050) {
				list = randomStringArray(list.length - 500, list.length * 2);
				executionTime = 0;
			} else if (executionTime <= 950) {
				list = randomStringArray(list.length + 1000, list.length * 2);
			} else {
				list = randomStringArray(list.length + 1, list.length * 2);
			}
		
		}
		
	}
	
	
	
	private static int[] randomIntArray(int length, int n) {
		Random random = new Random();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(n);
		}
		return array;
	}
	
	private static String[] randomStringArray(int length, int n) {
		Random random = new Random();
		String[] array = new String[length];
		String[] alphbet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		if (n >= alphbet.length || n <= 0)
			n = alphbet.length;
		StringBuilder builder;
		for (int i = 0; i < array.length; i++) {
			builder = new StringBuilder();
			int size = 0;
			while (size != 10) {
				builder.append(alphbet[random.nextInt(n)]);
				size++;
			}
			array[i] = builder.toString();
		}
		return array;
	}
	
	
	
	public static int[] insertionSort(int[] in) {
		
		int[] newArr =new int [in.length] ; 
		
		for (int i = 0; i < in.length; i++) 
			newArr[i] = in[i];
		
		
		for (int i =  1; i < newArr.length; i++) {
			int currentElement = newArr[i];
			int k = i - 1;
		
			for (k = i - 1; k >= 0 && newArr[k] > currentElement; k--) {
				newArr[k + 1] = newArr[k];
			
			}
			newArr[k + 1] = currentElement;
				
				
		}
		return newArr;

	}
	
	public static int[] mergeSort(int[] in) {
		
		int middleVale = in.length / 2; 
		
		int[] firstHalf = new int[middleVale]; 								
		int[] secondHalf = new int[in.length - middleVale]; 
													
		System.arraycopy(in, 0, firstHalf, 0, firstHalf.length); 
		System.arraycopy(in, middleVale, secondHalf, 0, secondHalf.length); 
		
		if (in.length == 1) { 
			return in;
		}
		secondHalf = mergeSort(secondHalf); 
		firstHalf = mergeSort(firstHalf); 
		
		return mergeIntArray(firstHalf, secondHalf);  
	}
	
	public static int[] mergeIntArray(int[] firstHalf, int[] secondHalf) { 
		
		int[] temp = new int[firstHalf.length + secondHalf.length]; 
	
		int current1 = 0 ;// Current index in firstHalf
		int current2 = 0 ; // Current index in secondHalf
		int currentElement = 0; // Current index in temp
		
		while (current1 < firstHalf.length && current2 < secondHalf.length) {
			
			if (firstHalf[current1] < secondHalf[current2])
			 temp[currentElement++] = firstHalf[current1++];
			
			else
			temp[currentElement++] = secondHalf[current2++];
			
		}
			
			 while (current1 < firstHalf.length)
			 temp[currentElement++] = firstHalf[current1++];
			
			 while (current2 < secondHalf.length)
			 temp[currentElement++] = secondHalf[current2++];
	
       
        return temp;
	}
	
	public static String[] insertionSort(String[] in, Comparator<String> c){
       
		String [] newArr = new String [in.length] ; 
		
		for (int i = 0; i < in.length; i++) 
			newArr[i] = in[i];
									

		for (int i =  1; i < newArr.length; i++) {
			String currentElement = newArr[i];
			int k = i - 1;
			
			while (k >= 0) {
				if (c.compare(newArr[k], currentElement) <= 0)
					break;
				newArr[k + 1] = newArr[k];
				k--;
			}
			newArr[k + 1] = currentElement;
		}
        return newArr;
    }
	
	public static String[] mergeSort(String[] in, Comparator<String> c) {
		int middleVale = in.length / 2; 
		
		String[] firstHalf = new String[middleVale]; 								
		String[] secondHalf = new String[in.length - middleVale];
		
		System.arraycopy(in, 0, firstHalf, 0, firstHalf.length); 
		System.arraycopy(in, middleVale, secondHalf, 0, secondHalf.length); 
		if (in.length == 1) {
			return in;
		}
		secondHalf = mergeSort(secondHalf, c); 
		firstHalf = mergeSort(firstHalf, c); 
		return mergeStringArray(firstHalf, secondHalf);  
	}
	
	

	public static String[] mergeStringArray(String[] firstHalf, String[] secondHalf) { 
		String[] temp = new String[firstHalf.length + secondHalf.length];
		
		if (temp.length == 0) 
			throw new NoSuchElementException("Array is empty");
		
		int tempFirst = 0 , tempSecond = 0, currentElement = 0;
		
		while (tempFirst < firstHalf.length && tempSecond < secondHalf.length) {
			if (firstHalf[tempFirst].compareTo(secondHalf[tempSecond]) < 0) { 
				temp[currentElement++] = firstHalf[tempFirst++];
			} else {
				temp[currentElement++] = secondHalf[tempSecond++];
			}
		}
		
		while (tempFirst < firstHalf.length) {
			temp[currentElement++] = firstHalf[tempFirst++];
		}
		
		while (tempSecond < secondHalf.length) {
			temp[currentElement++] = secondHalf[tempSecond++];
		}
		
		return temp;
	}

}
