package Estructuras_de_selección;
import java.util.Scanner;

public class Ejercicio1Extra {

	public static void main(String args[]) {

		double precio;
		int opcion;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce Bebida");
		System.out.println("Cafe solo (opcion 1)");
		System.out.println("Cortado (opcion 2)");
		System.out.println("Chocolate (opcion 3)");
		System.out.println("Leche (opcion 4)");
		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			precio = 0.35;
			System.out.println("cafe solo " + precio + " centimos");
			break;
		case 2:
			precio = 0.40;
			System.out.println("cortado " + precio + " centimos");
			break;
		case 3:
			precio = 0.30;
			System.out.println("chocolate " + precio + " centimos");
			break;
		case 4:
			precio = 0.35;
			System.out.println("leche " + precio + " centimos");
			break;
		default:
			System.out.println("no hay mas productos en la carta ");

		}

	}

}
