package Kata;


public class DnaStrand {
	public static void main (String[] args)  {
//		System.out.println(DnaStrand.makeComplement("AAAA"));
	}
	
	
	  public static String makeComplement(String dna) {
		  char dnaChar[] = dna.toCharArray();
		  System.out.println(dnaChar);
	    for ( int i=0; i<dnaChar.length; i++) {
	      if (dna.charAt(i) == 'A') {
	    	  dna = dna.replace(dna.charAt(i), 'T');
	      } 
	      else if (dna.charAt(i) == 'T') {
	    	  dna = dna.replace(dna.charAt(i), 'A');
	      } 
	      else if (dna.charAt(i) == 'C') {
	    	  dna = dna.replace(dna.charAt(i), 'G');
	      } 
	      else if (dna.charAt(i) == 'G') {
	    	  dna = dna.replace(dna.charAt(i), 'C');
	      }
	    }
	    System.out.println("dna = "+dna);
	    return dna;
	  }
	}