package Estructuras_de_repetici�n;
import java.util.Scanner;

public class Ejemplobucle8 {
	public static void main(String argn[]) {

		int opcion;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("introduce opcion");
			System.out.println("1� Extraer Dinero");
			System.out.println("2� Ingresar Dinero");
			System.out.println("3� Ultimos Movimientos");
			System.out.println("4� Salir");
			opcion = teclado.nextInt();

		} while (opcion < 1 || opcion > 4);
		System.out.println("que pase un buen dia PERROOOOOO");
		

	}
}
