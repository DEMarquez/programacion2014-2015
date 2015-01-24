import java.util.*;

public class Ejercicio9 {
	public static void main(String args[]){
		
		String nombre;//introducir nombre
		String dirección;//introducir dirección
		int telefono;//introducir telefono
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("introduce nombre: ");//introducir campo nombre
		nombre=teclado.nextLine();
		
		System.out.println("introduce dirección: ");//introducir campo dirreccion
		dirección=teclado.nextLine();
		
		System.out.println("introduce telefono: ");//introducir campo telefono
		telefono=teclado.nextInt();
		
		System.out.println("El valor nombre es: " + nombre);//mostrar nombre
		
		System.out.println("El valor dirección es: " + dirección);//mostrar direccion
		
		System.out.println("El valor telefono es: " + telefono);//mostrar telefono
		
	}

}
