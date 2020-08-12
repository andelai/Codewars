package Kata;

public class NextSquare {
	  public static long findNextSquare(long sq) {
	      if(isPrfctSq(sq) == false) return -1;
	      else {
	    	  do {
	    		  sq+=1;
	    		  if(isPrfctSq(sq)) return sq;
	    	  } while(!isPrfctSq(sq));
	      }
	      return 0; 
	  }
	  
	  public static boolean isPrfctSq(long num) {
		  return Math.sqrt(num) % 1 == 0;
	  }
}
