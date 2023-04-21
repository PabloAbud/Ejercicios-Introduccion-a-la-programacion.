package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	 
		Scanner in = new Scanner (System.in) ;
		double Kg, Lb ; 
		
	   System.out.println("Ingrese el valor en kilogramos");
	   Kg = in.nextDouble();
	   
	   Lb= Kg * 2.2 ;
	   
	   System.out.println(Kg+ " Kilogramos Es igual a " +Lb+ " Libras");
			

	}

}
