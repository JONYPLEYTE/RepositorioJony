package Ejercicios_Unidad_3;

import java.util.Scanner;

public class Acumuladores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número para ver su tabla de multiplicar: ");
		int numero = teclado.nextInt();
		int linea,multiplicacion;
		
		linea=1;
		multiplicacion=numero;
		while (linea<=10) {
			System.out.println(numero + " x " + linea + " = " + (multiplicacion));
			linea++; 
			multiplicacion+=numero;//multiplicacion=multiplicacion+numero
			}

	}

}
