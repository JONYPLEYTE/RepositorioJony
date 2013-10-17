package Ejercicios;

import java.util.Scanner;

public class EJERCICIO3AREAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base, altura;
		float perimetro;
		float area;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la base del rectángulo en cm: ");
		base= teclado.nextFloat();
		
		System.out.println("Introduce la altura del rectángulo en cm: ");
		altura= teclado.nextFloat();
		
		perimetro =( base * 2 + altura * 2 );
		System.out.println("El perimetro es: " + perimetro + "cm");
		
		area =( base * altura );
		System.out.println("El area del cuadrado es: " + area + "cm2");
		
	}

}
