package Estructuras_de_repetición;
import java.util.*;

public class Ejemplobuche3 {
	public static void main(String argn[]) {

		int i;
		int num;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce un numero");
		num = teclado.nextInt();

		for (i = 1; i <= 10; i++) {

			System.out.println(num + " X " + i + " = " + (num * i));

		}

	}

}
