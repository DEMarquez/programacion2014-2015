package Estructuras_de_repetici�n;
import java.util.Scanner;
public class Ejemplobucle7 {
public static void main (String argn []){
		
		int N;

		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("introduce un valor de 10 a 20");
			N= teclado.nextInt();
			
		}while(N < 10 || N >20 );
		
		System.out.println("este numero esta en el rango de valores " +N);
	}
}
