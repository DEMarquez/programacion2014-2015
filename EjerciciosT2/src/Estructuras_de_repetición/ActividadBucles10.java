package Estructuras_de_repetición;
import java.util.*;

public class ActividadBucles10 {
	public static void main(String argn[]) {

		int notas;
		int suspenso = 0, aprobado = 0, condicionado = 0;

		Scanner teclado = new Scanner(System.in);

		

		for (int i = 0; i < 6; i++) {
			
			System.out.println("introduce nota de alumno ");
			notas = teclado.nextInt();
			
			if (notas < 4) {
				suspenso++;
			}
			if (notas == 4) {
				condicionado++;
			}
			if (notas >= 5) {
				aprobado++;
			}

		}
		
		System.out.println("han suspendido " + suspenso + " alumnos");
		System.out.println("alumnos condicionados " + condicionado);
		System.out.println("han aprobado " + aprobado + " alumnos");
	}
}
