package Kata;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

public class Meeting {
	
	  public static Object meeting(Room[] x, int need) {
		  if (need<= 0) return "Game On";
		  List<Integer> al = new ArrayList<Integer>();
		  int moreNeeded = need;
		  int ii = 0;
		  while(moreNeeded>0 && ii<x.length) {
			  int diff = x[ii].chairs - x[ii].occupants.length();
			  al.add(diff> 0 ? diff > moreNeeded ? moreNeeded :x[ii].chairs - x[ii].occupants.length() : 0);
			  moreNeeded-= (x[ii].chairs - x[ii].occupants.length() > 0 ? x[ii].chairs - x[ii].occupants.length() : 0);
			  ii+=1;
		  }
		  int[] space = new int[al.size()];
		  for (int i=0; i < space.length; i++) {
			  space[i] = al.get(i).intValue();
		  }
		  return moreNeeded>0 ? "Not enough!" : space;
	  }
	  

	  public static void main(String[]a) {
		  Room[] rooms = new Room[] {
			      new Room("XXX", 1),
			      new Room("XXXXXX", 6),
			      new Room("X", 2),
			      new Room("XXXXXX", 8),
			      new Room("X", 3),
			      new Room("XXX", 1)
			    };
			    assertArrayEquals(new int[] {0, 0, 1, 2, 2}, (int[]) Meeting.meeting(rooms, 5));
			 
	  }
}
