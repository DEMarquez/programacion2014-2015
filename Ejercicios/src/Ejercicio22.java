import java.util.*;
public class Ejercicio22 {
	public static void main(String args[]){
	
		int min,tviaje,tllegada,llegada;
		int salida1,salida2,salida3,salida4;//comandos para operaciones salida
		int llegada1,llegada2,llegada3,llegada4;//comandos para las operaciones llegada
		int salidamin,llegadamin;//trasformar salida y llegada en minutos
		int duracion, nduracion;//trasformar salida y llegada en minutos
		int nllegada,nllegada2,nllegada3;//comandos para las operaciones sacar llegada
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introducir tiempo de viaje: ");
		tviaje=teclado.nextInt();
		
		System.out.println("Introducir tiempo de llegada: ");
		tllegada=teclado.nextInt();
		
		/**salida*/
		salida2=(tviaje/100);
		salida3=(tviaje%100);
		salida4=salida2*60+salida3;
		salidamin=salida4;
		
		/**llegada*/
		llegada2=(tllegada/100);
		llegada3=(tllegada%100);
		llegada4=llegada2*60+llegada3;
		llegadamin=llegada4;
		
		/**calculo para sacar minutos*/
		duracion=salidamin-llegadamin;
		nduracion=duracion*(85/100);
		min=salidamin+nduracion;
		
		/**pasar minutos a formato (100)llegada) minutos/60*100  */
		
		nllegada=min/60;
		nllegada2=min%60;
		nllegada3=nllegada*100+nllegada2;
		llegada=nllegada3;
			
		System.out.println("el tiempo nuevo de llegada es: " +llegada);
		
	}
}
