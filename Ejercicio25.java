package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese cualquier numero entero");
		numero= in.nextInt();
		
		if(numero %3==0) {
			
			System.out.println("El numero es divisible entre 3");
		}
		else {
			System.out.println("El numero no es divisible entre 3");
			
		}
		
	}

}
