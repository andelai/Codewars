package Kata;

import static org.junit.Assert.assertEquals;

public class DigPow {
	
	public static long digPow(int n, int p) {
		int res = sumOfDigits(n, p);
		
    return res != -1 ? res : -1;
	}
	
	
	private static int sumOfDigits(int n, int p) {
		int sum = 0;
		String nS= String.valueOf(n);
		for(int i = 0; i<nS.length(); i++) {
			sum+=Math.pow(Character.getNumericValue(nS.charAt(i)),p);
			p+=1;
		}
		if(sum%n == 0) return sum/n;
		else return -1;
	}


	public static void main(String[] a) {
		assertEquals(1, DigPow.digPow(89, 1));
		assertEquals(-1, DigPow.digPow(92, 1));
		assertEquals(51, DigPow.digPow(46288, 3));

	}
}
