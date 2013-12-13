package Ejercicios_Unidad_3;

public class Ejemplo_Metodos {
	public static void main(String[] args) {
		
		for(int i=0;i<15;i++){
			System.out.print(Aleatorios(3,6));
			for(int j=0;j<15;j++){
				System.out.println();
			System.out.print(Aleatorios(3,6));
				}
			}
		
	
		
	}

	public static int Aleatorios(int min, int max){
	int aleatorio;
	
	aleatorio = (int)(Math.random()* ((max - min) + 1)) + min;
	return aleatorio;
	}
}