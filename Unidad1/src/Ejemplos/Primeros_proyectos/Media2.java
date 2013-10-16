package Ejemplos.Primeros_proyectos;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1, numero2;
		float media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos a hacer la media, introduce 2 numeros:");
		
		numero1= teclado.nextFloat();
		numero2= teclado.nextFloat();//necesito añadir la f(float) para que sepa 
					//que es 7,5, si no pensaria que es 7 y 5.
		media =( numero1 + numero2 ) / 2 ;
		
		System.out.println("Los numero elegidos son: " + numero1 + " y " + numero2);
		System.out.println("La media de los dos números es: " + media);

	}

}
