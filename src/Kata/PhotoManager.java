package Kata;

import java.util.ArrayList;
import java.util.List;

public class PhotoManager {
	
	static List<String> usedNames = new ArrayList<String>();

	public boolean nameWasUnique(String name) {
		return usedNames.contains(name) ? false : true;
	}

}
