package systemoutprintln;

public class ComputerUtils {

   

    static void repair(final Computer computer) {
    	if (computer.getHealty() < 50) {
            computer.setHealty(100);
            System.out.println("Reparando...");
        }
        
    }

}