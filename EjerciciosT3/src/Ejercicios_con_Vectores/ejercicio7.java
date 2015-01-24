package Ejercicios_con_Vectores;

import java.util.*;

public class ejercicio7 {
	public static void main(String args[]) {

		int vector[];
		int N, repeticion = 0;
		int minimo = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca numero de valores del vector");
		N = teclado.nextInt();

		vector = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.println("introduce valores del vector");
			vector[i] = teclado.nextInt();

			if (i == 0) {
				minimo = vector[i];// damos valor a minimo no se puede hacer
									// antes
			}

			if (vector[i] < minimo) {// guardamos valor minimo en la variable
										// minimo
				minimo = vector[i];
			}

		}//for inicializar
		
		// repetido
		for (int j = 0; j < N; j++) {

			if (vector[j] == minimo) {// guardamos los valores repetidos en un
										// contador
				repeticion++;

			}

		}
		
		if (repeticion > 1) {// asignamos las veces que se puede repetir el
								// valor repetido
			System.out.println("hay un valor minimo repetido " + repeticion
					+ " veces es el " + minimo);
		}

	}
}
