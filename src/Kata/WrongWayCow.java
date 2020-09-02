package Kata;

public class WrongWayCow {
	  public static int[] findWrongWayCow(final char[][] field) {
		    // Your cow finding code here
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
		  
	  }
	   private static char[][] show(final char[][] field) {
		      for (int i = 0; i < field.length; i++) {
		        System.out.println(new String(field[i]));
		      }
		      return field;
		    }
}
