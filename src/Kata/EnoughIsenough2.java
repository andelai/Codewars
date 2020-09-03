package Kata;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EnoughIsenough2 {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		 List<Integer> al = new LinkedList<Integer>();
		 Set<Integer> set = new HashSet<Integer>();
		 for(int i= 0; i<elements.length; i++) { al.add(elements[i]); set.add(elements[i]); }
		 System.out.println(al.toString());
		 
		 for( int x : set) {
			 long occ = al.stream().filter(el -> el==x).count();
			 if(occ > maxOccurrences) {
				 for(int i=al.size()-1; i>= 0;i--) {
					 if(al.get(i) == x) {
						 al.remove(i); occ-=1;
						 if(occ == maxOccurrences) break;
					 }
				 }
			 }
			 System.out.println(al.toString());
		 }
		 int[] newEL = new int[al.size()];
		 for(int i = 0; i<al.size(); i++) newEL[i] = al.get(i);
		 return newEL;
	}
	
	public static void main(String[] a) {
		assertArrayEquals(
				new int[] { 20, 37, 21 },
				deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
				deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
				
		);
		assertArrayEquals(
				new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 1, 1, 1 },
				deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
		);
		assertArrayEquals(
				new int[] { },
				deleteNth( new int[] { }, 5 )
		);

	}
}
