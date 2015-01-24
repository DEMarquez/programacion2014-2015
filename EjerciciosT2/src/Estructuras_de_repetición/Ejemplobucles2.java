package Estructuras_de_repetición;
import java.util.*;

public class Ejemplobucles2 {
	public static void main(String argn[]) {

		int N;
		int i;
		int num;
		int suma = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce valores a leer");
		N = teclado.nextInt();

		for (i = 0; i < N; i = i + 1) {
			System.out.println("variable de control i " + i);
			System.out.println("Escribe valores");
			num = teclado.nextInt();

				System.out.println("suma antes " + suma);
			if (num % 2 == 0) {
				suma = suma + num;
				System.out.println("suma despues " + suma);

			}

		}// fin for

		System.out.println("la suma de los pares es: " + suma);

	}

}
