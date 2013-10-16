package Ejemplos.Primeros_proyectos;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre;
		System.out.println("Escribe una frase:");
		
		nombre=teclado.nextLine();
		
		
		System.out.println("Esto es lo que he escrito: " + nombre);

	}

}
