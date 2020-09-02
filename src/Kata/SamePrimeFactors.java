package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SamePrimeFactors {
    public static int[] sameFactRev(int nMax) {
        System.out.println(nMax);
        List<Integer> al = new ArrayList<Integer>();
        for (int i=1088;i<=nMax;i++) {
        	int iRev=findRev(i);
        	if(isPrime(i) || i==iRev || al.contains(iRev)) continue;
        	if(sameFacts(i)) {
        		al.add(i);
        		if(iRev<=nMax) al.add(iRev);
        	}
        }
        Collections.sort(al);
        int[] sames = new int[al.size()];
        for(int i =0;i<sames.length;i++) sames[i] = al.get(i);
        for(int i =0;i<sames.length;i++) { System.out.println(sames[i]);}
        return sames;
    }

	private static boolean sameFacts(int i) {
		int iRev = findRev(i);
		Set<Integer> primes = new HashSet<Integer>();
		for(int ii=2;ii<i;ii++) {
			if(i%ii==0 && isPrime(ii)) {
				if(iRev%ii != 0) return false;
				primes.add(ii);
			}
		}
		if(primes.isEmpty()) return false;
		Set<Integer> primesRev = new HashSet<Integer>();
		for(int ii=2;ii<iRev;ii++) {
			if(iRev%ii==0 && isPrime(ii)) {
				primesRev.add(ii);
				if(!primes.contains(ii)) return false;
			}
		}
		if(primes.containsAll(primesRev) && primesRev.containsAll(primes)) return true;
		
		return false;
	}

	private static int findRev(int i) {
		return Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());
	}

	private static boolean isPrime(int ii) {
		for(int k=2;k<=ii/2;k++) {
			if(ii%k ==0) return false;
		}
		return true;
	}
	
	public static void main(String[] a) {

//		sameFactRev(2000);
//		sameFactRev(3000);
//		sameFactRev(10000);
		sameFactRev(9000);
	    
	        System.out.println("Basic Tests");
//	        int[] l = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
//	        int[][] r = { {}, {1089}, {1089, 2178}, {1089, 2178}, {1089, 2178, 4356},
//	                {1089, 2178, 4356}, {1089, 2178, 4356, 6534}, {1089, 2178, 4356, 6534},
//	                {1089, 2178, 4356, 6534, 8712}, {1089, 2178, 4356, 6534, 8712, 9801} };
//	        assertEquals(l, r);
	}
}
