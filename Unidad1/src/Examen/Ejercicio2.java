package Examen;
import java.util.Scanner;

import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca un número: ");
		int numero1 = teclado.nextInt();
		System.out.println("Introduzca otro número: ");
		int numero2 = teclado.nextInt();
		
		Rectangle lienzo;
		lienzo = new Rectangle(200,200,numero1,numero1);
		lienzo.draw();
		
		if (numero1<100){
			numero1 = numero1 * 5;
		
		Rectangle rectangulo;
		rectangulo = new Rectangle(200*3,200*3,numero1/5,numero1/5);
		String cadena;
		cadena = new String("DAW");
		
		
		switch (numero2){
		case 1:
			Ellipse circulo;
			circulo = new Ellipse(200,200,numero1/5,numero1/5);
			Line linea;
			linea = new Line(200*0.25,200*0.25,numero1/5,numero1/5);
			circulo.fill();
			linea.draw();
		case 2:rectangulo.draw();
				
		
		}
		}
		
	
		}
		
	}


