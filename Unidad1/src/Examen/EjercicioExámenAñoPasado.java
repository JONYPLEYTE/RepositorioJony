package Examen;

import java.util.Scanner;

public class EjercicioExámenAñoPasado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamaño;
		
		System.out.print("Dame el tamaño de las figuras: ");
		tamaño = input.nextInt();
		
		
		System.out.println("Figura 3: ");
		for(int f=0; f<tamaño-1;f++){
			
		for(int i=0; i<f+2;i++){
			for(int j=0;j<tamaño-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
			System.out.print("@ ");
			}
			System.out.println();
		}
		}

	}

}
