package Kata;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		List<Integer> arr = new ArrayList<>();
		for ( int ki = 0; ki<elements.length;ki++) arr.add(elements[ki]);
		for (int i = 0; i<arr.size(); i++) {
			Object elO = arr.get(i);
			long howManyTImes = arr.stream().filter(e-> e ==elO).count();
			if(howManyTImes > maxOccurrences) {
				int c = 0;
				for ( int k=0 ; k<arr.size();k++)  {
					if((Integer)arr.get(k) == (int)arr.get(i)) {
						c++;
						if (c>maxOccurrences && maxOccurrences != 0) {
							arr.remove(k);
						}
					}
				}
			}
			
		}
		if (arr.size() == 0) return new int[0];
		int[] ret = new int[arr.size()];
		for (int i = 0; i<arr.size(); i++ ) ret[i] = arr.get(i);
		return ret;
	}

	public static void main(String[] a) {

		assertArrayEquals(
				new int[] { 20, 37, 21 },
				EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
		);
		assertArrayEquals(
				new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 1, 1, 1 },
				EnoughIsEnough.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
		);
		assertArrayEquals(
				new int[] { },
				EnoughIsEnough.deleteNth( new int[] { }, 5 )
		);
	}
}
