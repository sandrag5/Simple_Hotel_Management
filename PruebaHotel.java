import java.util.ArrayList;

/**
 * Clase de prueba del sistema.
 * 
 * @author Nuria Rodríguez Jiménez y Sandra García-Siñeriz Herrador.
 * @version 1.0
 */
public class PruebaHotel {

	/**
	 * Metodo principal
	 * 
	 * @param args Argumentos de la linea de comandos.
	 */
	public static void main(String[] args) {
		Hotel hotel;
		MenuHotel menu;
		boolean salir;

		salir = false;
		if (args.length != 1) {
			System.out.println("\tSintaxis del programa:");
			System.out.println("\tjava PruebaHotel nombreHotel");
		} else {
			hotel = new Hotel("Alojamiento Rural", " 'El Descanso'");
			
			// Metodos para añadir informacion al Hotel.
			/**
			 * Método que invoca a las habitaciones del hotel.
			 */
			crearHabitaciones(hotel);
			/**
			 * Método que invoca a las reservas del hotel.
			 */
			crearReservas();
			/**
			 * Método que invoca a los bloqueos del hotel.
			 */
			crearBloqueos();
			
			//Se ejecuta la aplicacion.
			menu = new MenuHotel(hotel);
			while (!salir) {
				salir = menu.menuPrincipal();
			}
		}
	}
	
	/**
	 * Se crea y añade al Hotel una lista de habitaciones:
	 * 
	 * @param hotel
	 */
	private static void crearHabitaciones(Hotel hotel) {
		hotel.anyadirHabitacion(new Habitacion(1,"suite",90));
		hotel.anyadirHabitacion(new Habitacion(2, "doble",45));
		hotel.anyadirHabitacion(new Habitacion(3, "doble",50));
		hotel.anyadirHabitacion(new Habitacion(4, "suite",85));
		hotel.anyadirHabitacion(new Habitacion(5, "suite", 80));
		hotel.anyadirHabitacion(new Habitacion(6, "doble", 45));
		hotel.anyadirHabitacion(new Habitacion(7, "suite", 90));
		hotel.anyadirHabitacion(new Habitacion(8, "doble", 55));
		hotel.anyadirHabitacion(new Habitacion(9, "suite", 85));
		hotel.anyadirHabitacion(new Habitacion(10, "doble", 50));
	}

	/**
	 * Se crea y añade al Hotel una lista de reservas:
	 */
	private static void crearReservas() {
		ArrayList<Reserva> listaReservas = new ArrayList<Reserva>(){
			{
				add(new Reserva(new Fecha(5,9,2013),new Fecha(10,9,2013), new String("Javier"),new Fecha(20,8,2013),65));
				add(new Reserva(new Fecha(15,9,2013),new Fecha(18,9,2013), new String("Elena"),new Fecha(4,9,2013),50));
				add(new Reserva(new Fecha(21,9,2013),new Fecha(28,9,2013), new String("Rocío"),new Fecha(15,9,2013),49));
				add(new Reserva(new Fecha(29,9,2013),new Fecha(30,9,2013), new String("Héctor"),new Fecha(25,9,2013),75));
				add(new Reserva(new Fecha(3,10,2013),new Fecha(6,10,2013), new String("Jorge"),new Fecha(1,10,2013),85)); 
				add(new Reserva(new Fecha(9,10,2013),new Fecha(15,10,2013), new String("Cristian"),new Fecha(3,10,2013),56));
				add(new Reserva(new Fecha(21,11,2013),new Fecha(26,11,2013), new String("Carlos"),new Fecha(20,11,2013),50));
				add(new Reserva(new Fecha(27,11,2013),new Fecha(31,12,2013), new String("Sergio"),new Fecha(22,11,2013),54));
				add(new Reserva(new Fecha(1,12,2013),new Fecha(5,12,2013), new String("Jose"),new Fecha(29,11,2013),60));
				add(new Reserva(new Fecha(7,12,2013),new Fecha(13,12,2013), new String("Miguel"),new Fecha(5,12,2013),52));
			}
		};		
	}
	
	/**
	 * Se crea y añade al Hotel una lista de bloqueos:
	 */
	private static void crearBloqueos() {
		ArrayList<Bloqueo> listaBloqueos = new ArrayList<Bloqueo>(){
			{
				add(new Bloqueo(new Fecha(5,9,2013),new Fecha(11,9,2013), new String("Charo"),new Fecha(21,8,2013),90));
				add(new Bloqueo(new Fecha(16,9,2013),new Fecha(19,9,2013), new String("Lidia"),new Fecha(5,9,2013),85));
				add(new Bloqueo(new Fecha(22,11,2013),new Fecha(30,11,2013), new String("Sara"),new Fecha(20,11,2013),80));
				add(new Bloqueo(new Fecha(23,12,2013),new Fecha(28,12,2013), new String("Javier"),new Fecha(20,12,2013),90));
				add(new Bloqueo(new Fecha(12,12,2013),new Fecha(19,12,2013), new String("Javier"),new Fecha(10,12,2013),85));
			}
		};

	}

	
}