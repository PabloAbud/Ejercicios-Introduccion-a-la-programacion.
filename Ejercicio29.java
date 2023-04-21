package ejercicios;

import java.util.Scanner;
import java.util.*;

public class Ejercicio29 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int numero1, numero2, resultado; 
		
		System.out.println("Ingrese el primer numero");
		numero1= in.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2= in.nextInt();
		
		resultado = Math.abs(numero2-numero1)  ;

		System.out.println("La distancia entre los dos numeros es " + resultado );
	}

}
