package Estructuras_de_selección;
import java.util.*;

public class Ejercicio9 {
	public static void main(String args[]) {

		float pre_unidad, unidades;// introducir por pantalla
		float precio_grupos, precio_unidades_sueltas, total_precio3x2, grupos, unidades_sueltas;// 3x2
		float total_precio30, precio;// 30%

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce precio por unidad");
		pre_unidad = teclado.nextFloat();

		System.out.println("Introduce unidades de producto");
		unidades = teclado.nextFloat();

		/** 3x2 */
		grupos = unidades / 3;
		unidades_sueltas = unidades % 3;

		precio_grupos = grupos * (2 * pre_unidad);
		precio_unidades_sueltas = pre_unidad * unidades_sueltas;

		total_precio3x2 = precio_grupos + precio_unidades_sueltas;

		/** 30% */
		precio = (unidades * pre_unidad);
		total_precio30 = precio - (precio * 30 / 100);

		if (total_precio3x2 > total_precio30) {
			System.out.println("cuesta " + total_precio30 + "con la oferta 30%");

		} else {
			System.out.println("cuesta " + total_precio3x2 + "con la oferta 3x2");

		}

	}

}
