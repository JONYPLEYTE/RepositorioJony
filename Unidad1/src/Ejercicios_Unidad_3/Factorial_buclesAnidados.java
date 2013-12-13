package Ejercicios_Unidad_3;

import java.util.Scanner;

public class Factorial_buclesAnidados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero =1;
		String respuesta;
		long factorial;
		
		System.out.println("Cálculo de factoriales");
		
		do{
			do{
				// pedir número
				System.out.println("Dame un número positivo: ");
				numero=teclado.nextInt();
			}	while (numero<0);
			//Calcular factorial de numero
			factorial=1;
			if (numero!=0) {
				for (int i=1;i<=numero;i++)
					factorial=factorial*i;
			}
			System.out.println("El factorial de " + numero + " es " + factorial);
			
			do {
				System.out.println("\n¿Quiere insertar otro número [s/n]?");
				respuesta=teclado.next();
			}
			while (!respuesta.equals("s") && !respuesta.equals("n"));
		}while (respuesta.equals("s"));
			
			
			}
		}




