package Ejercicios_Unidad_3;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadenas;
		Scanner teclado = new Scanner(System.in);
		cadenas = new String[5];

		System.out.println("Introduzca 5 oraciones:");
		for (int i = 0; i < 5; i++)
			cadenas[i] = teclado.nextLine();
		System.out.println(Arrays.toString(cadenas));

	}

}
