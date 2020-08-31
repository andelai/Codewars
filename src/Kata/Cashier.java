package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Cashier {
    public static String getOrder(String input) {

    	Map<String, Integer> mapO = new HashMap<String,Integer>();
    	Map<String, Integer> mapMenu = new HashMap<String,Integer>();
    	mapMenu.put("Burger", 1);
    	mapMenu.put("Fries",2);
    	mapMenu.put("Chicken",3);
    	mapMenu.put("Pizza",4);
    	mapMenu.put("Sandwich",5);
    	mapMenu.put("Onionrings",6);
    	mapMenu.put("Milkshake",7);
    	mapMenu.put("Coke",8);
    	
    	List<String> possibleMenu = new ArrayList<String>();
    	List<String> orderMenu = new ArrayList<String>();
    	
    	for ( String s : mapMenu.keySet()) { possibleMenu.add(s); }

    	int beginIndex = 0, i = 1;
    	while(i <= input.length()) {
    		
    		String or = input.substring(beginIndex, i);
    		or = or.substring(0, 1).toUpperCase() + or.substring(1);

    		if(possibleMenu.contains(or)) {
    			orderMenu.add(or);
    			mapO.put(or, mapMenu.get(or));
    			beginIndex = i;
    			i+=1;
    		} 
    		else {
    			i+=1;
    		}
    	}
    	Map<String,Integer> sortedMap = mapO.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    	String backOrder = "";
    	for  ( String s : sortedMap.keySet()) {
    		backOrder+= s; backOrder+=" ";
    		int howMany = (int)orderMenu.stream().filter(ss -> ss.equals(s)).count();
    		while (howMany > 1 ) {
    			backOrder+= s; backOrder+=" ";
    			howMany--;
    		}
		}
    	int len = backOrder.length()-1;
    	return backOrder.substring(0, len); // ILI: return backOrder.trim();
    }
    
    public static void main(String[] a) {
    	 getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza");
    	 assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
         assertEquals("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", getOrder("pizzachickenfriesburgercokemilkshakefriessandwich"));

    }
}
