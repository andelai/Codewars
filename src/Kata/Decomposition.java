package Kata;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Decomposition {
	public static String factors(int n) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=2; i<=n/i;i++) {
        	if(i!= 1 && isPrime(i) && n%i==0) {
        		int count = 1;
    			map.put(i, count);
    			n/=i;
        		while(n%i==0) {
//        			count++;
        			n/=i;
        			map.put(i, ++count);
        		}
        	}
        }
        if(isPrime(n)) map.put(n, 1);


  String s = "";
  for (Entry<Integer, Integer> entry : map.entrySet())  {
	  if(entry.getValue()>1) s+="("+entry.getKey()+"**"+entry.getValue()+")";
	  else s+="("+entry.getKey()+")";
  }
  System.out.println(s);
        return s;
    }
       
  private static boolean isPrime(int num) {
	for(int i=2; i<=Math.sqrt(num);i++) {
		if(num%i == 0) return false;
	}
	return true;
}
   

	public static void main(String[] a ) {
		  int lst = 7775460;        
	        assertEquals(
	            "(2**2)(3**3)(5)(7)(11**2)(17)",
	            factors(lst));
	  }
}
