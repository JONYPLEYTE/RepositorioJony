package Ejemplos.Primeros_proyectos;

public class Media {

	public static void main(String[] args) {
		float numero1, numero2;
		float media;
		
		numero1=4.0f;
		numero2=7.5f;//necesito añadir la f(float) para que sepa 
					//que es 7,5, si no pensaria que es 7 y 5.
		media =( numero1 + numero2 ) / 2 ;
		System.out.println(" La media es: " + media);
		
		System.out.println("La media es el resultado de sumar " + numero1 +" + "+ 
				numero2 + " y a continuación lo dividimos entre 2, para obtener " +
						 "el siguiente resultado: " + media);
		

	}

}
