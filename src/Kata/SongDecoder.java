package Kata;

import static org.junit.Assert.assertEquals;

public class SongDecoder {
	  public static String SongDecoder (String song)
	  {
	     StringBuilder sb = new StringBuilder(song);
	     System.out.println("sb = "+sb);

	     while(sb.toString().contains("WUB")) {
	    	 int in = sb.indexOf("WUB");
	    	 sb.replace(in, in+3, " ");
	     }
	     while(sb.toString().contains("  ")) {
	    	 int in = sb.indexOf("  ");
	    	 sb.replace(in, in+2, " ");
	     }
	     System.out.println("sb = "+sb);
	     return sb.toString().trim();
	   }
	  
	  public static void main(String[] a) {
		  assertEquals("R L", SongDecoder("RWUBWUBWUBLWUB"));
	  }
}
