package Estructuras_de_selección;
import java.util.*;

public class Ejercicio5 {
	public static void main(String args[]) {

		int a, b, c, x;
		double x1, x2, d;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce a");
		a = teclado.nextInt();

		System.out.println("introduce b");
		b = teclado.nextInt();

		System.out.println("introduce c");
		c = teclado.nextInt();

		/** realizar operaciones antes de incluir en el programa el if y el else */

		d = Math.pow(b, 2) - (4 * a * c);// operaccion de dentro de la raiz
		x1 = (b + Math.sqrt(d)) / (2 * a);// calcular primer resultado
		x2 = (b - Math.sqrt(d)) / (2 * a);// calculo segundo resultado

		if (a == 0) {
			x = -c / b;
		} else if (d == 0) {
			x = -b / 2 * a;
		} else if (d > 0) {
			System.out.println("El resultado de X1 da: " + x1);
			System.out.println("El resultado de X2 da: " + x2);
		} else {
			System.out.println("Solución no valida");

		}// fin if else

	}// fin main

}// fin class
