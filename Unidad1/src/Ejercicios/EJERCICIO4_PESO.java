package Ejercicios;

import java.util.Scanner;

public class EJERCICIO4_PESO {

	public static void main(String[] args) {
		double kilos;
		double onzas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kilogramos: ");
		kilos= teclado.nextFloat();
			
		onzas = ( kilos * 1000 ) / 28.3495;
		System.out.println("Tu peso en onzas es: " + onzas + " onzas");

	}

}
