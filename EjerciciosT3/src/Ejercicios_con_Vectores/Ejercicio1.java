package Ejercicios_con_Vectores;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {

		int valor[];
		int suma1 = 0, suma2 = 0;

		Scanner teclado = new Scanner(System.in);

		valor = new int[8];

		for (int i = 0; i < 8; i++) {
			System.out.println("introduce valor");
			valor[i] = teclado.nextInt();

		}// fin for
		for (int i = 0; i < 8; i++) {
			suma1 = suma1 + valor[i];// El valor acumulado de todos los
										// elementos del vector
			if (valor[i] > 36) {
				suma2 = suma2 + valor[i];// suma de valores superiores a 36

			}// fin 1if
			if (valor[i] > 50) {// mostrar valores superiores a 50
				System.out.println("valores superiores a 50: " + valor[i]);

			}// fin 2if
		}// fin 2 for

		System.out.println("resultado de la suma de todos los valores: "
				+ suma1);
		System.out.println("calculo de valores superiores a 36: " + suma2);

	}// fin main

}// fin
