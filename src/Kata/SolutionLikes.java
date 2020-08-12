package Kata;

import static org.junit.Assert.assertEquals;

public class SolutionLikes {
    public static String whoLikesIt(String... names) {
    	int len = names.length;
    	String who = null;
    	switch(len) {
    		case 0 : who = "no one"; break;
    		case 1 : who = names[0]; break;
    		case 2 : who = names[0] + " and " +names [1]; break;
    		case 3 : who = names[0] + ", " +names [1]+ " and " + names[2]; break;
    		case 4 : who = names[0] + ", " +names [1]+ " and " + (len-2) + " others"; break;
    		default : who = names[0] + ", " +names [1]+ " and " + (len-2) + " others"; break;
    	}
        //Do your magic here
        return who+ (len>=2 ? " like this":" likes this");
    }
    
    public static void main( String[]a ) {
    	System.out.println(whoLikesIt());
    	System.out.println(whoLikesIt("Peter"));
    	System.out.println(whoLikesIt("Jacob", "Alex"));
    	System.out.println(whoLikesIt("Jacob", "Alex", "third"));
    	System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
//    	assertEquals("no one likes this", whoLikesIt());
//        assertEquals("Peter likes this", whoLikesIt("Peter"));
//        assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
//        assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
//        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));

        
    }
}
