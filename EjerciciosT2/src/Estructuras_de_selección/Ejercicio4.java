package Estructuras_de_selecci�n;
import java.util.*;
public class Ejercicio4 {
	public static void main (String args[]){
		
		char c;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca caracter");
		c=teclado.next().charAt(0);
		
		if((c>='a' && c<='z')|| (c>='A' && c<='Z')){
			System.out.println("Caracter alfabetico");
		}else if (c>='0' && c<='9'){
			System.out.println("Caracter num�rico");
		}else if (c==',' || c=='.' || c==':'){
			System.out.println("Caracter puntuaci�n");
		}else{
			System.out.println("El caracteres desconocido");
		}
		
	}

}
