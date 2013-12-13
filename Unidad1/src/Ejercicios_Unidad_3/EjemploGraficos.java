package Ejercicios_Unidad_3;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class EjemploGraficos {

	public static void main(String[] args) throws InterruptedException {
		Ellipse pelota;
		Rectangle tablero;
		Color color;//para pintar la pelota
		int movimiento_x;
		int movimiento_y;
		
		pelota = new Ellipse(200,200,40,40);//Crear la pelota
		
		
		color = new Color((int)(Math.random()*256),//para pintar la pelota aleatoria
							(int)(Math.random()*256),
							(int)(Math.random()*256));
		
		tablero = new Rectangle(0,0,400,400);
		tablero.fill();
		
		pelota.setColor(color);
		pelota.fill();
		
		// (int)(Math.random() * (max-min+1)) +min;
		movimiento_x=(int)(Math.random() * (3-(-3+1))-3);//para que el rango sea entre -3 y 3
		movimiento_y=(int)(Math.random() * 7) -3;//es lo mismo de arriba pero simplificado
		if (movimiento_x==0) movimiento_x++;//para evitar que el rango de 0
		if (movimiento_y==0) movimiento_y++;//para evitar que el rango de 0
		while(true){
			pelota.translate(movimiento_x,movimiento_y);
			if ((pelota.getX()+40)>400 || pelota.getX()<0) movimiento_x = -movimiento_x;
			if ((pelota.getY()+40)>400 || pelota.getY()<0) movimiento_y = -movimiento_y;
			
			
			Thread.sleep(10);
		}
	}
}

