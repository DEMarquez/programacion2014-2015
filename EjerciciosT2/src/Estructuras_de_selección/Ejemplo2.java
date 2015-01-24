package Estructuras_de_selección;
import java.util.*;

public class Ejemplo2 {

	public static void main(String[] args) {
		int dias;
		int mes;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce mes");
		mes = teclado.nextInt();

		switch (mes) {
		case 4:
		case 6:
		case 8:
		case 10:
			dias = 30;
			break;
		case 2:
			dias = 28;
			break;
		default:
			dias = 31;
			break;
		}
		System.out.println("El mes " + mes + " tiene " + dias+ " dias.");
	}
}
