package Ejercicio3;

public class TicketMachine {

	// Attributos

	private int price; // el precio del ticket de la maquina
	private int balance; // la cantidad de dinero que ha introducido el
							// usuariohasta el momento
	private int total;// la cantidad total de dinero acumulada por la maquinacon
						// la venta de tickets1

	// Costructor

	/* Crea una maquina que da tickets de un determinado precio */
	public TicketMachine(int ticketCost) {
		price = ticketCost;
	}

	/* Devuelve el precio de un ticket */
	public int getPrice() {
		return price;
	}

	/*
	 * Devuelve la cantidad de dinero que se ha instertado para obtener un
	 * ticket
	 */
	public int getBalance() {
		return balance;
	}

	/*
	 * Recibe una cantidad de dinero en centimos de un cliente y comprueba que
	 * es una cantidad positiva
	 */
	public void insertMoney(int amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}

	/*
	 * Imprime el ticket si se ha insertado la cantidad de dinero su ciente,
	 * reduce la cantidad de dinero del usuario e incrementa el total de dinero
	 * acumulado por la venta de tickets. En el caso de que no se haya insertado
	 * la cantidad suciente, imprime un mensaje por pantalla donde le indica la
	 * cantidad de dinero que le falta.
	 */
	public void printTicket() {
		if(balance>=price){
			//imprimir ticket
			balance=balance-price;
			total=total+price;
			System.out.println("Se ha imprimido el ticket");
			System.out.println("cantidad a devolver: " +balance);
			
		}else{
			//no se puede imprimir el ticket
			System.out.println("No se puede imprimir el Ticket");
			int cantidadFalta=price-balance;
			System.out.println("la cantidad que le falta es: " +cantidadFalta);
		}
	}

	/* Devuelve el dinero correspondiente al usuario */
	public int refundBalance() {
		return balance;
	}
}
