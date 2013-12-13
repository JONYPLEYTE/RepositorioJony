package Ejercicios_Unidad_3;

public class EjercicioMetodos {
	
public static void numeros_aleatorios(){
		int numero;
		numero = (int)(Math.random()*10);
		System.out.print(numero);
	}


public static void main(String[] args) {
	 for(int i=0;i<10;i++){
		 for(int j=0;j<10;j++){
			 numeros_aleatorios();
			 System.out.println();
		 }
	 }
	}}
	


