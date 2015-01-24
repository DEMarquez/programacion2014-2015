package Estructuras_de_selección;
import java.util.*;
public class Ejercicio6 {
	public static void main(String args[]){
		
		int e1,e2,e3,e4;//edades
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce la edad de la 1º persona");
		e1=teclado.nextInt();
		
		System.out.println("introduce la edad de la 2º persona");
		e2=teclado.nextInt();
		
		System.out.println("introduce la edad de la 3º persona");
		e3=teclado.nextInt();
		
		System.out.println("introduce la edad de la 4º persona");
		e4=teclado.nextInt();
		
		if(e1<=e2 && e1<=e3 && e1<=e4){
			System.out.println("El mas pequeño es la 1º persona");
		}else if(e2<=e1 && e2<=e3 && e2<=e4){
			System.out.println("El mas pequeño es la 2º persona");
		}else if(e3<=e1 && e3<=e2 && e3<=e4){
			System.out.println("El mas pequeño es la 3º persona");
		}else if(e4<=e1 && e4<=e2 && e4<=e3){
			System.out.println("El mas pequeño es la 4º persona");
		}
	}

}
