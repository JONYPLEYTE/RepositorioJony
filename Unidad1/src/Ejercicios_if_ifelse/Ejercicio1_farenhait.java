package Ejercicios_if_ifelse;

import java.util.Scanner;

public class Ejercicio1_farenhait {
	public static void main(String[] args){
	
	System.out.println("Introduzca un valor de temperatura en grados Farenhait:");
	Scanner teclado=new Scanner(System.in);
	double Farhenheit;
	Farhenheit = teclado.nextDouble();
	
	
	double trans;
	trans = (( Farhenheit - 32) * 5 / 9 );
	System.out.println("Su temperatura es: " + trans + " �C");
	
	if ( trans > 0 ) {
		System.out.println("A�n no est� helando.");
		}
			
		else {
			System.out.println("Peligro, est� helando.");
		}
	}
}

