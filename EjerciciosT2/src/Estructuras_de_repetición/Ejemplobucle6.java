package Estructuras_de_repetición;
import java.util.Scanner;
public class Ejemplobucle6 {

	public static void main (String argn []){
		
		int N;
		int suma = 0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce valores a leer");
		N= teclado.nextInt();
		
		while (N  > 0){//mientras que el numero sea distinto a 0
			
			suma = suma + N;
			
			System.out.println("introduce valores a leer ");
			System.out.println("si introduce un numero menor que 0 el proceso se finalizara ");
			N= teclado.nextInt();
			
			System.out.println("la suma de valores da: " + suma);
		
		
		}
	}
}
