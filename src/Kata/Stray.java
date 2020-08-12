package Kata;

import java.util.Arrays;

public class Stray {
	  static int stray(int[] numbers) {
		  boolean found= false;
		  int i = 0;
		  int stray = numbers[i];
		  while(!found) {
			  int num = stray;
			  if(Arrays.stream(numbers).filter(n -> n==num).count()==1)
			  { 
				  found = true; 
				  return stray;
			  }
			  else {
				  i++;
				  stray = numbers[i];
			  }
		  }
		  return 0;
	  }
}
