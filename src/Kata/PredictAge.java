package Kata;

import java.util.ArrayList;

public class PredictAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(age1);
        aL.add(age2);
        aL.add(age3);
        aL.add(age4);
        aL.add(age5);
        aL.add(age6);
        aL.add(age7);
        aL.add(age8);
       return (int) Math.floor(Math.sqrt(aL.stream().mapToInt(el -> el*el).sum())/2);
    }
}
