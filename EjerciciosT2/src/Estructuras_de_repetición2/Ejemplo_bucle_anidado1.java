package Estructuras_de_repetición2;

import java.util.*;

public class Ejemplo_bucle_anidado1 {
	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {
			// System.out.println("Fila: "+i );
			for (int j = 0; j < (5 - i); j++) {

				System.out.print((j + 1));
			}
			System.out.println();
		}
	}

}
