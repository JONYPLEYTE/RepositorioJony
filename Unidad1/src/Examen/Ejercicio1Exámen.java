package Examen;

import java.util.Scanner;

public class Ejercicio1Ex�men {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tama�o;
		
		System.out.print("Dame el tama�o de las figuras: ");
		tama�o = input.nextInt();
		
		System.out.println("Figura de ejemplo: ");
		for(int i=0; i<tama�o;i++){
			for(int j=0;j<=i;j++){
			System.out.print("@");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Figura 1: ");
		for(int i=0; i<tama�o;i++){
			for(int j=tama�o-i;j>0;j--){
			System.out.print("@");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Figura 1 de otra forma: ");
		for(int i=0; i<tama�o;i++){
			for(int j=0;j<tama�o-i;j++){
			System.out.print("@");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Figura 2: ");
		for(int i=0; i<tama�o;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<tama�o-i;j++){
			System.out.print("@");
			}
			System.out.println();
			
		}
		System.out.println("Figura 3: ");
		for(int i=0; i<tama�o;i++){
			for(int j=0;j<tama�o-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
			System.out.print("@ ");
			}
			System.out.println();
			
		}
	}

}
