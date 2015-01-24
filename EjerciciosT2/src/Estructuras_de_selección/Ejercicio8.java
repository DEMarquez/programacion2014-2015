package Estructuras_de_selección;
import java.util.*;

public class Ejercicio8 {
	public static void main(String args[]) {

		double p1, p2, p3;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio del 1º producto");
		p1 = teclado.nextDouble();

		System.out.println("Introduce el precio del 2º producto");
		p2 = teclado.nextDouble();

		System.out.println("Introduce el precio del 3º producto");
		p3 = teclado.nextDouble();

		if (p1 > p2 && p2 > p3) {
			System.out.println("precio 1º " + p1 + "euros." + " Precio 2º "
					+ p2 + "euros. Precio 3º " + p3 + "euros");

		} else if (p1 > p3 && p3 > p2) {
			System.out.println("precio 1º " + p1 + "euros. " + "Precio 2º "
					+ p3 + "euros. Precio 3º " + p2 + "euros");

		} else if (p2 > p1 && p1 > p3) {
			System.out.println("precio 1º " + p2 + "euros." + " Precio 2º "
					+ p1 + "euros. Precio 3º " + p3 + "euros");

		} else if (p2 > p3 && p3 > p1) {
			System.out.println("precio 1º " + p2 + "euros." + " Precio 2º "
					+ p3 + "euros. Precio 3º " + p1 + "euros");

		} else if (p3 > p2 && p2 > p1) {
			System.out.println("precio 1º " + p3 + "euros." + " Precio 2º "
					+ p2 + "euros. Precio 3º " + p1 + "euros");

		} else if (p3 > p1 && p1 > p2) {
			System.out.println("precio 1º " + p3 + "euros." + " Precio 2º "
					+ p1 + "euros. Precio 3º " + p2 + "euros");

		}

	}

}
