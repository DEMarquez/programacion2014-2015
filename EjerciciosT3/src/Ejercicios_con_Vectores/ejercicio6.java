package Ejercicios_con_Vectores;

import java.util.*;

public class ejercicio6 {
	public static void main(String args[]) {

		int sueldo_mayor=0,pertenece_a=0;
		int  sueldo[];
		String operario[];

		Scanner teclado = new Scanner(System.in);

		operario = new String[5];
		sueldo = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("introduzca nombre de operario");
			operario[i] = teclado.next();

			System.out.println("introduzca sueldo de operario");
			sueldo[i] = teclado.nextInt();
			
			if(sueldo[i]>=sueldo_mayor){
				sueldo_mayor=sueldo[i];
				pertenece_a=i;
			}//fin if

		}//fin for
		
		System.out.println("operario "+pertenece_a+" sueldo "+sueldo_mayor);

	}

}
