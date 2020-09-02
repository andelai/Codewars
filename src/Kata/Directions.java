package Kata;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Directions {
    public static String[] dirReduc(String[] arr) {
    	
    	List<String> al = new ArrayList<String>(Arrays.asList(arr));
  
    	int count = al.size();
    	while(sameOcc(al)) {
    		int i= 0;
    	  	while(al.get(i+1) !=null) {
        		if((al.get(i).equals("NORTH") && al.get(i+1).equals("SOUTH"))||
        				(al.get(i).equals("SOUTH") && al.get(i+1).equals("NORTH"))||
        				(al.get(i).equals("WEST") && al.get(i+1).equals("EAST"))||
        				(al.get(i).equals("EAST") && al.get(i+1).equals("WEST"))){
        			al.add(i,null);
        			al.add(i+1,null);
        			count-=2;
        		}
        		else i++;
        	}
    	}
  
    
    	String[] reduced = new String[al.size()];
    	int j= 0;
    	for(int i=0; i<count;i++) {
    		if(al.get(j) != null) {
    			reduced[i] = al.get(j);
    		} else {
    			while(al.get(j) == null) j++;
    			reduced[i] = al.get(j);
    		}
    		j++;
    	}
    	
        return reduced;
    }
    
	private static boolean sameOcc(List<String> al) {
	 	for(int i= 0; i<al.size()-1;i++) {
    		if(al.get(i) != null && ((al.get(i).equals("NORTH") && al.get(i+1).equals("SOUTH"))||
    				(al.get(i).equals("SOUTH") && al.get(i+1).equals("NORTH"))||
    				(al.get(i).equals("WEST") && al.get(i+1).equals("EAST"))||
    				(al.get(i).equals("EAST") && al.get(i+1).equals("WEST")))){
    			return true;
    		}
    	}
		return false;
	}

	public static void main(String[] a) {
		 assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
		          new String[]{"WEST"},
		          dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
		    assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
		          new String[]{},
		          dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));

	          dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"});
		    
	}
}
