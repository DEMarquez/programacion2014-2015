package Estructuras_de_repetición;
import java.util.*;

public class Actividadbucles4 {
	public static void main(String argn[]) {

		int N;
		int i;
		int precio,max=0,min=0;

		/*Scanner teclado = new Scanner(System.in);

		System.out.println("introduce cantidad de coches");
		N = teclado.nextInt();

		for (i = 0; i < N; i++) {
			System.out.println("precio del coche");
			precio = teclado.nextInt();

			if(i==0){//primera vez que entra el bucle
				max=precio;
				min=precio;
			}
			
			if (precio>max) {
				max= precio;
				System.out.println(" " + precio);
			} 
			
			if (precio < min) {
				min = precio;
				System.out.println(" " + precio);

			}
		 */
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce cantidad de coches");
		N = teclado.nextInt();
		
		System.out.println("1er precio del coche");
		precio = teclado.nextInt();
		max= precio;
		min = precio;
		System.out.println("max " + max);
		System.out.println("min " + min);
		
		for (i = 1; i < N; i++) {
			System.out.println("Estamos en la iteracion i: "+i);
			System.out.println("precio del coche");
			precio = teclado.nextInt();

			if (precio>max) {
				max= precio;
				System.out.println("precio max coches " + precio);
			} 
			
			if (precio < min) {
				min = precio;
				System.out.println("precio min coches " + precio);

			}
			System.out.println("max " + max);
			System.out.println("min " + min);
			
		}
		System.out.println("El max " + max);
		System.out.println("El min " + min);

	}

}
