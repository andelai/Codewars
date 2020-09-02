package Kata;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class SimpleAssembler {
	  public static Map<String, Integer> interpret(String[] program){
		  Map<String, Integer> out = new HashMap<String, Integer>();
		  String first = program[0];
		  int var2 = Integer.valueOf(first.charAt(6));
		  int var = Integer.valueOf(first.substring(6));
		  for(int i= 1; i<program.length;) {
			  String s = program[i];
			  if(s.startsWith("inc")) {
				  var+=1;
			  } else if(s.startsWith("dec")) {
				  var-=1;
			  } else if(s.startsWith("jnz")) {
				  if(s.charAt(6)=='-') i=i-Character.getNumericValue(s.charAt(7));
				  else {
					  i+=Character.getNumericValue(s.charAt(6));
				  }
				   continue;
			  }
			  i++;
		  }
		  out.put(String.valueOf(first.charAt(4)),var);
		  return out;
	 }
	  
	  
	  public static void main(String[] args) {
//		  String[] program = new String[]{"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"}; 
//		    Map<String, Integer> out = new HashMap<String, Integer>();
//		    out.put("a", 1);
//		    assertEquals(out, SimpleAssembler.interpret(program));
		  
		   String[] program = new String[]{"mov a -10","mov b a","inc a","dec b","jnz a -2"};
		    Map<String, Integer> out = new HashMap<String, Integer>();
		    out.put("a", 0);
		    out.put("b", -20);
		    assertEquals(out, SimpleAssembler.interpret(program));
	  }
}
