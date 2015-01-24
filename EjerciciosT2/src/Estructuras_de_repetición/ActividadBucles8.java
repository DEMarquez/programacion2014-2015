package Estructuras_de_repetición;
import java.util.*;

public class ActividadBucles8 {
	public static void main(String argn[]) {
		
		char letra;
		char mayus;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce caracter");
	letra = teclado.next().charAt(0);
	
	
	while (letra >= 'a' && letra <= 'z'){//comparamos
		
		mayus=(char)('A'+(letra - 'a'));
		System.out.println("letra mayuscula " +mayus);

		System.out.println("introduce caracter ");
		letra = teclado.next().charAt(0);
			
		
		}
	
	}
}
