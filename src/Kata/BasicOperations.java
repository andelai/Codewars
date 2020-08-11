package Kata;

public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
	  Integer in = 0;
    switch (op) {
      case "*" : in = v1*v2; break;
      case "+" : in = v1+v2; break;
      case "/" : in = v1/v2; break;
      case "-" : in = v1-v2; break;
      
    }
    return in;
  }
}