package Kata;

import static org.junit.Assert.assertArrayEquals;

public class TwosDifference {
	  public static int[][] twosDifference(int[] array) {
		  int[][] ret = new int[100][];
		  int c = 0;
		  for(int i = 0; i<array.length-1;i++) {
			  for(int j=i+1;j<array.length;j++) {
				if(Math.abs(array[i]-array[j])==2) {
					ret[c]= new int[] {Math.min(array[i],array[j]),Math.max(array[i],array[j])} ;
					c++;
				}
			  }
		  }
		  int[][] ret2 = new int[c][];
		  for(int i=0;i<c-1;i++) {
			  for(int j=i+1;j<c;j++) {
				  if(ret[i][0] > ret[j][0]) {
					  int[] temo = ret[i];
					  ret[i]=ret[j];
					  ret[j]=temo;
				  }
			  }
		  }
		  for(int co=0;co<c;co++) {
			  ret2[co] = ret[co];
		  }
		  return ret2;
	  }
	  public static void main(String[]a) {
		    assertArrayEquals(
		    	      new int[][]{{1, 3}, {2, 4}},
		    	      twosDifference(new int[]{1, 2, 3, 4})
		    	    );
		    	    
		    	    assertArrayEquals(
		    	      new int[][]{{1, 3}, {4, 6}},
		    	      twosDifference(new int[]{1, 3, 4, 6})
		    	    );
		    	  }
}


