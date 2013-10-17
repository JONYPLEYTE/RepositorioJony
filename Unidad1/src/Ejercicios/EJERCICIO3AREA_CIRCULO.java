package Ejercicios;

import java.util.Scanner;

public class EJERCICIO3AREA_CIRCULO {

	public static void main(String[] args) {
		float radio;
		float perimetro;
		float area;
		float pi;
		pi=(float)Math.PI;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el radio del circulo en cm: ");
		radio= teclado.nextFloat();
		
		perimetro =( 2.0f * pi * radio );
		System.out.println("El perimetro es: " + perimetro + "cm");
		
		area =( pi * ( radio * radio ));
		System.out.println("El area del circulo es: " + area + "cm2");

	}

}
