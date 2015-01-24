package repaso_examen;

import java.util.*;

public class ejercicio4 {
	public static void main(String[] args) {

		float total = 0, nota;
		int numero_alumnos = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir primera nota (-1 para acabar): ");
		nota = teclado.nextFloat();
		while (nota != -1) {
			total = total + nota;
			numero_alumnos = numero_alumnos + 1;
			System.out.println("Introducir siguiente nota (-1 para acabar): ");
			nota = teclado.nextFloat();
		}
		if (numero_alumnos != 0)
			System.out.println("La nota media es:" + (total / numero_alumnos));
	}

}
