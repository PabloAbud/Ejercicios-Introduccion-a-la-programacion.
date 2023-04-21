package ejercicios;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		double nota;
		
		System.out.println("Ingrese su nota ");
		nota= in.nextDouble();
		
		if(nota>90) {
			
			System.out.println("Tu nota es A");
			
		}
		else if (nota<=90 && nota >=80 ) {
			
			System.out.println("Tu nota es B");
		}
		else if (nota<80 && nota>= 70 ) {
			
			System.out.println("Tu nota es C");
		} 
		else if (nota<70 && nota>=65) {
			System.out.println("Tu nota es D");
		}  
		else  {
			System.out.println("Tu nota es D");
		}
	}

}
