package repaso_examen;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String args[]){
		int gruposPracticas=14;
		int sesiones=15;
		int numAlumnos;
		int numAlumnosAsist;
		int sesionesBajaAsist=0;
		int sumaAsistencia=0;
		int asistmin=0,sesionMin=0;
		double mediaMax=0;
		int grupoMax;
		
		Scanner teclado=new Scanner(System.in);
		
		/**bucle de los grupos*/
		for(int i=0;i<gruposPracticas;i++){
			
			System.out.println("introduzca los alumnos del grupo " +i);
			numAlumnos=teclado.nextInt();
			sumaAsistencia=0;
			sesionesBajaAsist=0;
			
			/**bucle de las sesiones*/
			for(int j=0;j<sesiones;j++){
				
				System.out.println("introduzca los alumnos que an asistido a la sesion " +i);
				numAlumnosAsist=teclado.nextInt();
				if(j==0){
					asistmin=numAlumnosAsist;
				}
				if(numAlumnosAsist<asistmin){
					asistmin=numAlumnosAsist;
					sesionMin=j;
				}
				
				if(numAlumnosAsist<(numAlumnos/2)){
					sesionesBajaAsist++;	
				}
				
				if(sesionesBajaAsist>=10){
					System.out.println("baja asistencia del grupo " +i);
					j=sesiones;
				}
				
			}
			if(sesionesBajaAsist<10){
				double media=(sumaAsistencia/(double)sesiones);
				if(i==0){
					mediaMax=media;
					grupoMax=i;
				}
				if(media>mediaMax){
					mediaMax=media;
					grupoMax=i;
				}
			System.out.println("asistencia media ");
			System.out.println("asistencia minima en sesion " +(sumaAsistencia/(double)sesiones));
			}
		}
	}

}
