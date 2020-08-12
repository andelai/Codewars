package Kata;

import java.util.Arrays;

public class FindOdd {
	
	public static int findIt(int[] a) {
		for (int i = 0; i<a.length; i++) {
			int thisOne = a[i];
			if( Arrays.stream(a).filter(ai -> ai == thisOne).count() %2 != 0) {
				return a[i];
			}
		}
		return 0;
	  }
}
