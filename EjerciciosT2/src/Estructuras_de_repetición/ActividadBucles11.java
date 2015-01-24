package Estructuras_de_repetición;
import java.util.*;

public class ActividadBucles11 {
	public static void main(String argn[]) {

		int N;
		int max=0;

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("introduce sueldo ");
			N = teclado.nextInt();


			if (N > max) {
				max = N;
			
			}

		}
		System.out.println("el sueldo maximo es: " + max);
	}
	
}
