package Ejercicios_Unidad_3;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		String numero="";
		numero= teclado.next();
		int contador=0;
		
		
		for (int i = 0;i<numero.length()/2;i++){
			if (numero.charAt(i) != numero.charAt(numero.length()-1-i)){
				System.out.println("No es capicúa.");
				contador++;
				break;
			}
		}

		if (contador==0){
			System.out.println("El número " + numero + " es capicúa. ");
		}
		
		
		/*for(int numero2=numero.length()-1;numero>=0;numero--) {
            System.out.print(numero.charAt(numero));
*/
	}

}
