package validacionDeDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo1 {
	public static void main(String[] args) {
		 String str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(str.matches("(.*)Tutorials(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(str.matches("Tutorials"));

	      System.out.print("Return Value :\n" );
	      
	      System.out.println("----------------------");
	      
	      System.out.println(Pattern.matches("-?\\d+","1234")); 
	      
	      Pattern pat; 
	      Matcher mat; 
	      pat = Pattern.compile("-?\\d+"); 
	      mat=pat.matcher("-1234"); 
	      System.out.println(mat.matches());
	      
	      
	      System.out.println("----------------------");
	      
	      Pattern p = Pattern.compile(" ");
	      String tmp = "this is a test";
	      String[] tokens = p.split(tmp);
	      for (int i = 0; i < tokens.length; i++) {
	          System.out.println(tokens[i]);
	      }
	}
}
