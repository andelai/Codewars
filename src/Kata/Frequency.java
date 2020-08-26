package Kata;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
	
    public static int[] sortByFrequency(int[] array) {
    	List<Integer> intList = new ArrayList<Integer>(array.length);
    	for (int i : array)	{
    	    intList.add(i);
    	}

    	Map<Integer, Integer> sm  = new HashMap<Integer, Integer>(); 
    	for ( int i : intList) {
    		if(!sm.containsKey(i)) {
    			sm.put(i, (int) intList.stream().filter(el -> (Integer)el == i).count());
    		}
    	}

    	Map<Integer,Integer> sortedNewMap = 
    			sm.entrySet()
    			.stream()
    	        .sorted((e1,e2) -> {
    	              return e2.getValue().equals(e1.getValue()) ? 
    	                          e1.getKey().compareTo(e2.getKey()) 
    	                              : Integer.compare(e2.getValue(), e1.getValue());
    	          })
    			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    	
    	List<Integer> intList2  = new ArrayList<Integer>(array.length);
        for(Integer i : sortedNewMap.keySet()) {
        	for(int j = 0; j<sortedNewMap.get(i); j++) {
        		intList2.add(i);
        	}
        }
        int[] ret = new int[intList2.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = intList2.get(i).intValue();
        }
        return ret;
    }
    
    public static void main (String[] args) {
    	 assertArrayEquals(new int[]{3, 3, 3, 5, 5, 7, 7, 2, 9}, sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7}));
//    	 int[] ret =sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7});
    	 
         assertArrayEquals(new int[]{1, 1, 1, 0, 0, 6, 6, 8, 8, 2, 3, 5, 9}, sortByFrequency(new int[]{1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1}));
         assertArrayEquals(new int[]{9, 9, 9, 9, 4, 4, 5, 5, 6, 6}, sortByFrequency(new int[]{5, 9, 6, 9, 6, 5, 9, 9, 4, 4}));
         assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 8}, sortByFrequency(new int[]{4, 4, 2, 5, 1, 1, 3, 3, 2, 8}));
         assertArrayEquals(new int[]{0, 0, 4, 4, 9, 9, 3, 5, 7, 8}, sortByFrequency(new int[]{4, 9, 5, 0, 7, 3, 8, 4, 9, 0}));

    }
}
