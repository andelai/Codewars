package Kata;

public class Room {
	 public Room(String string, int i) {
		this.occupants = string;
		this.chairs = i;
	}
	public  String occupants;  // number of occupants, each occupant is represented by 'X'
	  public  int chairs;        // number of chairs in the room
}
