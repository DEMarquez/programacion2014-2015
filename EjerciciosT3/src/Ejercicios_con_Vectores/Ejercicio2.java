package Ejercicios_con_Vectores;

import java.util.*;

public class Ejercicio2 {
	public static void main(String args[]) {

		int vect1[], vect2[];
		int suma_vect[];

		Scanner teclado = new Scanner(System.in);

		vect1 = new int[4];
		vect2 = new int[4];
		suma_vect = new int[4];
		System.out.println("acontinuacion se sumara los valores de los vectores");
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("introduce valores a sumar del vector 1");
			vect1[i]=teclado.nextInt();
			
			System.out.println("introduce valores a sumar del vector 2");
			vect2[i]=teclado.nextInt();
		}
			for (int i = 0; i < 4; i++) {
				
			suma_vect[i]=vect1[i]+vect2[i];
			System.out.println("resultado de cada suma de los vectores: "
					+ suma_vect[i]);
			}
			
		}
		
	}


