package repaso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class cirque_du_soleil {
	public static void main(String args[]) {

		int N;
		double min = 0;

		Scanner teclado = new Scanner(System.in);
		Scanner inFile = null;

		System.out.println("Introduzca el número de ciudades");
		N = teclado.nextInt();

		String[] ciudades = new String[N];
		int[] actuaciones = new int[N];
		double[] ingresos = new double[N];

		// TRY
		try {
			inFile = new Scanner(new FileReader("entrada.txt"));

			System.out.println("Introduzca la informacion sobre las ciudades");

			for (int i = 0; i < N; i++) {

				/* System.out.println("nombre de la ciudad: "); */
				ciudades[i] = inFile.next();
				/* System.out.println("numero de actuaciones: "); */
				actuaciones[i] = inFile.nextInt();
				/* System.out.println("ingresos: ") */;
				ingresos[i] = inFile.nextDouble();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			inFile.close();
		}

		int opcion;
		do {
			System.out.println("Seleccione una de las opciones");
			System.out.println("1. consultar datos ciudad");
			System.out.println("2. Recaudación Máxima");
			System.out.println("3. Recaudación Mínima");
			System.out.println("4. Histograma de actuaciones");
			System.out.println("5. Ingresos Medios");
			System.out.println("6. Salir");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("introduzca ciudad");
				String ciudad = teclado.next();
				int i = 0;
				boolean encontrado = false;
				while (!encontrado) {
					if (ciudad.equals(ciudades[i])) {
						encontrado = true;
						System.out.println("actuaciones " + actuaciones[i]);
						System.out.println("ingresos " + ingresos[i]);
					} else {
						i++;

					}
				}

				break;
			case 2:
				double max = ingresos[0];
				String ciudadMax = ciudades[0];

				for (i = 0; i < ingresos.length; i++) {

					if (ingresos[i] > max) {
						max = ingresos[i];
						ciudadMax = ciudades[i];
						System.out.println("el ingreso mayor es :" + max);
					}
				}
				System.out.println("ciudad: " + ciudadMax + " recaudacion "
						+ max);

				break;
			case 3:
				for (i = 0; i < ingresos.length; i++) {

					if (i == 0) {
						min = ingresos[i];
					}
					if (ingresos[i] < min) {
						min = ingresos[i];
						System.out.println("el ingreso menor es :" + min);
					}
				}

				break;
			case 4:
				int[] histograma = new int[11];
				for (i = 0; i < histograma.length; i++) {
					for (int j = 0; j < actuaciones.length; j++) {

						if (actuaciones[j] == i) {
							histograma[i]++;
						}
						/*
						 * tambien se puede hacer de esta forma es mas eficiente
						 * for(int j=0;j<actuaciones.length;j++){
						 * histograma[actuaciones[j]]++; }
						 */
					}
				}
				for(i = 0; i< histograma.length; i++){
					//cuantas ciudades hay con un determinado num de actuaciones
					System.out.print(i+ " actuaciones: ");
						for(int j = 0; j< histograma[i]; i++){
							System.out.print("*");
						}
						System.out.println();
				}

				break;
			case 5:
				PrintWriter out = null;
				try {
					out = new PrintWriter("salida.txt");

					double media;
					double sumaIngresos = 0;
					for (i = 0; i < ingresos.length; i++) {
						sumaIngresos = sumaIngresos + ingresos[i];
					}
					media = sumaIngresos / ingresos.length;
					for (i = 0; i < ciudades.length; i++) {
						if (ingresos[i] > media) {
							out.println("ciudad: " + ciudades[i]);
						}
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (out != null) {
						out.close();
					}
				}

				break;

			}

		} while (opcion != 6);

	}
}
