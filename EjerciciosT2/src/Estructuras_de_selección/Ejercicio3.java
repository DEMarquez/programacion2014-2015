package Estructuras_de_selecci�n;
import java.util.*;

public class Ejercicio3 {
	public static void main(String args[]) {

		int x;// lado
		int y;// lado

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce x: ");
		x = teclado.nextInt();

		System.out.println("Introduce y: ");
		y = teclado.nextInt();

		if (y > 0 && x > 0) {
			System.out.println("+y+x 1�cuadrante");//
		} else if (y < 0 && x > 0) {
			System.out.println("-y+x 2�cuadrante");//
		} else if (y < 0 && x < 0) {
			System.out.println("-y-x 3�cuadrante");//
		} else {
			System.out.println("-x+y 4�cuadrante"); //
		}

	}
}
