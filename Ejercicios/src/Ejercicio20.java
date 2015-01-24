import java.util.*;
public class Ejercicio20 {
	public static void main(String args[]){
		
		long años,año,minutos,segundos;
		long diaseg,diaseg2;//minutos en un dia
		long diamin;//segundos en un dia 
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el campo Años");
		años=teclado.nextLong();//introducir años
		
		año=(365*años);//calculo dias que tienen X años
		
		/**calculo (diasX por Minutosdia) y (diasX por Segundosdia) */
		diaseg=(60*60);//60 segundos por 60 minutos
		diaseg2=(diaseg*24);//cantidad de seg en una hora por 24 horas
		diamin=(60*24);//una hora por 24
		
		minutos=(año*diamin);//calculo minutos que tienen X años
		segundos=(año*diaseg2);//calculo segundos que tienen X años
		
		System.out.println("Minutos trascurridos: " +minutos);
		System.out.println("Segundos trascurridos: " +segundos);
		
	}

}
