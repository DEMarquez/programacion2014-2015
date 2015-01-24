import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String args[]){
		/** decraracion */
		float C;
		float F;
		
		/**inicializar*/
		/** operaciones*/
		
		/**mostrar por pantalla*/
		System.out.println("introduce ºf");
		Scanner teclado =new Scanner (System.in);
		F=teclado.nextFloat();
		
		C=(F-32)/1.8F;//operacion pasar grados farengeit a grados celsius
		System.out.println("la conversion es :" +C);		
	}

}
