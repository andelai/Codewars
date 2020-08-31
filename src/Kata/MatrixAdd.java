package Kata;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatrixAdd {
	public static int[][] matrixAddition(int[][] a, int[][] b) {
		int[][] sum = new int[a.length][a[0].length];
		for(int m=0;m<a.length;m++) {
			for(int n=0;n<a[m].length;n++) {
				sum[m][n] = a[m][n]+b[m][n];
			}
		}
		return sum;
	}
	
	public static void main(String[] a) {
		int[][] expected = new int[][] { { 3, 4, 4 }, { 6, 4, 4 }, { 2, 2, 4 } };
		
		assertArrayEquals(expected,
				matrixAddition(
						new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 1, 1 } },
						new int[][] { { 2, 2, 1 }, { 3, 2, 3 }, { 1, 1, 3 } }));
		
		expected = new int[][] { { 3 } };
		assertArrayEquals(expected, 
				matrixAddition(
						new int[][] { { 1 } },
						new int[][] { { 2 } }));
		
		expected = new int[][] { { 3, 5 }, { 3, 5 } };
		assertArrayEquals(expected,
				matrixAddition(
						new int[][] { { 1, 2 }, { 1, 2 } },
						new int[][] { { 2, 3 }, { 2, 3 } }));
	}
}
