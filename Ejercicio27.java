package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
		int cantp, preciot;
		
		System.out.println("Ingrese la cantidad de pantalones que comprara");
		cantp=in.nextInt();
		
		if(cantp>3) {
			
			preciot= cantp * 10;
			System.out.println("Su precio final es " + preciot);
			
			
		}
		else {
			preciot= cantp * 12;
			System.out.println("Su precio final es " + preciot);
			
		}
	}

}
