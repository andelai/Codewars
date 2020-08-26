package Kata;

import static org.junit.Assert.assertEquals;

public class Abbreviator {
	
//	  public static String abbreviate(String string) {
//		  String abr = "";
////		  boolean justOneWord = !string.contains(" ") && !string.contains("-") && !string.contains(", ") && !string.contains(". ") && !string.contains(";");
//		 
//		  boolean justOneWord = string.matches("[a-zA-Z]+");
//		  if (justOneWord){
//			  abr = abbreviateWord(string);
//		  }
//		  else {
//			  int lastInd = 0;
//			  for ( int i=0; i<string.length(); i++) {
//				  if(!String.valueOf(string.charAt(i)).matches("[a-zA-Z]+")  || i == string.length()-1) {
//					  abr+= abbreviateWord(i == string.length()-1 ? string.substring(lastInd) : string.substring(lastInd, i));
//					  if ( i!= string.length()-1) abr+=string.charAt(i);
//					  lastInd = i+1;
//				  }
//			  }
//		  }
//		  
//		 System.out.println("abr = "+abr);
//		 return abr;
//	  }
//	  
//	  public static String abbreviateWord(String string) {
//		 if(string.length() < 4) {
//			  return string;
//		  }
//		 return "" + string.charAt(0) + (string.length()-2) + string.charAt(string.length()-1);
//	  }
	  
	public static String abbreviate(String s) {
        String[] words = s.split("[^a-zA-Z]+");
        for(String w : words) {
            System.out.println("word "+w);
        }
        
        String[] separators = s.split("[a-zA-Z]+");
        for(String w : separators) {
            System.out.println("separators are "+w);
        }
        String result = "";

        int i = 1;
        for (String word : words) {
            result += processWord(word);
            if (i < separators.length) {
                result += separators[i++];
            }
        }
        return result;
    }

    private static String processWord(String word) {
        if (word.length() < 4) return word;
        int n = word.length() - 2;
        return "" + word.charAt(0) + n + word.charAt(word.length() - 1);
    }
	  
	  public static void main(String[] args) {
		  abbreviate("double-barreled-cat, sat");
//		  abbreviate("internationalization internationalizationX");
//			assertEquals("i18n", abbreviate("internationalization internationalizationX"));
//			assertEquals("e6t-r3s are r4y fun!", abbreviate("elephant-rides are really fun!"));
			
	  }
		 

}
