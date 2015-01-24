package Ejercicios_con_Vectores;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String args[]) {
		
		int vector[];
		
		
		Scanner teclado = new Scanner(System.in);

		vector = new int[10];
		
		for(int i = 0; i < 10; i++){
			
			System.out.println("introduce datos");
			vector[i]=teclado.nextInt();
			/**pedimos datos al usuario*/
		}
		for(int i = 0; i < 10; i++){
			System.out.println("El componente i : "+ i+ " contiene: "+vector[i]);
			for(int j = 1; j < vector[i]; j++){//
				System.out.print(j);
			}
		}
		
		
	}
	

}
