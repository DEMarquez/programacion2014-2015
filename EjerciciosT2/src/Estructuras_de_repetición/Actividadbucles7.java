package Estructuras_de_repetición;
import java.util.*;
public class Actividadbucles7 {
	public static void main(String argn[]) {
		
		int num;
		int contador = 0;
	
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce numero ");
		num = teclado.nextInt();
		
		while (num > 0){
			/** num=num sirve para guardar las cantidades obtenidas y despues actualizarlas con contador++ */
			num=num/10;
			contador++;
			
		}
		System.out.println("el numero tiene " + contador + " digitos" );
		
	}

}
