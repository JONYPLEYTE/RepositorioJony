package Ejercicios;

import java.util.Scanner;

public class EJERCICIO3_CATETOS_TRIANGULO {

	public static void main(String[] args) {
		double cateto1;
		double cateto2;
		double hipotenusa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el cateto 1 del triangulo: ");
		cateto1= teclado.nextFloat();
		
		System.out.println("Introduce el cateto 2 del triangulo: ");
		cateto2= teclado.nextFloat();
		
		hipotenusa =(Math.sqrt((cateto1 * cateto1)  + (cateto2 * cateto2)));
		System.out.println("La hipotenusa es: " + hipotenusa + "cm");
		
		}

}
