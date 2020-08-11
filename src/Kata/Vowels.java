package Kata;


public class Vowels {
	static char[] samogl = new char[] {'a','e','i','o','u' };
	  public static int getCount(String str) {
		    int vowelsCount = 0;
		    char[] vow = str.toCharArray();
		    for (int i = 0 ; i< vow.length; i++)  {
		    	if (new String(samogl).indexOf(vow[i]) != -1) {
		    		vowelsCount++;
		    	}
			}
		    // your code here
		    return vowelsCount;
	  }
}
