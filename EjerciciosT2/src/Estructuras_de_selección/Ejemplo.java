package Estructuras_de_selección;
import java.util.*;

public class Ejemplo {
	public static void main(String args[]) {

		int mes;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un mes");
		mes = teclado.nextInt();

		if (mes == 12 || mes == 1 || mes == 2) {
			System.out.println("Invierno");
		} else if (mes == 3 || mes == 4 || mes == 5) {
			System.out.println("Primavera");
		} else if (mes == 6 || mes == 7 || mes == 8) {
			System.out.println("Verano");
		} else if (mes == 9 || mes == 10 || mes == 11) {
			System.out.println("Otoño");
		}// fin if else

	}// fin main

}// fin clase
