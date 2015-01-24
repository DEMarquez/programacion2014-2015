package Estructuras_de_repetición;
import java.util.*;

public class ActividadBucles9 {
	public static void main(String argn[]) {
		int N;
		int i = 0;
		double media;
		int suma = 0;
		int jubilados = 0, jovenes = 0;
		int min, max;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce edad del asistente ");
		N = teclado.nextInt();

		min = N;// le damos valor a min
		max = N;// le damos valor a max

		while (N > 0) {

			suma = suma + N;// suma de edades que al final del bucle le aremos
							// la media
			i++;// contador +1

			if (N >= 65) {// jubilados que hay
				jubilados++;
				System.out.println("jubilados que hay: " + jubilados);

			}
			if (N <= 18) {// jovenes que hay
				jovenes++;
				System.out.println("menores de edad que hay: " + jovenes);
			}
			if (N < min) {// valor minimo
				min = N;
				System.out.println("edad minima: " + min);
			}
			if (N > max) {// valor maximo
				max = N;
				System.out.println("edad maxima: " + max);
			}
			System.out.println("si introduce un numero menor o igual que 0  ");
			System.out.println("el programa se detendra y nos dara la media de edades ");
			System.out.println("introduce edad del asistente ");
			N = teclado.nextInt();

		}
		media = suma / (double) i;// media con decimales (haciendo un casting a
									// double)
		System.out.println("la media de los asistentes es: " + media);

	}
}
