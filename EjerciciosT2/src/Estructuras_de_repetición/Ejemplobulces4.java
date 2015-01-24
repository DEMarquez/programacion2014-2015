package Estructuras_de_repetición;
import java.util.Scanner;

public class Ejemplobulces4 {
	public static void main(String argn[]) {

		int N;
		int num, min = 0, max = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce valores a leer");
		N = teclado.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("estamos en interaccion: " + i);
			System.out.println("introduce un número: ");
			num = teclado.nextInt();

			if (i == 1) {
				System.out.println("estamos en la 1º iteraccion: ");
				System.out.println("estamos en el max y el min: ");
				max = num;
				min = num;
				System.out.println("max: " + max);
				System.out.println("min: " + min);
			}

			// maximo
			System.out.println("vamos a ver si num " + num
					+ "es mayor que max " + max);
			if (num > max) {
				System.out.println(num + "> " + max);
				max = num;
				System.out.println(max + "= " + num);
			}
			// minimo
			System.out.println("vamos a ver si num " + num
					+ "es mayor que max " + min);
			if (num < min) {
				System.out.println(num + "> " + min);
				min = num;
				System.out.println(min + "= " + num);
			}

		}

	}

}
