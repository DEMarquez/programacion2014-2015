package Estructuras_de_repetición;
import java.util.*;

public class ejemplobucles1 {
	public static void main(String argn[]) {

		int n;// variable num usuario
		int i;// variable bucle
		int media;
		int suma = 0;// variable ausiliar de guardado de datos

		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < 10; i = i + 1/**igual a i++*/) {// intrucciones del bucle
			/** cuerpo del bucle */
			System.out.println("introduce valor");
			n = teclado.nextInt();

			System.out.println("suma antes " + suma);// mostrar por pantalla el
													// valor antes de sumarlo
			suma = suma + n;// esta variable no machaca y es ausiliar guarda los
							// valores
			System.out.println("suma despues " + suma);// mostrar por pantalla
														// valor despues de
														// sumarlo
		}

		media = suma / 10;// esta variable da la media de las sumas almacenadas
		System.out.println("media " + media);// mostrar media

	}

}
