package systemoutprintln;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
    	List<Computer> inventory = Arrays.asList(
    			  new Computer( 2015, "white", 35), new Computer(2009, "black", 65));
    				inventory.forEach(ComputerUtils::repair);
	}
}
