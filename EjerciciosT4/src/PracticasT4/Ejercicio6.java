package PracticasT4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner in=null;
		PrintWriter out = null;
		try {
			
			
			in = new Scanner (new FileReader("preciosSinIVA.txt"));
			out = new PrintWriter("preciosConIVA.txt");
			
			do{
				
			in.print(in*0.25"");
				System.out.println(in.next().toLowerCase()+"");
				out.print(in+"-");
				
			}while(out.hasNext());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in!=null){
				in.close();
			}
		}
	}
}

