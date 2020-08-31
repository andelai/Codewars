package Kata;

import static org.junit.Assert.assertArrayEquals;

public class SortTheOdd {
	  public static int[] sortArray(int[] array) {
	
		  for(int i= 0; i<array.length-1; i++) {
			  for(int j= i+1; j<array.length;j++) {
				  if(array[i]%2 != 0 && array[j]%2 != 0 && array[i] > array[j]) {
					  int temp = array[i];
					  array[i] = array[j];
					  array[j] = temp;
				  }
			  }
		  }
		    return array;
		  }
	  
	  public static void main(String[] args) {
		   System.out.println("sort the odd Fixed Tests");
		   assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
		   assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, sortArray(new int[]{ 5, 3, 1, 8, 0 }));
		   assertArrayEquals(new int[]{}, sortArray(new int[]{}));

	  }
}
