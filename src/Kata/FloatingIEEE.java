package Kata;

import static org.junit.Assert.assertEquals;

public class FloatingIEEE {
	
	
	  public static String doubleToIEEE_754(double number) {
		  String res = Long.toBinaryString(Double.doubleToRawLongBits(number));
		  System.out.println("res je "+res);
		
		  if(Double.isNaN(number)) {
			  return "0 11111111111 1000000000000000000000000000000000000000000000000000";
		  }
		  else if(number == +0.0) {
			  return "0 00000000000 0000000000000000000000000000000000000000000000000000";
		  }
		  else if(number == -0.0) {
			  return "1 00000000000 0000000000000000000000000000000000000000000000000000";
		  }
		  String res2 =(number >= 0 ? "0 "+ res.substring(0,11)+ " " + res.substring(11) : "1 "+ res.substring(1,12)  + " " + res.substring(12));		  System.out.println(res2);
		  return res2;
	  }

	  public static String floatToIEEE_754(float number) {
	      return "";
	  }
	  
	  public static void main(String[] a) {
		  doubleToIEEE_754(15.875); //0 10000000010 1111110000000000000000000000000000000000000000000000
		  							//  10000000010 1111110000000000000000000000000000000000000000000000
		  assertEquals("0 10000000010 1111110000000000000000000000000000000000000000000000", doubleToIEEE_754(15.875));
	        assertEquals("1 01111111111 0000000000000000000000000000000000000000000000000000",doubleToIEEE_754(-1.0));
//	        0 10000000010 1111110000000000000000000000000000000000000000000000
//	        0 10000000 0101111110000000000000000000000000000000000000000000000
//	        1 01111111111 0000000000000000000000000000000000000000000000000000
//	        1 10111111111 1000000000000000000000000000000000000000000000000000
	        assertEquals("0 11111111111 1000000000000000000000000000000000000000000000000000", doubleToIEEE_754(+ Double.NaN));
	        assertEquals("0 11111111111 0000000000000000000000000000000000000000000000000000", doubleToIEEE_754(Double.POSITIVE_INFINITY));
	        assertEquals("1 11111111111 0000000000000000000000000000000000000000000000000000", doubleToIEEE_754(Double.NEGATIVE_INFINITY));
//	        assertEquals("0 00000000000 0000000000000000000000000000000000000000000000000000", doubleToIEEE_754(+ 0.0));
//	        assertEquals("1 00000000000 0000000000000000000000000000000000000000000000000000", doubleToIEEE_754(- 0.0));
	        assertEquals("0 11111111110 1111111111111111111111111111111111111111111111111111", doubleToIEEE_754(+ Double.MAX_VALUE));
	        assertEquals("1 11111111110 1111111111111111111111111111111111111111111111111111", doubleToIEEE_754( -Double.MAX_VALUE));
	        assertEquals("0 00000000000 0000000000000000000000000000000000000000000000000001", doubleToIEEE_754(+ Double.MIN_VALUE));
	        assertEquals("1 00000000000 0000000000000000000000000000000000000000000000000001", doubleToIEEE_754(- Double.MIN_VALUE));

//	        assertEquals("0 10000010 11111100000000000000000", Solution.floatToIEEE_754(15.875f));
//	        assertEquals("1 01111111 00000000000000000000000", Solution.floatToIEEE_754(-1.0f));

	  }
}
