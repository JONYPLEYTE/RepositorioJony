package Ejercicios;

import java.util.Scanner;

public class EJERCICIO5_MBYTES_ANGEL {

	public static void main(String[] args) {
		double tama�o,velocidad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("�Cu�l es el tama�o del archivo (Mbytes)?");
		tama�o = teclado.nextDouble();
		System.out.print("�Cu�l es la velocidad de transmisi�n (Mbits)?");
		velocidad = teclado.nextDouble();
		tama�o = tama�o*1024*1024*8;
		velocidad = velocidad*1000000;
		
		System.out.print("Datos: " + tama�o + "bits");
		System.out.print("\nVelocidad: " + velocidad + "bps");
		System.out.print("Tiempo para transmitir: " + tama�o / velocidad + "b/s");

	}

}
