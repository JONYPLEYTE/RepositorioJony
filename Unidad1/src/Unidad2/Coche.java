package Unidad2;

import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Line;

public class Coche {

	public static void main(String[] args) {
		
		Rectangle chasis, habitaculo;
		Ellipse rueda_d, rueda_t;
		Line carretera;
		
		chasis = new Rectangle(80,80,300,90);
		chasis.draw();

		habitaculo = new Rectangle(150,20,170,60);
		habitaculo.draw();
		
		rueda_d = new Ellipse(20,20)
	}

}
