package Ejercicios_Unidad_3;

import java.util.Scanner;

public class Bucle_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un n�mero para ver su tabla de multiplicar: ");
		int numero = teclado.nextInt();
		int linea;
		
		linea=1;
		
		do {
			System.out.println(numero + " x " + linea + " = " + (numero*linea));
			linea++; 
			} while (linea<=10);

	}

}
