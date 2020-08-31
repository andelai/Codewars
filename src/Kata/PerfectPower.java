package Kata;

public class PerfectPower {
	  public static int[] isPerfectPower(int n) {
		  if (n<4) return null;
		   for(int i = 2; i<=n/2;i++) {
			   if(n%i == 0) {
				   int j = 2;
				   while ((int) Math.pow(i, j) <= n) {
					   if((int) Math.pow(i, j) == n) {
						   return new int[] {i,j};
					   } else {
						   j++;
					   }
				   }
			   }
		   }
		   return null;
	  }

}
