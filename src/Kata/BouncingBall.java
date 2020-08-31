package Kata;

import static org.junit.Assert.assertEquals;

public class BouncingBall {
	public static int bouncingBall(double h, double bounce, double window) {
	   int count = 1;

	
	   while(bounce*h>=window) {
		   count+=2;
		   h*=bounce;
	   }
      return count;
	}
	
	public static void main(String[] a) {
		assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));

		assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
	}
}
