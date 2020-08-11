package Kata;

import java.util.Arrays;

public class AreSame {
//	public static boolean comp(int[] a, int[] b) {
//		if(a.length == 0 || b.length == 0) return false;
//	    for (int i = 0; i< b.length; i++) {
//	    	int bi = b[i];
//	    	System.out.println("bi = "+b[i]);
//	    	if (Arrays.stream(a).filter(ai -> ai*ai == bi).count() < 1) return false;
//	    }
//	    for (int i = 0; i< a.length; i++) {
//	    	int ai = a[i];
//	    	if (Arrays.stream(b).filter(bi -> bi == ai*ai).count() < 1) return false;
//	    }
//	    return true;
//	  }
	public static boolean comp(int[] a, int[] b) {
	    if ((a == null) || (b == null)){
	          return false;
	    }
	    int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
	    Arrays.sort(aa);
	    Arrays.sort(b);
	    return (Arrays.equals(aa, b));
	    
	  }
}
