package Estructuras_de_selecci�n;
import java.util.*;
public class Ejercicio6 {
	public static void main(String args[]){
		
		int e1,e2,e3,e4;//edades
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce la edad de la 1� persona");
		e1=teclado.nextInt();
		
		System.out.println("introduce la edad de la 2� persona");
		e2=teclado.nextInt();
		
		System.out.println("introduce la edad de la 3� persona");
		e3=teclado.nextInt();
		
		System.out.println("introduce la edad de la 4� persona");
		e4=teclado.nextInt();
		
		if(e1<=e2 && e1<=e3 && e1<=e4){
			System.out.println("El mas peque�o es la 1� persona");
		}else if(e2<=e1 && e2<=e3 && e2<=e4){
			System.out.println("El mas peque�o es la 2� persona");
		}else if(e3<=e1 && e3<=e2 && e3<=e4){
			System.out.println("El mas peque�o es la 3� persona");
		}else if(e4<=e1 && e4<=e2 && e4<=e3){
			System.out.println("El mas peque�o es la 4� persona");
		}
	}

}
