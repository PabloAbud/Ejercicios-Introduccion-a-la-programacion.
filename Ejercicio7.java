package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		double F, C ;
		
        System.out.println("Ingrese un valor en grados Fahrenheit");
        F = in.nextDouble();
        
        C = ( (F-32) * 5 ) / 9  ; 
        
       System.out.println(F+ " Grados Fahrenheit es igual a " +C+ " grados Celsius");
	}

}
