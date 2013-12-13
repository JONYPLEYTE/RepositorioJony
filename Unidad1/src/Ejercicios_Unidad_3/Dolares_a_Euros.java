package Ejercicios_Unidad_3;

import java.util.Scanner;

public class Dolares_a_Euros {

	public static double Conversor(double a_dolares, double a_euros){
		double dolar = 0.72690;//EUR
		double euro = 1.3757;//USD
		a_euros = dolar /euro;
		double dolares = euro / dolar;
		return dolares;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Introduce la cantidad de Dolares: ");
		Scanner teclado = new Scanner(System.in); 
		double dolares = teclado.nextDouble();
		Conversor();
		

	}

}
