package Examen;

import java.util.Scanner;

public class EjercicioEx�menA�oPasado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tama�o;
		
		System.out.print("Dame el tama�o de las figuras: ");
		tama�o = input.nextInt();
		
		
		System.out.println("Figura 3: ");
		for(int f=0; f<tama�o-1;f++){
			
		for(int i=0; i<f+2;i++){
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

}
