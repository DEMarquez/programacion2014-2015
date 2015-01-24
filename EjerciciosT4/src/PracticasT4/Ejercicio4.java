package PracticasT4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		Scanner in = null;
		PrintWriter out = null;
		// TRY
		try {

			System.out.println("escribe palabras");
			out = new PrintWriter("Ejercicio4.txt");

			in = new Scanner(System.in);

			System.out.println("Escribe 5 palabras");
			for (int i = 0; i < 5; i++) {
				int palabra = teclado.nextInt();
				out.print(palabra + " ");

			}
			while (in.hasNext())
				;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
