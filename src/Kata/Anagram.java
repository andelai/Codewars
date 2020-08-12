package Kata;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
	  public static boolean isAnagram(String test, String original) {
		  test = test.toLowerCase();
		  original = original.toLowerCase();
		    if(test.length() != original.length()) return false;
		    
		    for ( int i= 0; i<test.length(); i++) {
		    	char charOfS = test.charAt(i);
		    	List<Character> listaTest = test.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		    	List<Character> lista = original.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		    	
		    	long cTest = listaTest.stream().filter(li -> li == charOfS).count();
		    	long oTest = lista.stream().filter(li -> li == charOfS).count();
		    	if(cTest != oTest) return false;
		    }
		    return true;
		  }
	  public static void main(String[]a) {
		  assertEquals(true, isAnagram("foefet", "toffee"));
		    assertEquals(true, isAnagram("Buckethead", "DeathCubeK"));
		    assertEquals(true, isAnagram("Twoo", "Woot"));
		    assertEquals(false, isAnagram("apple", "pale"));
	  }
}
