package Kata;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Pandigital {

	public static Set<Integer> numeros = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3, 4,5,6,7,8,9,0)));
    public static long[] getSequence(final long offset, final int size) {
    	 long[] pandigits = new long[size];
    	 int count = 0; 
    	 if(offset>9876543210L) return new long[0];
    	 long copy = offset < 1023456789 ? 1023456789 : offset;
    	 while(count<size) {
    		 if(isPan(copy)) {
    			 pandigits[count] = copy;
    			 count++;
    		 }
    		 copy+=1;
    	 }
      return pandigits;
    }


	public static boolean isPan(long number) {
    	if(String.valueOf(number).length() != 10) return false;
    	Set<Integer> pan = new HashSet<>();
    	while(number>0) {
    		pan.add((int) (number%10)); number/=10;
    	}
    	return numeros.containsAll(pan) && pan.containsAll(numeros);
    }
    public static void main(String[] args) {
    	System.out.println("5432160879L" +isPan(5432160879L));

    	System.out.println("54322160879L" +isPan(54322160879L));
    	System.out.println("543260879L" +isPan(543260879L));
    	int pans=0;
//    	for (long i=123456789L;i<=123457689L;i++){
//    	    if (isPan(i)){
//    	         pans++;
//    	         System.out.println(i);
//    	    }
//    	}
//    	System.out.println("pans = "+pans);
//    	 long[] subject = Pandigital.getSequence(0L, 5);
//         long[] expected = {1023456789L, 1023456798L, 1023456879L, 1023456897L, 1023456978L};
//         assertArrayEquals(expected, subject);
         
//         @Test
//         public void withPandigitalOffset() {
//             long[] subject = Pandigital.getSequence(5432160879L, 3);
//             long[] expected = {5432160879L, 5432160897L, 5432160978L};
//             assertArrayEquals(expected, subject);
//         }
//
//         @Test
//         public void withNonPandigitalOffset() {
//             long[] subject = Pandigital.getSequence(9876543000L, 5);
//             long[] expected = {9876543012L, 9876543021L, 9876543102L, 9876543120L, 9876543201L};
//             assertArrayEquals(expected, subject);
//         }
//
//         @Test
//         public void withTooBigOffset() {
//             long[] subject = Pandigital.getSequence(9999999999L, 1);
//             long[] expected = {};
//             assertArrayEquals(expected, subject);
//         }
//
//         @Test
//         public void withNegativeOffset() {
             long[] subject = Pandigital.getSequence(-123456789L, 1);
             long[] expected = {1023456789L};
             assertArrayEquals(expected, subject);
//         }
    }
}
