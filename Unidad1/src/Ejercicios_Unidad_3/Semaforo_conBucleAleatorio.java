package Ejercicios_Unidad_3;

	import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Color;

	public class Semaforo_conBucleAleatorio {

		public static void main(String[] args) {
			Rectangle caja,palo;
			Ellipse disco;
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
			
			disco=new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/3-alto/3,diametro_disco,diametro_disco);
			disco.draw();
			disco.fill();
			
			while (true){
			
			disco.setColor(new Color(0,200,0));
			
			
			Thread.sleep(100);
			
			disco.translate(0,diametro_disco/2*2.5);
			disco.setColor(new Color(255,255,0));
			
			Thread.sleep(100);
			
			disco.translate(0,diametro_disco/2*2.5);
			disco.setColor(new Color(255,0,0));
			
			Thread.sleep(100);
			
			
			
			
			disco.translate(0, -(diametro_disco/2+2.5)*2);
			}
			
			
		}

	
	}


