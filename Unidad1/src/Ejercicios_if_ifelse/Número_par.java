/*2.Escribe un programa que pida un número con el fin de visualizarlo, 
siempre que dicho número sea par*/

package Ejercicios_if_ifelse;

import java.util.Scanner;

public class Número_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca un número:");
		Scanner teclado=new Scanner(System.in);
		
		int numero;
		numero = teclado.nextInt();
		
		double par;
		par = (numero / 2);
		
		if (numero  == (par / 2)){
			System.out.println("Sú número es el " + numero + " y es par.");
			}
		else {
			System.out.println("Sú número es el " + numero + " y no es par.");
		}
			
		}
	}


