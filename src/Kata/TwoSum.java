package Kata;

public class TwoSum {

	
    public static int[] twoSum(int[] numbers, int target)
    {
    	boolean found = false;
    	int[] toFind = new int[2];
       int i = 0;
       do {
    	   System.out.println("numbers[i]   "+numbers[i]);
	       for (int j = i+1; j< numbers.length; j++) {
	    	   if (numbers[i] + numbers[j] == target) {
	    		   found = true;
	    		   toFind[0] = i;
	    		   toFind[1] = j;
	    	   }
	       }
	       i++;
       } while(!found);
       return toFind;
    }
}
