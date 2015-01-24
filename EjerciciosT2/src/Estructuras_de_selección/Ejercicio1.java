package Estructuras_de_selección;
import java.util.*;

public class Ejercicio1 {
	public static void main(String args[]) {

		int año;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce año: ");
		año = teclado.nextInt();

		String tiempo;

		if (año == 2014)
			System.out.println("PRESENTE");
		else if (año < 2014)
			System.out.println("PASADO");
		else if (año > 2014)
			System.out.println("FUTURO");

	}

}
