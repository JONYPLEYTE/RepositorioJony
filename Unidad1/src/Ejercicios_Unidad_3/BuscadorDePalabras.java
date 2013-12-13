package Ejercicios_Unidad_3;

import java.util.Scanner;

public class BuscadorDePalabras {

	public static void main(String[] args) {
		
		String[] palabras={"uno","dos","tres","cuatro"};
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame una plabra: ");
		
		String intento;
		intento = teclado.next();
		boolean encontrado=false;
		
		
		for(int i=0; i<palabras.length && !encontrado;i++) {
			if (intento.equals(palabras[i])) encontrado=true;
		}
		if (encontrado) System.out.println("ENCONTRADO");
		
		/*String entrada;
		entrada new teclado.Scanner.in
		
		String Palabras [];
		Palabras = new String [5];
		Palabras [1]= "juan";
		Palabras [2]= "pedro";
		Palabras [3]= "pedro";
		Palabras [4]= "pedro";
		Palabras [5]= "pedro";
		
		System.out.Println("Introduzca un nombre de hombre y pruebe suerte: ");
		*/
		
		

	}

}
