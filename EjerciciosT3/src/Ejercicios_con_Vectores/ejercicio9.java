package Ejercicios_con_Vectores;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String args[]) {

		String pais[];

		Scanner teclado = new Scanner(System.in);

		pais = new String[5];
		
		for(int i = 0; i < 5; i++){
			
			System.out.println("introduce pais");
			pais[i]=teclado.next();
			
		}//inicio de vector
		//ordenar vector de menor a mayor
		for(int i= 0; i < 5; i++){
			
			for(int j=0;j<4/**j<4-i*/;j++){
				if(pais[j].compareTo/**se gasta para comparar cadenas(String)*/(pais[j+1])>0){//si no estan de menor a mayor
					String aux=pais[j];
					pais[j]=pais[j+1];
					pais[j+1]=aux;
					
				}
			}
		}//fin ord
		
		for(int i = 0; i < 5; i++){
			System.out.println(pais[i]);
		}

	}

}
