package Kata;
import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
     int numOfPeople = 0;
     int [] firstStat = stops.get(0);
    numOfPeople += firstStat[0];
    for ( int i = 1; i< stops.size(); i++ ) {
        numOfPeople += ((stops.get(i))[0] - (stops.get(i))[1]);
    }
    System.out.println(numOfPeople);
    return numOfPeople;
  }
}