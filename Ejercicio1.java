package ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		   int  altura, base,area;

		   System.out.println("Escriba la altura del rectangulo");
		   altura = in.nextInt (); 

		   System.out.println("Escriba la base del rectangulo");
		   base = in.nextInt (); 

		   area = base* altura ;

		   System.out.println("El rectangulo de altura  " + altura + " y de base " + base + " tiene un area de " + area  );
	}

}
