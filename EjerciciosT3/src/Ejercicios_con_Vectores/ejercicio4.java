package Ejercicios_con_Vectores;

import java.util.*;

public class ejercicio4 {
	public static void main(String args[]) {

		int vector[];

		Scanner teclado = new Scanner(System.in);

		vector = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("introduzca valor del vector");
			vector[i] = teclado.nextInt();
		}

		int i = 0;
		boolean ordenado = true;
		while (i < 9 && ordenado) {

			System.out.println("vector[" + i + "]=" + vector[i]);
			System.out.println("<");
			System.out.println("vector[" + (i + 1) + "]=" + vector[i + 1]);
			System.out.println("----------------------------");
			if (vector[i] > vector[i + 1]) {
				ordenado = false;
				System.out.println("no ordenado");
			}
			i++;
		}
		System.out.println("el vector esta ordenado? " + ordenado);

	}

}
