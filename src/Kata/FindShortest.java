package Kata;

import java.util.stream.Stream;

public class FindShortest {
//    public static int findShort(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        int shortest = sb.length();
//        while(sb.length() > 0) {
//        	String newWord = findWord(sb);
//        
//        	if (newWord.length() >0 && newWord.length() < shortest) {
//        		shortest = newWord.length();
//        	}
//        	int len = newWord.length() != sb.length() ? newWord.length()+1 : newWord.length();
//        	sb = new StringBuilder(sb.substring(len));
//        }
//        return shortest;
//    }
//    
//    public static String findWord(StringBuilder sb) {
//    	if (sb.indexOf(" ") == -1 )  {
//    		return sb.toString();
//    	}
//    	else if(sb.indexOf(" ") == -1 && sb.length() <= 0)  {
//    		return "";
//    	}
//    	else  {
//        	return sb.substring(0, sb.indexOf(" "));
//    	}
//    }
    public static int findShort(String s) {
    	Object[] words = Stream.of(s.split(" ")).toArray(); //.forEach(word -> System.out.println(word.toUpperCase()));
    	for (Object w : words) System.out.println(w);
    	
    	int[] duljine =  Stream.of(s.split(" "))
    	          .mapToInt(String::length).toArray();
    	for (int d : duljine) System.out.println(d);
    	
    	int minD = Stream.of(s.split(" "))
    	          .mapToInt(String::length)
    	          .min().getAsInt();

        return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
    }
   
}
