import java.util.*;
public class Ejercicio19 {
	public static void main(String args[]){
		
		int i=10;
		int n= i++%5;
		
/**numero + doble adicion + resto -> %5*/
		
		System.out.println("El resultado de I es: " +i);
		System.out.println("El resultado de N es: " +n);
		
		int i2=10;
		int n2=++i2%5;
		
/**doble adicion + numero + resto ->%5 */		
		
		System.out.println("El resultado de I2 es: " +i2);
		System.out.println("El resultado de N2 es: " +n2);
		
	}

}
