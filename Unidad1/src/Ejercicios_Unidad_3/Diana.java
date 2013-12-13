package Ejercicios_Unidad_3;

import graphics.Color;
import graphics.Ellipse;

public class Diana {

	public static void main(String[] args) {
		Color[] colores;
		int centro_x, centro_y;
		int distancia;

		colores = new Color[5];

		colores[0] = new Color(255, 0, 0);
		colores[1] = Color.CYAN;
		colores[2] = Color.GREEN;
		colores[3] = Color.YELLOW;
		colores[4] = new Color(125, 255, 0);

		centro_x = 200;
		centro_y = 200;
		distancia = 25;
		int posicion = -1, anterior = -1;
		for (int i = 10; i > 0; i--) {
			Ellipse circulo;
			circulo = new Ellipse(centro_x - i * distancia, centro_y - i
					* distancia, distancia * i * 2, distancia * i * 2);
			circulo.draw();

			while (true) {

				if (posicion != anterior) {

					break;
				} else {
					posicion = (int) (Math.random() * 5);
				}
			}
			circulo.setColor(colores[posicion]);
			circulo.fill();
			anterior = posicion;

		}

	}

}
