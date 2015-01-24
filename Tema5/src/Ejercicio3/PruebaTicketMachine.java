package Ejercicio3;

import java.util.Scanner;

public class PruebaTicketMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precioTicket=10;
		
		TicketMachine mimaquina = new TicketMachine(10);
		System.out.println("El precio del ticket es: " +mimaquina.getPrice());
		System.out.println("El balance es: " +mimaquina.getBalance());
		
		System.out.println("Introduce una moneda: ");
		Scanner teclado=new Scanner(System.in);
		int moneda=teclado.nextInt();
		mimaquina.insertMoney(moneda);
		System.out.println("El balance es: " +mimaquina.getBalance());
		
		mimaquina.printTicket();
	}

}
