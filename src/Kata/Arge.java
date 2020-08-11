package Kata;

class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
      int numYears = 0;
      while (p0 < p) {
        p0 = p0 + (int)(p0*percent/100) + aug;
        numYears++;
        if (p0 >= p) break;
      }
      return numYears;
    }
}