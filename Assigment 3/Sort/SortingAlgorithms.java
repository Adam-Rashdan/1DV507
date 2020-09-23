/**
 * 
 */
package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * @author Adam
 *
 */
public class SortingAlgorithms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = { 7, 12, 15, 27, 3, 9, 87, 5 };
		System.out.println("unsorted int array: " + Arrays.toString(arr));
		int[] newarr = insertionSort(arr);
		System.out.println("sorted int array by insertion sort: " + Arrays.toString(newarr)+"\n");

		System.out.println("**********************************************************************\n");

		int[] mergeSortInt = mergeSort(arr);
		System.out.println("unsorted array: " + Arrays.toString(arr));
		System.out.println("sorted int array by merge sort: " + Arrays.toString(mergeSortInt)+"\n");
		System.out.println("**********************************************************************\n");

		String[] stringArr = { "Liam", "Fredrik", "Adam", "Johana", "Podil" };
		Comparator<String> c = String::compareToIgnoreCase;
		String[] stout = insertionSort(stringArr, c);
		System.out.println("unsorted String array: " + Arrays.toString(stringArr));
		System.out.println("sorted String array by insertion sort: " + Arrays.toString(stout)+"\n");

		System.out.println("**********************************************************************\n");

		String[] string = { "Liam", "Fredrik", "Adam", "Johana", "Podil" };
		String[] mergeSortStr = mergeSort(string, c);
		System.out.println("unsorted String array: " + Arrays.toString(string));
		System.out.println("sorted String array by merge sort: " + Arrays.toString(mergeSortStr));

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
	

