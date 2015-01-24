package PracticasT4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero[]=new int[5];
		Scanner teclado = new Scanner(System.in);
		PrintWriter out = null;
		PrintWriter out2 = null;
		try {
			
			
			out = new PrintWriter("Ejercicio3.txt");
			out2 = new PrintWriter("Ejercicio3b.txt");
			
			System.out.println("Escribe 5 numeros");
			for(int i = 0; i <5; i++){
				 numero[i] = teclado.nextInt();
				out.print(numero+" ");
				out2.print(numero+"-");
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
