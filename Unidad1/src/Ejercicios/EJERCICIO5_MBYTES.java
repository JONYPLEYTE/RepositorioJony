package Ejercicios;

import java.util.Scanner;

public class EJERCICIO5_MBYTES {

	public static void main(String[] args) {
		double Mbytes;
		Scanner teclado = new Scanner(System.in);
		double Mbps;
		double tiempo;
		
		System.out.println("Introduce el tama�o de un archivo en Mbytes: ");
		Mbytes= teclado.nextFloat();
		System.out.println("Introduce la velocidad de transmisi�n en Mbps: ");
		Mbps= teclado.nextFloat();
			
		tiempo = ( Mbytes / 8 ) / Mbps;
		System.out.println("El archivo tardar� en transferirse: " + tiempo + " segundos ");

	}

}
