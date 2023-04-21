package ejercicios;
import java.util.Scanner;
import java.util.*; 

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in); 
		double numero, resultado;
		
		System.out.println("Ingrese un numero ");
		numero = in.nextDouble () ;
		
		resultado =  Math.sqrt (numero); 
		
		System.out.println("La raiz cuadrada del numero es : " + resultado );
		
	}

}
