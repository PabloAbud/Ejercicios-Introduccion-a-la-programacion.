package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int nota;
		
		System.out.println("Ingrese su nota");
		nota= in.nextInt();
		
		if(nota>= 60) {
			
			System.out.println("Felicidades, aprobaste el curso ");
		}
		else {
			System.out.println("Reprobaste el curso");
		}	
		
	}

}
