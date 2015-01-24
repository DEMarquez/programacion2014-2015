import java.util.*;
public class Ejercicio16 {
	public static void main(String args[]){
		
		int Radio;
		double Area,Volumen;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("introduce el Radio: ");//introducir campo Radio
		Radio=teclado.nextInt();
		
		Area=4*Math.PI*Math.pow(Radio,2);//calcular area
		
		Volumen=(4*Math.PI*Math.pow(Radio,3))/3;//calcular volumen
		
		System.out.println("El Area de la esfera es : " +Area);//mostrar Area
		
		System.out.println("El Volumen de la esfera es : " +Volumen);//mostrar Volumen
		
	}

}
