package ejercicios;

import java.util.Scanner;
import java.util.*; 

public class Cinco {

	public static void main(String[] args) {
       
		Scanner in = new Scanner (System.in);
		Double y_x ,y , x ; 
		
		System.out.println("Ingrese el valor de x");
		x = in.nextDouble() ;
		
		
		y_x =  ( 5 * Math.pow(1, 4)) + (2*  Math.pow(1, 3)) +   (3*  Math.pow(1, 2)) + 7;
		
		
		y =  ( 5 * Math.pow(x, 4)) + (2*  Math.pow(x, 3)) +   (3*  Math.pow(x, 2)) + 7;
		
		
		System.out.println("El resultado de la funcion cuando x es igual a 1 es = "  + y_x);
		System.out.println("El resultado de la funcion cuando x es el valor que ingresaste es = "  + y);

	}

}
