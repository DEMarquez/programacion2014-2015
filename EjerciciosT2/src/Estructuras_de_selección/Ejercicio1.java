package Estructuras_de_selecci�n;
import java.util.*;

public class Ejercicio1 {
	public static void main(String args[]) {

		int a�o;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce a�o: ");
		a�o = teclado.nextInt();

		String tiempo;

		if (a�o == 2014)
			System.out.println("PRESENTE");
		else if (a�o < 2014)
			System.out.println("PASADO");
		else if (a�o > 2014)
			System.out.println("FUTURO");

	}

}
