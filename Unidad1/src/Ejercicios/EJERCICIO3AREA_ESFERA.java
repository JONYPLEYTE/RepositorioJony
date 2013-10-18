package Ejercicios;

import java.util.Scanner;

public class EJERCICIO3AREA_ESFERA {

	public static void main(String[] args) {
		float radio;
		float area;
		float pi;
		pi=(float)Math.PI;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la esfera en cm: ");
		radio= teclado.nextFloat();
		
		area =( ( ( 4 / 3 ) * pi ) * ( radio * radio * radio ));
		System.out.println("El area del circulo es: " + area + "cm3");

	}

}
