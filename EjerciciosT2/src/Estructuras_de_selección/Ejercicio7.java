package Estructuras_de_selección;
import java.util.*;

public class Ejercicio7 {
	public static void main(String args[]) {

		double alquiler;
		double precio;
		int opcion;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tiempo de alquiler");
		alquiler = teclado.nextDouble();

		System.out.println("Introduce vehiculo");
		System.out.println("Patin a pedales (opcion 1)");
		System.out.println("Patin a motor (opcion 2)");
		System.out.println("Tabla de windsurf (opcion 3)");
		System.out.println("Moto aquatica (opcion 4)");
		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			precio = alquiler * 2;
			System.out.println("Patin a pedales " + precio + "euros");
			break;
		case 2:
			precio = alquiler * 6;
			System.out.println("Patin a motor " + precio + "euros");
			break;
		case 3:
			precio = alquiler * 4;
			System.out.println("tabla de windsurf " + precio + "euros");
			break;
		case 4:
			precio = alquiler * 7;
			System.out.println("moto aquatica " + precio + "euros");
			break;

		}

	}

}
