package Vectores_Multivaluados;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		int filas = 2;
		int columnas = 4;
		int enteros[][]=  new int[filas][columnas];  
		int nuevoEnteros[][] = new int[4][2];
		
		// inicializar la matriz de enteros
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						System.out.println("introduzca numero");
						int num = teclado.nextInt();
						enteros[i][j] = num ;
						}
					}	
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				nuevoEnteros[j][i]=enteros[i][j];
				
			}
		}
		
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				System.out.print(nuevoEnteros[i][j]);
				
			}
			System.out.println();
		}
	
	}
}
