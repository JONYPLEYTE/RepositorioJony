package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Números a leer: 10");
		Scanner teclado = new Scanner (System.in);
		
		int[] enteros;
		enteros=new int[10];
		int negativos = 0;
		int positivos = 0;
		double sumatorio = 0;
		
		System.out.println("Escribe 10 numeros: ");
		for(int i=0;i<10;i++){
		enteros[i]=teclado.nextInt();
		sumatorio += enteros[i];
		
		if(enteros[i]<0){
			negativos++;
		}else{
			positivos++;	
			
		}
		
		}
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("La media de los números introducidos es: " + sumatorio/2);
	}

}
