package Estructuras_de_repetición;
import java.util.*;

public class ActividadBucles14 {
	public static void main(String argn[]) {

		int edad, jovenes = 18;
		double altura = 0;
		double media;
		double suma = 0;
		int mayores = 0;
		int mas_altos = 0;
		double i;
		double alturaMedia = 1.75;

		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < 5; i++) {

			System.out.println("introduce la edad del alumno ");
			edad = teclado.nextInt();

			System.out.println("introduce la altura del alumno ");
			altura = teclado.nextDouble();

			suma = suma + altura;

			if (edad > jovenes) {
				mayores++;
			}
			if (altura > alturaMedia) {
				mas_altos++;
			}

		}
		media = suma / i;

		System.out.println("cantidad de alumnos mayores de 18 años " + mayores);
		System.out.println("cantidad de alumnos mas altos de 1.75m "
				+ mas_altos);

	}

}
