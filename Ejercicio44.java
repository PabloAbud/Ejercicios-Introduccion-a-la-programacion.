package ejercicios;

import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int edad;
		
		System.out.println("Ingrese su edad");
		edad= s.nextInt();
		
		if(edad <= 13) {
			System.out.println("Es un niño");
			
		}
		else if(edad>13 && edad<=25) {
			System.out.println("Es un joven");
		}
		else {
			System.out.println("Es un adulto");
		}
	}

}
