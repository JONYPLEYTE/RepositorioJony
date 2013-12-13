package Ejercicios_Unidad_3;

import java.util.Scanner;

public class For_Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int suma = 0;
		
		
		for ( int numero = 0; numero <=2  ; numero++ ){
			System.out.println("Introduce un número: ");
			suma += teclado.nextInt();
		}
		
		System.out.println("La media es: " + suma / 3);
	}

}
