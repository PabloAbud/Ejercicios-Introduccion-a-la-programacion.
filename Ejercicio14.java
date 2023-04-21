package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		double a,b , x ;
		
		System.out.println("Ingrese el valor de a");
		a= in.nextDouble();
		System.out.println("Ingrese el valor de b");
		b= in.nextDouble();
		
		x= -(b/a);
		
		System.out.println("El valor de la ecuacion lineal con los datos que ingresaste es " + x);
		
		
	}

}
