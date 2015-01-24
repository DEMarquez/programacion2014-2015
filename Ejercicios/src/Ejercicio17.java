import java.util.*;
public class Ejercicio17 {
	public static void main(String args[]){
		
		int Semanas,Horas,Dias,Hrest,Horas2;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("introduce las horas: ");//introducir campo Horas
		Horas=teclado.nextInt();
	
		Semanas=(Horas/(24*7));
		Horas2=(Horas%(24*7));
		Dias=(Horas2/24);
		Hrest=(Horas2%24);
		
		System.out.println("Semanas: " +Semanas);//mostrar semanas
		System.out.println("dias: " +Dias);//mostrar dias
		System.out.println("horas: " +Hrest);//mostrar horas
		
		
	}

}
