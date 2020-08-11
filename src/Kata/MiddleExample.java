package Kata;

public class MiddleExample {
	
	  public static String getMiddle(String word) {
		    int len = word.length();
		    String retVal = len % 2 == 0 ? word.substring(len/2 - 1 , len/2 + 1) : (len > 1 ? word.substring(len/2 , len/2+1) : word);
		    System.out.println(retVal);
		    return retVal;
	  }
}
