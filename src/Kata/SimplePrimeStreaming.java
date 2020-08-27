package Kata;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SimplePrimeStreaming {

    public static String solve(int a, int b) {
    	String ret = "";
    	int number = 2;
    	while(ret.length()<2000) {
    		if (isPrime(number)) ret += number;
    		number++;
    	}
//    	System.out.println("number is "+ret);
        return ret.substring(a, a+b);
    }
    
    
    public static boolean isPrime(int num) {
    	for ( int i = 2;i<=num/2;i++) {
    		if(num%i == 0) return false;
    	}
    	return true;
    }
}
