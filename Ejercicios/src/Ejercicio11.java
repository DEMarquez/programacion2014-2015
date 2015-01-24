import java.util.*;

public class Ejercicio11 {
	public static void main(String args[]){
		/**hacer una ecuacion de 1 grado*/
		
		float c1;//introducimos la primera incognita
		float c2;//introducimos la segunda incognita
		float x;//valor de X
		
		System.out.println("introduce incognita1");//introducir campo incognita1
		Scanner teclado=new Scanner(System.in);
		c1=teclado.nextFloat();
		
		System.out.println("introduce incognita2");//introducir campo incognita2
		c2=teclado.nextFloat();
		
		x=-c2/c1;//ecuacion
		
		System.out.println("el resultado es :" +x);//se mostrara el resultado de x
		
	}

}
