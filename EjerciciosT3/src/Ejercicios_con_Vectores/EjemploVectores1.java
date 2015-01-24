package Ejercicios_con_Vectores;

import java.util.Scanner;

public class EjemploVectores1 {
	public static void main(String args[]) {
		
		int sueldo;
		int turno;
		int suma1=0,suma2=0;
		int primer_turno[],segundo_turno[];
		int trabajadores1=0,trabajadores2=0;
		
		Scanner teclado = new Scanner(System.in);
		
		primer_turno = new int[4];
		segundo_turno = new int[4];
		
		for(int i=0;i<8;i++){
			
			System.out.println("introduce el turno ");
			System.out.println("1 = turno mañana | 2 = turno tarde ");
			System.out.println(".............");
			turno = teclado.nextInt();
			
			System.out.println("introduce sueldo");
			sueldo = teclado.nextInt();
			
			if (turno == 1){
				primer_turno[trabajadores1]=sueldo;
				trabajadores1++;
			}if (turno == 2){
				segundo_turno[trabajadores2]=sueldo;
				trabajadores2++;
			}
			
			
		}
		
		for(int i=0;i<4;i++){
			suma1=suma1+primer_turno[i];
			suma2=suma2+segundo_turno[i];
		}
		System.out.println("sueldo 1º turno " +suma1);
		System.out.println("sueldo 2º turno " +suma2);
		
	}
	

}
