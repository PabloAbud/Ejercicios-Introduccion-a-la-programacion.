package ejercicios;

import java.util.Scanner; 

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        double cm, ft, yr, inc  ;
        int eleccion;
        
        System.out.println("Eliga la conversion");
        System.out.println("1- Yardas a Centimetros");
        System.out.println("2- Pies a Centimetros");
        System.out.println("3- pulgadas  a Centrimetros ");
        
        eleccion = in.nextInt();
        
        switch (eleccion) {
        
        case 1:   
            System.out.println("ingresa la distancia en yardas");
              yr = in.nextDouble();
              cm = yr * 91.44;
              System.out.println(yr + " yardas es igual a "+ cm + "Centimetros");        	 
              break; 
         
        case 2: 
        	System.out.println("ingresa la distancia en pies");
            ft = in.nextDouble();
            cm = ft * 30.44;
            System.out.println(ft + " pies es igual a "+ cm + "Centimetros");        	 
            break; 
            
        case 3: 
        	System.out.println("ingresa la distancia en pulgadas");
            inc = in.nextDouble();
            cm = inc * 2.54;
            System.out.println(inc + " pies es igual a "+ cm + "Cenntimetros");        	 
            break; 
            
            
        }

	}
}
