package ejercicios;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		

		Scanner in= new Scanner(System.in);
		int numero, resultado=0;
		
		System.out.println("Escriba la cantidad de numeros que desea imprimir");
		numero= in.nextInt();
		
		numero = numero+1;
		
	    while (resultado <numero) {
	    	System.out.println(resultado);
	    	  resultado++;
	    }  
		
	}

}
