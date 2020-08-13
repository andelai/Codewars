package Kata;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
//        char[] c = s1.concat(s2).toCharArray();
//        Character[] cC = new Character[c.length];
//        for(int i = 0; i< c.length;i++) cC[i] = c[i];
//       
//		List<Character> chars = Arrays.asList(cC);
//		Collections.sort(chars);
//        Set<Character> charSet = new HashSet<>(chars);
//        String joined = "";
//        for ( Character ch : charSet) {
//        	joined = joined.concat(String.valueOf(ch.charValue()));
//        }
//        return joined;
    	
    	String s = s1 + s2;
//        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    	return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
    

	  public static void main(String[]a) {
		  System.out.println(longest("heeex", "xoisfksnfcsoaaak"));
	  }
}
