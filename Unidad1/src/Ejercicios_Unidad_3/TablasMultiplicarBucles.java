package Ejercicios_Unidad_3;

import java.util.Scanner;

public class TablasMultiplicarBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número para ver su tabla de multiplicar: ");
		int numero = teclado.nextInt();
		int linea;
		
		linea=1;
		while (linea<=10) {
			System.out.println(numero + " x " + linea + " = " + (numero*linea));
			linea++;
		}
	}

}
