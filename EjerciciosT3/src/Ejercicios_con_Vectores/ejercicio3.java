package Ejercicios_con_Vectores;

import java.util.*;

public class ejercicio3 {
	public static void main(String args[]) {

		int curso_a[];
		int curso_b[];
		int suma_a = 0, suma_b = 0;
		int promedio_a,promedio_b;

		Scanner teclado = new Scanner(System.in);

		curso_a = new int[5];
		curso_b = new int[5];

		System.out
				.println("acontinuacion se introduzira las notas de los cursos ");

		for (int i = 0; i < 5; i++) {
			System.out.println("introduzca las notas de la curso A");
			curso_a[i] = teclado.nextInt();

			System.out.println("introduzca las notas de la curso b");
			curso_b[i] = teclado.nextInt();
		
			suma_a = suma_a + curso_a[i];
			suma_b = suma_b + curso_b[i];

		
		}// fin 1ºfor
		promedio_a=suma_a/5;
		promedio_b=suma_b/5;
		
		if (promedio_a > promedio_b) {
			System.out.println("el curso con mejor promedio es el curso A con: "
					+ promedio_a + " de promedio entre la suma de las notas de los alumnos");
			
		}// fin 1ºif
		
		if (promedio_b > promedio_a) {
			System.out.println("el curso con mejor promedio es el curso B con: "
					+ promedio_b + " de promedio entre la suma de las notas de los alumnos");
		}// fin 2ºif
		
	}// fin main
}// fin
