import java.util.*;

public class Ejercicio15 {
	
	public static void main(String args[]){
		
		float L1;//lado 1 
		float L2;//lado 2
		float L3;//lado 3
		double SP;//sumatorio
		double area;
		
		System.out.println("introduce L1: ");//introducir campo numero1
		Scanner teclado=new Scanner(System.in);
		L1=teclado.nextFloat();
		
		System.out.println("introduce L2: ");//introducir campo numero2
		L2=teclado.nextFloat();
		
		System.out.println("introduce L3: ");//introducir campo numero3
		L3=teclado.nextFloat();
		
		SP=(L1+L2+L3)/2;/**operacion lados de un triangulo*/
		area=Math.sqrt(SP*(SP-L1)*(SP-L2)*(SP-L3));//raiz cuadrada operacion lados de un triangulo
		
		System.out.println("El area es: " +area);//lado area
			
		
	}
}
