package Ejercicio1;

public class Complejo {
	
	//Atributos

		double pReal;
		double pImag;
		
		//Metodos
		
		public void asignar(double x, double y){
			pReal=x;
			pImag=y;
		}
		public void sumar(Complejo b){
			pReal=pReal+b.pReal;
			pImag=pImag+b.pImag;
		}
		public void sumar2(double x, double y){
			pReal=pReal+x;
			pImag=pImag+y;
			
		}
		public Complejo sumar3(double x, double y){
			Complejo b=new Complejo();
			pReal=pReal+x;
			pImag=pImag+y;
			return b;
			
		}
		public void imprimir(){
			System.out.println("pReal: " +pReal);
			System.out.println("pImag: " +pImag);
			
		}
	}

