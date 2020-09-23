/**
 * 
 */
package Sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author Adam
 *
 */
class SortTest {

	private static int count = 0;
	
	@Before
	public void setUp() {
		count++;
		System.out.println("Test " + count);
	}

	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testInsertionSort() {
		int[] arr = { 7, 12, 15, 27, 3, 9, 87, 5 };
		int[] newArr = SortingAlgorithms.insertionSort(arr);
		assertEquals("[3, 5, 7, 9, 12, 15, 27, 87]", Arrays.toString(newArr));
	
		int[] arr2 = { 9 };
		int[] newArr2 = SortingAlgorithms.insertionSort(arr2);
		assertEquals("[9]", Arrays.toString(newArr2));
		
		int[] arr3 = {9 , 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
		int[] newArr3 = SortingAlgorithms.insertionSort(arr3);
		assertEquals("[9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]", Arrays.toString(newArr3));

	}
	
	@Test
	public void testMergeSort() {
		int[] arr = { 7, 12, 15, 27, 3, 9, 87, 5 };
		int[] newArr = SortingAlgorithms.mergeSort(arr);
		assertEquals("[3, 5, 7, 9, 12, 15, 27, 87]", Arrays.toString(newArr));
	
		int[] arr2 = { 9 };
		int[] newArr2 = SortingAlgorithms.mergeSort(arr2);
		assertEquals("[9]", Arrays.toString(newArr2));
		
		int[] arr3 = {9 , 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
		int[] newArr3 = SortingAlgorithms.mergeSort(arr3);
		assertEquals("[9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]", Arrays.toString(newArr3));

	}
	
	@Test
	public void testInsertionSortComparator() {
		String[] str = { "Liam", "Fredrik", "Adam", "Johana", "Podil" };
		Comparator<String> c = String::compareToIgnoreCase;
		String[] newStr = SortingAlgorithms.insertionSort(str, c);
		assertEquals("[Adam, Fredrik, Johana, Liam, Podil]", Arrays.toString(newStr));
		
		String[] str2 = { "Adam"};
		String[] newStr2 = SortingAlgorithms.insertionSort(str2, c);
		assertEquals("[Adam]", Arrays.toString(newStr2));
		
		String[] str3 = { "Adam, Adam, Adam, Johanna"};
		String[] newStr3 = SortingAlgorithms.insertionSort(str3, c);
		assertEquals("[Adam, Adam, Adam, Johanna]", Arrays.toString(newStr3));
	}
	
	@Test
	public void testMergeSortComparator() {
		
		String[] str = { "Liam", "Fredrik", "Adam", "Johana", "Podil" };
		Comparator<String> c = String::compareToIgnoreCase;
		String[] newStr = SortingAlgorithms.mergeSort(str, c);
		assertEquals("[Adam, Fredrik, Johana, Liam, Podil]", Arrays.toString(newStr));
		
		String[] str2 = { "Adam"};
		String[] newStr2 = SortingAlgorithms.mergeSort(str2, c);
		assertEquals("[Adam]", Arrays.toString(newStr2));
		
		String[] str3 = { "Adam, Adam, Adam, Johanna"};
		String[] newStr3 = SortingAlgorithms.mergeSort(str3, c);
		assertEquals("[Adam, Adam, Adam, Johanna]", Arrays.toString(newStr3));
	}
	
	
}
