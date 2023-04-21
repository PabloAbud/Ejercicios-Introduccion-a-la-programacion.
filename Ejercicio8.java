package ejercicios;

import java.util.Scanner;
import java.util.*; 

public class Ejercicio8 {

	public static void main(String[] args) {
	 
        Scanner in = new Scanner (System.in) ;
		double Ladoa, Ladob, Ladoc, Semip, area ; 
		
		System.out.println("Ingrese el primero lado del triangulo ");
		Ladoa = in.nextDouble();
		System.out.println("Ingrese el segundo lado del triangulo ");
		Ladob = in.nextDouble();
		System.out.println("Ingrese el tercer lado del triangulo ");
		Ladoc = in.nextDouble();
		
		Semip = (Ladoa + Ladob+ Ladoc) / 2 ; 
		area = Math.sqrt (Semip * (Semip-Ladoa)* (Semip-Ladob)* (Semip-Ladoc));  //Formula de heron
		
		System.out.println("El area del triangulo es = " + area);
	}

}
