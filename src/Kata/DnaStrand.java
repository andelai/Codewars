package Kata;


public class DnaStrand {
	public static void main (String[] args)  {
		System.out.println(DnaStrand.makeComplement("AAAA"));
		System.out.println(DnaStrand.makeComplement("GTAT"));
	}
	
	
	  public static String makeComplement(String dna) {
		  StringBuilder s = new StringBuilder(dna);
		  for (int i = 0; i< s.length(); i++)  {
			  switch(s.charAt(i)) {
			  case 'A':
				  s.setCharAt(i, 'T'); break;
			  case 'T':
				  s.setCharAt(i, 'A'); break;
			  case 'C':
				  s.setCharAt(i, 'G'); break;
			  case 'G':
				  s.setCharAt(i, 'C'); break;
				  
			  }
			 
		  }
		  return s.toString();
	
	      }
 }