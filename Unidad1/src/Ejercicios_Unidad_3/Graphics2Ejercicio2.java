package Ejercicios_Unidad_3;

import java.awt.Point;

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;
import graphics2.Text;

public class Graphics2Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado;
		
		cuadrado = new Rectangle(100,100,300,300);
		cuadrado.setThickness(20);
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		Ellipse circulo;
		
		circulo = new Ellipse(150,150,200,200);
		circulo.setThickness(20f);
		circulo.setColor(Color.BLUE);
		circulo.draw();
		
		//Canvas.getInstance().waitMouseClick();
		
		Canvas c;
		c=Canvas.getInstance();
		c.waitMouseClick();
		
		//circulo.undraw();
		
		
		Text coordenadas = new Text(10,10," ");
		coordenadas.draw();
		while(true){
		
			Point pulsacion = c.getMousePosition();
			
			coordenadas.setText(pulsacion.x + "-" + pulsacion.y);
			//Para hacerlo con traslate, solo lo hago con
			//el circulo. con el cuadrado es igual:
			
			// circulo.translate(pulsacion.x-circulo.getX()-circulo.getWidth()/2,
			  //pulsacion.y-circulo.getY()-circulo.getHeight()/2);
			 
			
			cuadrado.undraw();
			circulo.undraw();
			
			
			
			
			
			circulo = new Ellipse(pulsacion.x+50,pulsacion.y+50,200,200);
			circulo.setThickness(20f);
			circulo.setColor(Color.BLUE);
			circulo.draw();
			
			cuadrado = new Rectangle(pulsacion.x,pulsacion.y,300,300);
			cuadrado.setThickness(20);
			cuadrado.setColor(Color.RED);
			cuadrado.draw();
		
			Thread.sleep(100);
		//System.out.println("Has pulsado en: " + pulsacion.x + pulsacion.y);
			}

	}

}