package Ejercicios_Unidad_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNúmerosInversos {

	public static void main(String[] args) {
		int[] enteros;
		Scanner teclado = new Scanner(System.in);
		enteros=new int[10];
		
		System.out.println("Introduzca números del 1 al 10: ");
		for(int i=0;i<10;i++)
		enteros[i]=teclado.nextInt();
		System.out.print(Arrays.toString(enteros));
		
		for(int i=9;i>=0;i--)
		System.out.print(" " + enteros[i]);
		
		/*//for(int i=0;i<10;i++)
		//System.out.print(enteros[i]);
		int[] inversos;
		inversos=new int[10];
		enteros = inversos;
		
		for(int i=10;i>10;--i)
		
			
		System.out.println();
		*/
	}

}
