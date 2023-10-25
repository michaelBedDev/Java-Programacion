package strings;

import java.util.Scanner;

public class ExplicacionStringAvanzado {


		
		//Lenght y CompareTo
		public static void main(String args[]){
			 String str1= new String("hola");
			 String str2= "Adios";
			 System.out.println("la cadena " +str1 + " tiene una longitud: " + str1.length());
			 System.out.println("la cadena " +str2 + " tiene una longitud: " + str2.length());
			 if(str1.compareTo(str2)!=0)
			 System.out.println("la cadena " +str1 + " es diferente a " + str2);
			
			 String s1=new String("hola");
			 String s2=new String("hola");
			 if(s1==s2)
			 System.out.println("s1 y s2 referencian al mismo objeto");
			 else
			 System.out.println("s1 y s2 NO referencian al mismo objeto");
			 if(s1.equals(s2))
			 System.out.println("s1 y s2 contien el mismo texto");
			 else
			 System.out.println("s1 y s2 NO contienen el mismo texto");
			 
			 //Para comparar dos strings si tienen el mismo contenido SIEMPRE usa equals
			 
			 //SUBSTRING
			 String str= "hola mundo";
			 System.out.println("de 0 a 2: " +str.substring(0, 2));
			 System.out.println("de 2 a 6: " +str.substring(2, 6));
			 
			 //CHAR AT
			 String str5= "hola mundo";
			 System.out.println(str5.charAt(0));
			 System.out.println(str5.charAt(1));
			 System.out.println(str5.charAt(2));
			 
			 //USE DELIMITER
			 String s="HOLA,ADIOS,CHAO";
			 Scanner sc = new Scanner(s);
			 sc.useDelimiter(",");
			 System.out.println(sc.next() + " "+ sc.next()+ " "+sc.next());
			}
	}

