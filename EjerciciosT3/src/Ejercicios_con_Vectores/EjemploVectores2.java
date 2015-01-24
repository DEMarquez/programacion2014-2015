package Ejercicios_con_Vectores;

import java.util.Scanner;

public class EjemploVectores2 {
	public static void main(String args[]) {

		String nombre[];
		int edad[];

		Scanner teclado = new Scanner(System.in);

		edad = new int[5];
		nombre = new String[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("introduce nombre");
			nombre[i] = teclado.next();
			System.out.println("introduce edad");
			edad[i] = teclado.nextInt();
		}// for1
		System.out.println("acontinuacion se mostrara los ");
		System.out.println("nombres y edades de las personas mayores de 17 años ");
		
		for (int i = 0; i < 5; i++) {
			if (edad[i] >= 18) {
				
				System.out.println("edad: " + edad[i] + " nombre: " + nombre[i]);
				
			}// fin if
		
		}// for2
		
	}// fin main

}// fin
