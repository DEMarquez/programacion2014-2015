import java.util.*;
public class Ejercicio20 {
	public static void main(String args[]){
		
		long a�os,a�o,minutos,segundos;
		long diaseg,diaseg2;//minutos en un dia
		long diamin;//segundos en un dia 
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el campo A�os");
		a�os=teclado.nextLong();//introducir a�os
		
		a�o=(365*a�os);//calculo dias que tienen X a�os
		
		/**calculo (diasX por Minutosdia) y (diasX por Segundosdia) */
		diaseg=(60*60);//60 segundos por 60 minutos
		diaseg2=(diaseg*24);//cantidad de seg en una hora por 24 horas
		diamin=(60*24);//una hora por 24
		
		minutos=(a�o*diamin);//calculo minutos que tienen X a�os
		segundos=(a�o*diaseg2);//calculo segundos que tienen X a�os
		
		System.out.println("Minutos trascurridos: " +minutos);
		System.out.println("Segundos trascurridos: " +segundos);
		
	}

}
