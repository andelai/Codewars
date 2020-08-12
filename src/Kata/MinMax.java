package Kata;

import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int[] minMax = new int[2];
        minMax[0] = Arrays.stream(arr).min().getAsInt();
        minMax[1] = Arrays.stream(arr).max().getAsInt();
        
        return minMax;
    }
}
