package Kata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class Max {
	  public static int sequence(int[] arr) {
		  if (arr.length == 0 || Arrays.stream(arr).allMatch(el -> el<0)) return 0;
		  
		  int maxSum = arr[0];
		  for (int i= 0; i<arr.length;i++) {
			  int sum = arr[i]>0 ? arr[i] : 0;
			  for(int j = i+1; j<arr.length; j++) {
				  sum+= arr[j];
				  System.out.println("sum     "+sum);
				  if(sum>maxSum) maxSum = sum;
				  System.out.println("maxSum     "+maxSum);
			  }

			  if(sum>maxSum) maxSum = sum;
		  }
		    return maxSum;
		  }
	  
	  public static void main(String[]a) {
		  assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[]{}));
		  assertEquals("Example array should have a max of 6", 6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

	  }
}
