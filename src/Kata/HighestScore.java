package Kata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class HighestScore {
	  public static String high(String s) {
		    
		    List<String> lista = Arrays.asList(s.split(" "));
		    if(lista.size() == 0) return null;
		    String glavni = lista.get(0);
		    for(String str : lista) {
		    	int valueOfGlavni = findValueOfString(glavni);
		    	if(findValueOfString(str) >valueOfGlavni) {
		    		glavni = str;
		    	}
		    }
		    return glavni;
		  }

	private static int findValueOfString(String str) {
		int suma = 0;
		String abeceda = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
		for(int i = 0; i<str.length();i++) {
			char charInString = str.charAt(i);
			suma += abeceda.indexOf(charInString)+1;
		}
		return suma;
	}
	
	public static void main(String[]a) {
		assertEquals("taxi", high("man i need a taxi up to ubud"));
        assertEquals("volcano", high("what time are we climbing up to the volcano"));
        assertEquals("semynak", high("take me to semynak"));
        System.out.println(high("wmmzyqyabrtdzwxeu loffkyrublutqqyyhy"));
        System.out.println(high("wmmzyqyabrtdzwxeu"));
	}
	
}
