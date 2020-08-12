package Kata;

import static org.junit.Assert.assertEquals;

public class SquareDigit {

	  public int squareDigits(int n) {
		  int brZnam = String.valueOf(n).length();
		  String value = "";
	    for(int i=0; i<brZnam;i++) {
	    	value += (int)Math.pow(Double.valueOf(String.valueOf(String.valueOf(n).charAt(i))), 2);
	    }
	    return Integer.parseInt(value);
	  }

	  public static void main(String[]a) {
System.out.println(new SquareDigit().squareDigits(9119));
	      assertEquals(811181, new SquareDigit().squareDigits(9119));
	  }
}
