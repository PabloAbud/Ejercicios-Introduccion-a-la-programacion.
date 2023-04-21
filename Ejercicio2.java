package ejercicios;
import java.util.Scanner ; 


public class Ejercicio2 {

	public static void main(String[] args) {
		  Scanner in = new Scanner (System.in);
		   double radio, perimetro, area;
		   
		   System.out.println("Escriba el radio");
		   radio = in.nextDouble ();

		   perimetro = (2) * Math.PI * (radio) ;
		   area = Math.PI * (radio * radio );

		   System.out.println("El perimero de la circunferencia es : " + perimetro);
		   System.out.println("El area del circulo es : " + area);
	}

}
