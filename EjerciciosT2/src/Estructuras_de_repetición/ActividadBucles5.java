package Estructuras_de_repetición;
import java.util.*;
public class ActividadBucles5 {
	public static void main(String argn[]) {
		
		int N;
		int i=0;
		double media;
		int suma = 0;
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce edad del asistente ");
		N = teclado.nextInt();
		
		while (N  > 0){//(!)->se puede utilizar para declarar una variable distinto de 
			
			suma=suma+N;
			i++;//contador +1
			
			System.out.println("introduce edad del asistente "); 
			N= teclado.nextInt();
			
		}
		media = suma/(double)i;//media con decimales (haciendo un casting a double)
		System.out.println("la media de los asistentes es: " +media);
		
	}

}
