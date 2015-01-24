package Estructuras_de_repetición;
import java.util.*;

public class ActividadBucles13 {
	public static void main(String argn[]) {

		int N=0, cantvendida,cantotal=0;
		int totalprecio = 0;
		int preciolitro;
		int factura = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el precio que tiene el litro ");
		preciolitro = teclado.nextInt();

		for (int i = 0; i < 5; i++) {

			System.out.println("introduce la cantidad de desinfectante que quieres ");
			cantvendida = teclado.nextInt();

			N = preciolitro * cantvendida;//precio total de una factura
			cantotal=cantotal+cantvendida;//cantidad total de litros vendidos
			totalprecio=totalprecio+N;//precio total de las facturas
			
			if (N >= 600) {//facturas superiores o iguales a 600$
				factura++;
			}

			
		}
		System.out.println("Precio total de el desinfectante " +totalprecio);
		System.out.println("cantidad total de litros vendidos " +cantotal);
		System.out.println("Facturas emitidas de 600 euros " +factura);

	}

}
