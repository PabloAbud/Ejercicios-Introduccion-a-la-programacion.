package ejercicios;

import java.util.Scanner; 
import java.util.*; 

public class Ejercicio9 {

	public static void main(String[] args) {
	 
		Scanner in = new Scanner(System.in);
		double radio, altura, volumen;
		
		System.out.println("ingrese el radio del cilindro");
		radio = in.nextDouble();
		System.out.println("ingrese la altura  del cilindro");
		altura = in.nextDouble();
		

		volumen= Math.PI * Math.pow(radio,2 ) * altura; 
		
		System.out.println("El volumen del cilindro es = " + volumen );
		
	}

}
