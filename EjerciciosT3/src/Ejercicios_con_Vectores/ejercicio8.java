package Ejercicios_con_Vectores;

import java.util.*;

public class ejercicio8 {
	public static void main(String args[]) {

		int sueldo[];

		Scanner teclado = new Scanner(System.in);

		sueldo = new int[5];
		
		for(int i = 0; i < 5; i++){
			
			System.out.println("introduce sueldos");
			sueldo[i]=teclado.nextInt();
			
		}//inicio de vector
		//ordenar vector de menor a mayor
		for(int i= 0; i < 5; i++){
			
			for(int j=0;j<4/*j<4-i*/;j++){
				if(sueldo[j]>sueldo[j+1]){//si no estan de menor a mayor
					int aux=sueldo[j];
					sueldo[j]=sueldo[j+1];
					sueldo[j+1]=aux;
					
				}
			}
		}//fin ord
		
		for(int i = 0; i < 5; i++){
			System.out.println(sueldo[i]);
		}
		
		

	}

}
