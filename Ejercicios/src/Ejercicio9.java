import java.util.*;

public class Ejercicio9 {
	public static void main(String args[]){
		
		String nombre;//introducir nombre
		String direcci�n;//introducir direcci�n
		int telefono;//introducir telefono
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("introduce nombre: ");//introducir campo nombre
		nombre=teclado.nextLine();
		
		System.out.println("introduce direcci�n: ");//introducir campo dirreccion
		direcci�n=teclado.nextLine();
		
		System.out.println("introduce telefono: ");//introducir campo telefono
		telefono=teclado.nextInt();
		
		System.out.println("El valor nombre es: " + nombre);//mostrar nombre
		
		System.out.println("El valor direcci�n es: " + direcci�n);//mostrar direccion
		
		System.out.println("El valor telefono es: " + telefono);//mostrar telefono
		
	}

}
