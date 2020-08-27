package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingDuplicates {

	  public static int duplicateCount(String text) {
		   Map<Character, Integer> map = new HashMap();
		   char[] ch = text.toLowerCase().toCharArray();
		   List<Character> listC = new ArrayList<Character>();
		   for (char c: ch) {
			   listC.add(c);
		   }
		   for(int i= 0;i<text.length();i++) {
			   char charFrom = text.charAt(i);
			   int charcount = (int) listC.stream().filter(c -> c.charValue()==charFrom).count();
			   if(charcount >1 && !map.keySet().contains(text.charAt(i))) {
				   map.put(text.charAt(i),charcount );
			   }
		   }
		   return map.keySet().size();
		  }
	  public static void main(String[]a) {
		  assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
		  
//		  String someString = "hey these are only words";
		  String someString = "heytheseareonly2words";
		  boolean allLetters = someString.chars().allMatch(Character::isLetter);
		  System.out.println("allLetters == "+allLetters);
	  }
	 
}
