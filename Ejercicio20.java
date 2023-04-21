package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese cualquier numero entero");
		numero = in.nextInt();
		
		if (numero%2 == 0){
			
			System.out.println("El numero es par");		
		}
		else {
			System.out.println("El numero es impar");
		}
 
	}

}
