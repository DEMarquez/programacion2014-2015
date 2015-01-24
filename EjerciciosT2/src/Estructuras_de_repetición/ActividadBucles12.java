package Estructuras_de_repetición;
import java.util.*;
public class ActividadBucles12 {
	public static void main(String argn[]) {

		int N;
		int negativo = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce nota de alumno ");
		N = teclado.nextInt();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("introduce numeros ");
			N = teclado.nextInt();
			
			if(N<0){
				negativo++;
			}
			
		}
		System.out.println("numeros negativos " + negativo);
	}

}
