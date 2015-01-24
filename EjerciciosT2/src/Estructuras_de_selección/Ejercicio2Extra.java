package Estructuras_de_selección;
import java.util.Scanner;

public class Ejercicio2Extra {
	public static void main(String args[]) {

		int opcion, nota, nota2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce nota");
		nota = teclado.nextInt();

		System.out.println("introduce nota");
		nota2 = teclado.nextInt();

		System.out.println("introduce nota");
		opcion = teclado.nextInt();

		/** caso con if */
		if (nota2 < 5)
			System.out.println("Suspendido ");
		if (nota2 < 7)
			System.out.println("Aprobado ");
		if (nota2 < 9)
			System.out.println("Notable ");
		if (nota2 < 10)
			System.out.println("Sobresaliente");
		else
			System.out.println("Matricula de honor ");

		/** caso con else if */
		if (nota <= 4) {
			System.out.println("Suspendido ");
		} else if (nota <= 6) {
			System.out.println("Aprobado ");
		} else if (nota <= 8) {
			System.out.println("Notable ");
		} else if (nota >= 9) {
			System.out.println("Sobresaliente ");
		} else
			System.out.println("Matricula de honor ");
		{
		}

		/** caso con switch */
		switch (opcion) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspendido ");
			break;
		case 5:
		case 6:
			System.out.println("aprobado ");
			break;
		case 7:
		case 8:
			System.out.println("notable ");
			break;
		case 9:
			System.out.println("sobresaliente ");
			break;
		default:
			System.out.println("matricula de honor ");

		}

	}

}
