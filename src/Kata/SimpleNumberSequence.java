package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumberSequence {
    public static int missing(String s){
        int k = 1;
        while(k<10) {
        	int prvi = findInteger(s,k,0);
        	int drugi = findInteger(s.substring(k) ,k,prvi);
        	if(numOfdigitsChange(drugi,k)) k = k+1;
        	int index = s.indexOf(String.valueOf(drugi)+String.valueOf(drugi).length());
        	int treci =findInteger(s.substring(index) ,k,drugi);
        	System.out.println("prvi , drugi , treci : "+prvi + " "+drugi + " " +treci);
        	if(treci - drugi > 0 && treci - drugi <= 2 && drugi - prvi>0 && drugi - prvi <= 2) {
        		System.out.println("sequence found! k="+k);
        		break;
        	}
        	else k+=1;
        }
        List<Integer> al = new ArrayList<Integer>();
        String ss = s;
        int prethodni = 0;
        while(k<ss.length()) {
        	if(!al.isEmpty() && numOfdigitsChange(al.get(al.size()-1),k)) k = k+1;
        	if(!al.isEmpty()) { prethodni = al.get(al.size()-1); }
        	al.add(findInteger(ss, k, prethodni));
        	ss = ss.substring(k);
        	if(ss.length() == k) al.add(Integer.valueOf(ss));
        }
        System.out.println(al.toString());
        
        		return findMissing(al,k);
    }
    
	
	private static boolean numOfdigitsChange(int x, int k) {
		return String.valueOf(x+1).length()>k;
	}


	private static int findInteger(String s, int k, int prethodni) {
		if(prethodni != 0 && String.valueOf(prethodni+1).length()>k) k=k+1;
		if(k<s.length()) return Integer.valueOf(s.substring(0, k));
		return -1;
	}


	private static int findMissing(List<Integer> al, int k) {
		for(int i = 0; i<al.size()-1; i++) {
			if(al.get(i+1)-al.get(i) > 1) return al.get(i+1)-1;
		}
	
		return -1;
	}


	public static void main(String[] a) {
        assertEquals(4,missing("123567"));
//        assertEquals(92,missing("899091939495"));
//        assertEquals(100,missing("9899101102"));
//        assertEquals(-1,missing("599600601602"));
//        assertEquals(-1,missing("8990919395"));
//        assertEquals(1002,missing("998999100010011003"));
        assertEquals(10000,missing("99991000110002"));
        assertEquals(-1,missing("979899100101102"));
//        assertEquals(900003,missing("900001900002900004900005900006"));
   
	}
}
