package Kata;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class PhoneNum {
	  public static String createPhoneNumber(int[] numbers) {
		  String phone = Arrays.toString(numbers).replaceAll("\\[|\\]|,|\\s", "");
		  System.out.println(phone);
		    return "("+phone.substring(0, 3)+") "+phone.substring(3, 6)+"-"+phone.substring(6);
		  }
	  
	  public static void main(String [] a) {
		  assertEquals("(123) 456-7890", createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

	  }
}
