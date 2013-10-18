package Ejercicios;

import java.util.Scanner;

public class EJERCICIO5_MBYTES_ANGEL {

	public static void main(String[] args) {
		double tamaño,velocidad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Cuál es el tamaño del archivo (Mbytes)?");
		tamaño = teclado.nextDouble();
		System.out.print("¿Cuál es la velocidad de transmisión (Mbits)?");
		velocidad = teclado.nextDouble();
		tamaño = tamaño*1024*1024*8;
		velocidad = velocidad*1000000;
		
		System.out.print("Datos: " + tamaño + "bits");
		System.out.print("\nVelocidad: " + velocidad + "bps");
		System.out.print("Tiempo para transmitir: " + tamaño / velocidad + "b/s");

	}

}
