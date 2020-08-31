package Kata;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DragonsCurve {
  public IntFunction<String> mapFunction = 
		 x ->  x==(int)'a' ?  "aRbFR" : x==(int)'b' ? "LFaLb" : String.valueOf((char)x);
  ; //Make the function; map the chars to Strings
                                             //a -> aRbFR, b -> LFaLb, otherwise -> itself
  /**
   * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
   * Then remove the a and b (createFilter function is useful for that)
   */
  public String createCurve(int n) {
//	  mapFunction.apply("Fa".chars());
	  int count = 0;
	  String ret = "Fa";
	  while ( count<n ) {
		  System.out.println("__Ret == "+ret);

		  String stream1 = ret.chars().mapToObj(x -> mapFunction.apply(x)).collect(Collectors.joining()).toString(); //.forEach(StringBuilder::append);

		  List<String> listOfStringStartsWithJ = ret.chars().mapToObj(x -> mapFunction.apply(x)).collect(Collectors.toList());
			for ( int i = 0; i<listOfStringStartsWithJ.size(); i++) {
				ret = ret+listOfStringStartsWithJ.get(i);
			}
		  System.out.println("listOfStringStartsWithJ == " +listOfStringStartsWithJ.toString());
		  System.out.println("stream1 == " +stream1);

		  ret =ret.chars().filter(x -> x != 'a' && x!= 'b' ).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		  System.out.println("Ret == "+ret);
		  count++;
	  }
//    //That's an IntStream with 'F' and 'a' ready to be acted upon
    return ret;
  }
  
  /**
   * How many of the specified char are in the given curve?
   * Hint: createFilter could be useful for this
   */
  public long howMany(char c, String curve) {
    return 4L; //Determined by die roll; guaranteed to be random
  }
  
  /**
   * Create a predicate to filter the specified char; keep or remove based on keep variable
   */
//  public IntPredicate createFilter(char filterWhat, boolean keep) {
//	return this.;
////    return filterWhat != 'a' || filterWhat != 'b' ; //Dat predicate
//  }
  
  public static void main(String[] a) {
	  DragonsCurve testee = new DragonsCurve();final List<Integer> ns = Arrays.asList(0, 1, 2, 3, 5);
	  final List<String> curves = Arrays.asList("F", "FRFR", "FRFRRLFLFR", "FRFRRLFLFRRLFRFRLLFLFR",
              "FRFRRLFLFRRLFRFRLLFLFRRLFRFRRLFLFRLLFRFRLLFLFRRLFRFRRLFLFRRLFRFRLLFLFRLLFRFRRLFLFRLLFRFRLLFLFR"
             );
	    final List<Integer> ins = Arrays.asList((int)'a', (int)'b', (int)'F', (int)'R', (int)'L');
	    final List<String> outs = Arrays.asList("aRbFR", "LFaLb", "F", "R", "L");
	    Map<Integer, String> inOut = new HashMap<>(ins.size());
	    Map<Integer, String> tests = new HashMap<>();
	    
	    IntStream.range(0, ins.size()).forEach(i -> inOut.put(ins.get(i), outs.get(i))); //Poor man's zip
	    inOut.forEach((i, o) -> {
	      String res = testee.mapFunction.apply(i);
	      System.out.println("i == "+i+"    res == "+res);
	      assertEquals("Input to map function " + i + " (char '" + (char)i.intValue() + "') response ", o, res);
	    });
	    
	    String c = testee.createCurve(5);
	    tests.forEach((i, s) -> System.out.println("i = "+i+"  s = "+s));
	    tests.forEach((i, s) -> assertEquals("Curve size " + i + " ", s, testee.createCurve(i)));
  }
}