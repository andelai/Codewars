package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepInPrimes {
    public static long[] step(int g, long m, long n) {
    	List<Integer> al = new ArrayList<Integer>();
    	for ( int k = (int)m ; k<=n ; k++ ) {
    		if(isPrime(k)) al.add(k);
    		if( al.size() >= 2) {
    			for(Integer i : al) {
            		boolean found = al.stream().filter(ii -> Math.abs(ii-i) == g).findFirst().isPresent();
            		if(found) {
            			int prime = al.stream().filter(ii -> Math.abs(ii-i) == g).findFirst().get();
            			return prime>i ? new long[] { i , prime} : new long[] { prime, i};
            		
            		}
            	
            	}
    		}
        	
    	}
       return null;
    }
    
    private static boolean isPrime(int k) {
		for(int i=2;i<k/2;i++) {
			if(k%i==0) return false;
		}
		return true;
	}

	public static void main(String[] a) {
        System.out.println("Fixed Tests");        
        		StepInPrimes.step(2,10000000,11000000);
        assertEquals("[101, 103]", Arrays.toString(StepInPrimes.step(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(StepInPrimes.step(4,100,110)));
        assertEquals("[101, 107]", Arrays.toString(StepInPrimes.step(6,100,110)));
        assertEquals("[359, 367]", Arrays.toString(StepInPrimes.step(8,300,400)));
        assertEquals("[307, 317]", Arrays.toString(StepInPrimes.step(10,300,400)));
 
    }
}
