package Kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.*;
import java.util.stream.*;
import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {
		  public static Function<Student, Boolean> f = s -> { return s.getFullName().equals("John Smith") && s.studentNumber.equals("js123"); };//Make me a function; remember to set the types!
		
		  
//		  public static DoubleBinaryOperator f2 = (height,base) -> {
//			  double a=0.5*base*height;
//			  t.setArea(a);
//			  return 0.5*base*height;
//		  };//Make me a function.
		  public static ToDoubleFunction<Triangle> f2 = t -> { t.setArea(0.5*t.base*t.height); return Double.valueOf(0.5*t.base*t.height);};
//			  double a=0.5*base*height;
//			  t.setArea(a);
		 

		  
		  public static void main(String[] a) {
			  Student jSmith = new Student("John", "Smith", "js123");
			    assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
			 
			    
			    
			    Triangle t = new Triangle(5, 10);
			    assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f2.applyAsDouble(t), 0.001);
			    assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);

		  }
}
