import java.util.*;

public class Ejercicio12 {
	public static void main(String args[]){
		/**hacer una calculadora*/
		
		int x;
		int y;
		double Raiz;//valor de raiz
		double Potencia;//valor potencia
		
		System.out.println("introduce 1º digito: ");//introducir campo numero1
		Scanner teclado=new Scanner(System.in);
		x=teclado.nextInt();
		
		System.out.println("introduce 2º digito: ");//introducir campo numero2
		y=teclado.nextInt();
	
		Raiz=Math.sqrt(x);//raiz cuadrada;
		
		Potencia=Math.pow(y, 2);//potencia
		
		System.out.println("El resultado de la raiz  es: "+Raiz);//mostrar raiz cuadrada
		
		System.out.println("El resultado de la potencia  es: "+Potencia);//mostrar potencia
		
		System.out.println(" El resultado de la suma es: " + (x+y));
		System.out.println(" El resultado de la resta es: " + (x-y));
		System.out.println(" El resultado de la multiplicación es: " + (x*y));
		System.out.println(" El resultado de la división es: " + (x/y));
		System.out.println(" El resultado del resto es: " + (x%y));
		
		
	}

}
