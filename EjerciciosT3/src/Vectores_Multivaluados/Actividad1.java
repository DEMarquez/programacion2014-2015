package Vectores_Multivaluados;

import java.util.*;

public class Actividad1 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int sala = 5;
		int ordenadores = 20;
		int reservas[][] = new int[sala][ordenadores];

		// inicializar la matriz de reservas
		for (int i = 0; i < sala; i++) {
			for (int j = 0; j < ordenadores; j++) {
				reservas[i][j] = 0;
			}
		}
		// opciones �ra el usuario
		int opcion, numsala, numOrdenador;
		do {
			System.out.println("solicite sala, equipo, turno");
			System.out.println(" 1 = reserva turno");
			System.out.println(" 2 = cancelar turno");
			System.out.println(" 3 = numero de reservas ");
			System.out.println(" 4 = salir ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("introduzca sala");
				numsala = teclado.nextInt();
				System.out.println("itroduzca ordenador");
				numOrdenador = teclado.nextInt();
				// LIBRE == 0
				if (reservas[numsala][numOrdenador] == 0) {
					reservas[numsala][numOrdenador] = 1;
				} else {// OCUPADO != 0

					for (int i = 0; i < sala; i++) {
						System.out.println("sala" + i + ":");

						for (int j = 0; j < ordenadores; j++) {
							if (reservas[i][j] == 0) {
								System.out.println("ordenador " + j
										+ " esta libre");

							}
						}
					}
				}
				break;
			// cancelar un turno
			case 2:
				System.out.println("introduzca sala");
				numsala = teclado.nextInt();
				System.out.println("itroduzca ordenador");
				numOrdenador = teclado.nextInt();
				reservas[numsala][numOrdenador] = 0;
				break;
			// numero de reservas
			case 3:
				int numReservas = 0;
				for (int i = 0; i < sala; i++) {
					System.out.println("sala" + i + ":");

					for (int j = 0; j < ordenadores; j++) {
						if (reservas[i][j] == 1) {
							numReservas++;

						}
					}

				}
				System.out.println("el numero de reservas es: " + numReservas);
				break;
			case 4:
				break;
			}

		} while (opcion != 4);

	}
}
