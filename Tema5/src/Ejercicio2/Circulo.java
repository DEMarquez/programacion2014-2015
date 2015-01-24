package Ejercicio2;

public class Circulo {
	
	//Atributos
	
	public double radio;
	
	//Metodos
	
	public void asignaRadio(double valor){
		radio=valor;
		
	}
	public double daRadio(){
		return radio;
		
	}
	public double longitud(){
		double longitud =(2*3.14*radio);
		return (longitud);
		
	}
	public double area(){
		double area= 3.14*radio*radio;
		return (area);
		
	}
	public boolean mayorQue(Circulo otroCirculo){
		boolean mayor=false;
		if(this.area()> otroCirculo.area()){
			mayor=true;
		}
		return(mayor);
	}
	

}


