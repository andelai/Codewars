package Kata;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import org.junit.Assert;

public class Fibonacci {
	public static IntStream stream(int a, int b) {
	    // FIXME Too many semicolons!
	    AtomicInteger nMinusTwo = new AtomicInteger(a);
	    AtomicInteger nMinusOne = new AtomicInteger(b);
	    return IntStream.concat(
	      IntStream.of(a, b),
	      IntStream.generate(() -> {
	        int sum = nMinusTwo.getAndSet(nMinusOne.get()) + nMinusOne.get();
	        nMinusOne.set(sum);
	        System.out.println("sum is "+sum+ " nMinusOne "+nMinusOne+" nminustwo is "+nMinusTwo);
	        return sum;
	      })
	    );
	  }
	
	public static void main(String[] args) {
	
		    Assert.assertArrayEquals(
		    	      new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
		    	      Fibonacci.stream(0, 1).limit(10).toArray());
	}
}
