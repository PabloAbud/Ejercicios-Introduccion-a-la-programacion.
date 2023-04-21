package ejercicios;
    
import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		double numero1, numero2, numero3, suma, prom;
		
		System.out.println("Ingresa el primer numero");
		numero1= in.nextDouble();

		System.out.println("Ingresa el Segundo numero");
		numero2= in.nextDouble();

		System.out.println("Ingresa el Tercer numero");
		numero3= in.nextDouble();
		
		suma= numero1 + numero2+ numero3;
		prom=  (numero1 + numero2+ numero3)/3 ;
		
		System.out.println("La suma de los valores es "+ suma+  " y el promedio es " + prom);
		
	}

}
