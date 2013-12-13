package Unidad2;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo_Calculado {

	public static void main(String[] args) {
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		int ancho,alto,centro_x,centro_y,diametro_disco;
		
		//Inicializamos los valores de dibujo del semaforo
		
		ancho=100;
		alto=200;
		centro_x=300;
		centro_y=300;
		diametro_disco=ancho/2;
		//                                                                 ___
		//caja = new Rectangle(coordenadas x, coordenadas y, ancho, alto)-|*__|
		caja = new Rectangle(centro_x-ancho/2,centro_y-alto/2,ancho,alto);
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(centro_x-ancho/10,centro_y+alto/2,ancho/5,alto*1.5);
		palo.draw();
		palo.fill();
		
		verde=new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/3-alto/3,diametro_disco,diametro_disco);
		verde.setColor(new Color(0,200,0));
		
		ambar=new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/2,diametro_disco,diametro_disco);
		ambar.setColor(new Color(255,255,0));
		
		rojo=new Ellipse(centro_x-diametro_disco/2,centro_y+diametro_disco/1.5,diametro_disco,diametro_disco);
		rojo.setColor(new Color(255,0,0));
		
		verde.draw();
		ambar.draw();
		rojo.draw();
		
		verde.fill();
		ambar.fill();
		rojo.fill();
		

	}

}
