package PracticasT4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio2 {
	public static void main(String args[]){
		
		Scanner in=null;
		//TRY
				try {
					in = new Scanner (new FileReader("Ejercicio2.txt"));
				
				do{
					
					System.out.println(in.next().toLowerCase()+"");
					
					in.useDelimiter(",");
					
				}while(in.hasNext());
				
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