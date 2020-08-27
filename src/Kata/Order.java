package Kata;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {

	  public static String order(String words) {

		   String newOrder = "";
		   if(words.isEmpty()) return newOrder;
		  
		   String[] listOfWords = words.split("[^a-zA-Z0-9]+");

		   HashMap<String, Integer> map = new HashMap<String, Integer>();
		   for ( String word : listOfWords) {
			   Matcher matcher = Pattern.compile("\\d+").matcher(word);
			   matcher.find();
			   int i = Integer.valueOf(matcher.group());
			   map.put(word,i);
		   }
		   Map<String,Integer> sortedMap = map.entrySet().stream()
				    						.sorted(Entry.comparingByValue())
				    						.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		   for (String str : sortedMap.keySet()) { 
			   newOrder = newOrder.concat(str + " ");
		   }
		   return newOrder.substring(0, newOrder.length()-1);
	  }
	  
	  public static void main(String[] a) {
		  assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
		  assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
		  assertThat("Empty input should return empty string", Order.order(""), equalTo(""));

	  }
}
