package repaso_examen;
import java.util.*;

public class ejercicio3 {
	public static void main(String args[]){
		
		int mes;
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("introduce numero de mes");
		mes=teclado.nextInt();
		
		
		while(mes != 0 && mes!=13){
			
			System.out.println("introduce numero de mes");
			mes=teclado.nextInt();
		
			
			if(mes!=0 && mes!=13){
				System.out.println("el mes introducido es incorrecto");
			
			}else if(mes>=1 && mes<=12){
				System.out.println("el mes introducido es correcto");
				
			}
			
	}
	}

}
