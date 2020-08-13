package Kata;

import static org.junit.Assert.assertEquals;

public class XO {
	  public static boolean getXO (String str) {
		    
		   long numX = str.chars().filter(ch -> ch == 'x' || ch == 'X').count();
		   long numO = str.chars().filter(ch -> ch == 'o' || ch == 'O').count();
		   
		   return numX == numO;
		  }
	  
	  public static void main(String[] args) {
		  assertEquals(true, XO.getXO("xxxooo"));
		  assertEquals(true, XO.getXO("xxxXooOo"));
		  assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
	  assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
	      assertEquals(false, XO.getXO("XxxxooO"));
	    
	      assertEquals(true, XO.getXO("zssddd"));
	    
	      assertEquals(false, XO.getXO("Xxxxertr34"));
	  }
}
