package Ejercicios;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		float numero1, numero2;
		float media;
		float suma;
		float producto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos a hacer la media, la suma y el producto."+
		" Para ello introduce 2 numeros:");
		
		numero1= teclado.nextFloat();
		numero2= teclado.nextFloat();//necesito añadir la f(float) para que sepa 
					//que es 7,5, si no pensaria que es 7 y 5.
		media =( numero1 + numero2 ) / 2 ;
		suma =( numero1 + numero2 );
		producto =( numero1 * numero2 );
		
		System.out.println("Los numero elegidos son: " + numero1 + " y " + numero2);
		System.out.println("La media de los dos números es: " + media);
		System.out.println("La suma de los dos números es: " + suma);
		System.out.println("El producto de los dos números es: " + producto);

	}

}
