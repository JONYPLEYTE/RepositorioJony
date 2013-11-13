package Unidad2;
import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Color;

public class Semaforo {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		
		caja = new Rectangle(10,10,60,110);
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(40,120,5,100);
		palo.draw();
		palo.fill();
		
		verde=new Ellipse(25,20,30,30);
		verde.setColor(new Color(0,200,0));
		
		ambar=new Ellipse(25,50,30,30);
		ambar.setColor(new Color(255,255,0));
		
		rojo=new Ellipse(25,80,30,30);
		rojo.setColor(new Color(255,0,0));
		
		verde.draw();
		ambar.draw();
		rojo.draw();
		
		verde.fill();
		ambar.fill();
		rojo.fill();
		
	}

}
