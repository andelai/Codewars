package Kata;

import static org.junit.Assert.assertEquals;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        int maxLength = 0;
        int beginINdex = 0; 
        String longestRet = "";
        while(beginINdex+k<=strarr.length) {
        	String longest = "";
        	for(int i = beginINdex; i<beginINdex+k; i++) {
        		longest += strarr[i];
        	}
        	if(longest.length()>maxLength) {
        		maxLength = longest.length();
        		longestRet = longest;
        		System.out.println("longestRet = "+longestRet + "    maxLength = "+maxLength);
        	}
        	beginINdex++;
        }
        return longestRet;
    }
    	public static void main(String[] args) {
    		   System.out.println("longestConsec Fixed Tests");
    	        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
    	        testing(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
    	        testing(LongestConsec.longestConsec(new String[] {}, 3), "");
    	        testing(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
    	        testing(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
    	        testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
    	        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
    	        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
    	        testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");

    	}
    	
        private static void testing(String actual, String expected) {
            assertEquals(expected, actual);
        }
    
}
