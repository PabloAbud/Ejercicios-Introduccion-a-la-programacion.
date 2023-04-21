package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
       
		Scanner in= new Scanner(System.in);
		int Masa, Aceleracion, Fuerza; 
		
		System.out.println("Ingrese la masa del cuerpo");
		 Masa = in.nextInt();
		 System.out.println("Ingrese la aceleracion del cuerpo");
		 Aceleracion = in.nextInt();
		 
		 Fuerza = Masa * Aceleracion; // segunda ley de newton
		 
		 System.out.println("La fuerza del cuerpo es = " + Fuerza);
				 
		 

	}

}
