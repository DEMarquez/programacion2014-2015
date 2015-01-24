package repaso_examen;
import java.util.*;

public class ejercicio2 {
	public static void main(String args[]){
		
		int max=0;
		int max_repe=0;
		int vector[];
		
		Scanner teclado=new Scanner(System.in);
		
		vector=new int[10];
		
		for(int i=0;i<10;i++){
		System.out.println("introduce numeros");
		vector[i]=teclado.nextInt();
		
		/**buscar el maximo*/
			if(vector[i]>=max){
				max=vector[i];
			}
		
		}
		/**buscar si esta repetido el maximo*/
		for(int j=0;j<10;j++){
			if(vector[j]==max){
				max_repe++;
			}
		}
		System.out.println("el numero mas grande es el "+max+ " esta repetido " +max_repe+ " veces");
	}

}
