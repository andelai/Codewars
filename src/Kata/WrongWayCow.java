package Kata;

import static org.junit.Assert.assertArrayEquals;

public class WrongWayCow {
	  public static int[] findWrongWayCow(final char[][] field) {
		  int cowsInAROw = 0;
		  int wocsInAROw = 0;
		  for(int ii = 0;ii<field.length;ii++) {
			  if(String.valueOf(field[ii]).contains("cow")) {
				  cowsInAROw++;
			  }
			  if(String.valueOf(field[ii]).contains("woc")) {
				  wocsInAROw++;
			  }
		  }
		  
		  if(cowsInAROw>1 || wocsInAROw>1) {
			    for(int i= 0;i<field.length;i++) {
			    	if(cowsInAROw>1 && String.valueOf(field[i]).contains("woc")) {
						  System.out.println("obrnin a row......");
						  int headCow = String.valueOf(field[i]).indexOf("woc") +2;
						  return new int[]{headCow,i};
					  } else if(wocsInAROw>1 && String.valueOf(field[i]).contains("cow")) {
						  System.out.println("obrnin a row......");
						  int headCow = String.valueOf(field[i]).indexOf("cow");
						  return new int[]{headCow,i};
					  }
			    }
		  } else {
			  for(int i= 0;i<field.length;i++) {
			    	if(String.valueOf(field[i]).contains("woc")) {
						  System.out.println("obrnin a row......");
						  int headCow = String.valueOf(field[i]).indexOf("woc") +2;
						  return new int[]{headCow,i};
					  }
			    	else if(String.valueOf(field[i]).contains("cow")) {
						  int headCow = String.valueOf(field[i]).indexOf("cow");
						  return new int[]{headCow,i};
					  }
			    }
		  }
		    return new int[]{0,0};
	  }
	  	
	  

	  public static void main(String[] args) {
		  final char[][] field = new char[][] {
		        "cow.cow.cow.cow.cow".toCharArray(),
		        "cow.cow.cow.cow.cow".toCharArray(),
		        "cow.woc.cow.cow.cow".toCharArray(),
		        "cow.cow.cow.cow.cow".toCharArray(),
		        };
		      assertArrayEquals(new int[]{6,2}, findWrongWayCow(show(field)));
//		     final char[][] field = new char[][] {
//		         "c..........".toCharArray(),
//		         "o...c......".toCharArray(),
//		         "w...o.c....".toCharArray(),
//		         "....w.o....".toCharArray(),
//		         "......w.cow".toCharArray()
//		         };
//		       assertArrayEquals(new int[]{8,4}, findWrongWayCow(show(field)));
		     
		  
	  }
	   private static char[][] show(final char[][] field) {
		      for (int i = 0; i < field.length; i++) {
		        System.out.println(new String(field[i]));
		      }
		      return field;
		    }
}
