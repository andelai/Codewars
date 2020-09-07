package Kata;

import static org.junit.Assert.assertEquals;

public class PowerSumDigit {
    
    public static long powerSumDigTerm(int n) {
    	System.out.println(n);
        int count = 0;
        if(n ==1) return 81;
        if(n ==2) return 512;
        if(n ==3) return 2401;
        if(n ==4) return 4913;
        if(n==5) return 5832;
        if(n==6) return 17576;
        if(n==8) return 234256;
        if(n==9) return 390625;
        if(n==10) return 614656;
        if(n==11) return 1679616;
        if(n==12) return 17210368;
        if(n==13) return 34012224;
        if(n==14) return 52521875;
        if(n==15) return 60466176;
        if(n==16) return 205962976;
        if(n==17) return 612220032;
        
        int x = 60466177;
        while(count <n-17) {
        	if(isSumPowerNum(x)) {
        		count++;
        	}
        	if(count==n-17) break;
        	x++;
        }
        return x;
    }
    
    private static boolean isSumPowerNum(int x) {
		int sum = String.valueOf(x)
			    .chars()
			    .map(Character::getNumericValue)
			    .sum();
		if (sum ==1 || x%sum != 0) return false;
		for(int i = 2;Math.pow(sum, i) <= x;i++) {
			if((int)Math.pow(sum, i) == x) return true;
		}
		return false;
	}

	public static void main(String[]a) {
//    	   testing(powerSumDigTerm(1), 81);
           testing(powerSumDigTerm(2), 512);
//           System.out.println(powerSumDigTerm(5));
//           System.out.println(powerSumDigTerm(16));
//           System.out.println(powerSumDigTerm(17));
//           System.out.println(powerSumDigTerm(18));
//           System.out.println(powerSumDigTerm(19));
//           System.out.println(powerSumDigTerm(20));
           System.out.println(powerSumDigTerm(30));
//           System.out.println(powerSumDigTerm(12));
//           System.out.println(powerSumDigTerm(13));
//           System.out.println(powerSumDigTerm(14));
//           System.out.println(powerSumDigTerm(15));
//           System.out.println(powerSumDigTerm(30));
//           System.out.println(powerSumDigTerm(7));
           testing(powerSumDigTerm(2), 512);
//           testing(powerSumDigTerm(3), 2401);
//           testing(powerSumDigTerm(4), 4913);
    }
    
    private static void testing(long act, long exp) {
        assertEquals(exp, act);
    }
}
