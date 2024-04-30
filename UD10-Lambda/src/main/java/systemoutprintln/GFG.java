package systemoutprintln;

import java.util.ArrayList;
import java.util.List;

public class GFG {

	// Class constructor
	public GFG(String s) {
		System.out.println("Hello " + s);
	}

	// Driver code
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");

		// call the class constructor
		// using double colon operator
		list.forEach(GFG::new);
	}

}
