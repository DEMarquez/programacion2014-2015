import java.util.*;
public class Ejercicio18 {
	public static void main(String args[]){
		/**HACER UNA ECUACION DE 2º GRADO*/
		float a,b,c,f;
		double x;//operacion dentro de la raiz
		double incognita,incognita2;//valor incognita1 y 2 
		double raiz;//valor realizar raiz
		
		/** A= (X*X); B= X; C= N Entero*/
		
		Scanner teclado=new Scanner(System.in );
		
		System.out.println("introduce valor A: ");//introducir campo Radio
		a=teclado.nextFloat();
		
		System.out.println("introduce valor B: ");//introducir campo Radio
		b=teclado.nextFloat();
		
		System.out.println("introduce valor C: ");//introducir campo Radio
		c=teclado.nextFloat();
		
		x=Math.pow/**Math.pow eleva b^2*/(b,2)-(4*a*c);//operacion dentro de la raiz
		f=(2*a);//operacion debajo de la raiz = division
		raiz=Math.sqrt/**Math.sqrt hace la raiz de la cantidad x*/(x);//raiz
		incognita=(b+raiz)/f;//primer resultado
		incognita2=(b-raiz)/f;//segundo resultado
		
		System.out.println("La primera incognita da: " +incognita);//mostrar primera incognita
		System.out.println("La segunda incognita da: " +incognita2);//mostrar segunda incognita
		
		
	}

}
