package ejercicios;
 import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		double y,y_x, x,  c = 2.5 ;
		
		System.out.println("Ingrese el valor de X");
		  x= in.nextDouble();
		  
		  y_x = 2 * (c-2);
		  y= x * (c-2); 
		  
		  System.out.println("El valor de la funcion si el valor de x es 2 es :  " + y_x );
		  System.out.println("El valor de la funcion con el valor de x que ingresaste es : " + y);
		
	}

}
