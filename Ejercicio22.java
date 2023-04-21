package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Double capitalp, interes;
		
		System.out.println("Ingrese el Capital que le fue prestado");
		capitalp=in.nextDouble();
		
		if(capitalp>10000) {
			
			interes= capitalp*0.07;
		System.out.println("la cantidad a pagar es " +capitalp+ " dolares de capital y " +interes+ " dolares de intereses");
		}
		else {
			
			interes= capitalp*0.06;
			System.out.println("la cantidad a pagar es " +capitalp+ " dolares de capital y " +interes+ " dolares de intereses");
			
			
		}
		
	}

}
