package ejercicios;

import java.util.Scanner;
import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		double numero,resultado ;
		 
		System.out.println("Ingrese un numero");
		numero= in.nextInt();
		
		resultado =  Math.cos(numero); 
		
		System.out.println("El coseno del numero es = " + numero);

	}

}
