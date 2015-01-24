package Estructuras_de_repetición;
import java.util.*;

public class Actividadbucles3 {
	public static void main(String argn[]) {

		int N = 15;
		int suma = 0;
		int num;
		int i;

		Scanner teclado = new Scanner(System.in);

		/*
		 * int i = 0;
		 * while (i<N){ 
		 * System.out.println("introduce un numero");
		 * num = teclado.nextInt(); 
		 * suma = suma + num; i++; }
		 */

		for (i = 0; i < N; i++){

		System.out.println("introduce un numero");
		num = teclado.nextInt();
		
		suma = suma + num;
		
		}
		
		System.out.println("la suma de valores da: " + suma);
	}
}
