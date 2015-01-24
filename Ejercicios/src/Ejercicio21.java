import java.util.*;
public class Ejercicio21 {
	public static void main(String args[]){
		
	int n;
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introduzca valor al azar: ");
	n=teclado.nextInt();
	
	/**sacar numero par*/
	//calculo para sacar numero par
	
	boolean r=n%2==0;
	
	System.out.println("El valor introducido es Par: " +r);
	
	/**sacar numero impar*/

	boolean r2=n%2==1;//calculo para sacar numero impar
	
	System.out.println("El valor introducido es Impar: " +r2);
	
	
	}
}
