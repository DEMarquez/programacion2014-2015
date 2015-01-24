package Estructuras_de_repetición2;
import java.util.*;
public class Ejemplo_bucles_anidados2 {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num_de_familias,edad_cada_hijo,num_de_hijos;
		int num_max,num_min,num_promedio;
		int edad_max,edad_min,promedio_edad;
		int suma_hijos=0;
		
		System.out.println("numero de familias: ");
		num_de_familias = teclado.nextInt();
		
		
		for (int i=0; i<num_de_familias; i++){
		
			System.out.println("numero de hijos: ");//numero de hijos  en cada familia
			num_de_hijos = teclado.nextInt();
			suma_hijos=suma_hijos+num_de_hijos;
			
			for (int j=0;j<num_de_hijos; j++){
		
				System.out.println("edad de cada hijo: ");//edad de los hijos que tiene cada familia
				edad_cada_hijo = teclado.nextInt();
				
				
			}
		}
	}
}
