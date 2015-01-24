package Estructuras_de_selección;
import java.util.*;

public class Ejercicio2 {
	public static void main(String args[]) {

		int a;// lado
		int b;// lado
		int c;// lado
		int cal;// calculo de lados/2

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce lado a: ");
		a = teclado.nextInt();

		System.out.println("Introduce lado b: ");
		b = teclado.nextInt();

		System.out.println("Introduce lado c: ");
		c = teclado.nextInt();

		if (a == b && a == c && b == c) {
			System.out.println("EQUÍLATERO");// todos los lados son iguales
		} else if (a != b && a != c && b != c) {
			System.out.println("ESCALENO");// ninguno de los lados es igual
		} else {
			System.out.println("ISOSCELES"); // dos lados son iguales
		}//fin if

		cal = (a + b + c) / 2;

		System.out.println("El area del triangulo da: " + cal);

	}//fin main

}//fin class
