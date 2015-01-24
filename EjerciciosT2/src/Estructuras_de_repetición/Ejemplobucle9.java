package Estructuras_de_repetición;
import java.util.Scanner;

public class Ejemplobucle9 {
	public static void main(String argn[]) {

		int opcion;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("introduce opcion");
			System.out.println("1º Extraer Dinero");
			System.out.println("2º Ingresar Dinero");
			System.out.println("3º Ultimos Movimientos");
			System.out.println("4º Salir");
			opcion = teclado.nextInt();

		} while (opcion != 4);
		System.out.println("realizando operacion");

	}
}