package ExamenCorregido;

import java.util.Scanner;

import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;
import graphics.Text;

public class Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		Rectangle lienzo;
		int num_figuras,tama�o_lienzo;
		num_figuras=0;
		tama�o_lienzo=0;
		Rectangle cuadrado;
		Ellipse circulo;
		Line linea;
		Color[] colores={Color.BLUE,Color.RED,Color.YELLOW,Color.GREEN};
		
		System.out.println("Introduce el tama�o del lienzo: ");
		tama�o_lienzo=teclado.nextInt();
		lienzo = new Rectangle(0,0,tama�o_lienzo,tama�o_lienzo);
		lienzo.draw();
		
		System.out.println("Introduce el n�mero de figuras a dibujar: ");
		num_figuras = teclado.nextInt();
		
		for (int i=0; i<num_figuras; i++){
			Thread.sleep(100); 
			int caso = (int)(Math.random()*4);
			Color pintar = colores[(int)(Math.random()*4)];
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*150);
			
			switch(caso){
			case 0:
				cuadrado = new Rectangle(x,y,tama�o_lienzo/4,tama�o_lienzo/4);
				cuadrado.setColor(pintar);
				cuadrado.draw();
				break;
			case 1:
				linea = new Line(x,y,tama�o_lienzo/4,tama�o_lienzo/4);
				linea.setColor(pintar);
				linea.draw();
				break;
			case 2:
				circulo = new Ellipse(x,y,tama�o_lienzo/4,tama�o_lienzo/4);
				circulo.setColor(pintar);
				circulo.draw();
				break;
			case 3:
				Text texto;
				texto = new Text(x,y,"DAW");
				texto.setColor(pintar);
				texto.draw();
				break;
			}	
			
			
			
		}
		
		
	}

}
