package Kata;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
    	List<Long> numIsSum = new ArrayList<Long>();
    	for(long i= a; i<=b ;i++) {
    		if(isSumDigNum(i)) {
    			numIsSum.add(i);
    		}
    	}
    	return numIsSum;
    }

	private static boolean isSumDigNum(long i) {
		String stringOfLong = String.valueOf(i);
		long thisSum = 0;
		for ( int k = 0; k<stringOfLong.length(); k++) {
			thisSum += Math.pow(Character.getNumericValue(stringOfLong.charAt(k)),(k+1));
		}
		return thisSum == i;
	}

}