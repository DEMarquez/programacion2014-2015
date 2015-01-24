package Estructuras_de_selección;
import java.util.*;

public class Ejercicio10 {
	public static void main(String args[]) {

		int temperatura;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce Grados centigrados");
		temperatura = teclado.nextInt();

		if (temperatura <= 0) {
			System.out.println("el agua esta en estado solido");
		} else if (temperatura >= 5 && temperatura < 100) {
			System.out.println("el agua esta en estado liquido");
		} else if (temperatura >= 100) {
			System.out.println("el agua esta en estado gaseoso");
		}

	}

}
