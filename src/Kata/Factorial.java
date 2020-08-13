package Kata;

public class Factorial {
	  public int factorial(int n) {
		    // Happy coding :-)
		  if (n < 0|| n > 12) throw new IllegalArgumentException();
		  int sum = 1;
		  for (int i = n; i>0; i--) {
			  sum*=i;
		  }
	    return sum;
	  }
}
