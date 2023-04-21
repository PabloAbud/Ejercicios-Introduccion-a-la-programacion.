package ejercicios;

import  java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int edad ;
		
		System.out.println("Ingrese su edad");
		edad= in.nextInt();
		
		if (edad >= 16) {
			
			System.out.println("Usted puede votar");
		} 
		else {
			System.out.println("Usted no puede votar");
		}

	}

}
