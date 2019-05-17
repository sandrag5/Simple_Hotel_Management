import java.util.ArrayList;

/**
 * Menu del sistema.
 * 
 * @version 1.0
 */
public class MenuHotel {

	/**
	 * Hotel gestionada por el menu.
	 * 
	 * @see Hotel
	 */
	private Hotel _hotel;

	/**
	 * Clase para el manejo de la entrada estandar.
	 * 
	 * @see Teclado
	 */
	private Teclado _teclado;

	/**
	 * Constructor de la entidad
	 * 
	 * @param hotel
	 *            Hotel gestionada por el menu.
	 */
	public MenuHotel(Hotel hotel) {
		_hotel = hotel;
		_teclado = new Teclado();

	}

	/**
	 * Gestion del menu principal del sistema.
	 * 
	 * @return <code>true</code> Se ha ejecutado la opcion de salida.
	 *         <code>false</code> No se ha ejecutado la opcion de salida.
	 */
	public boolean menuPrincipal() {
		String opcion;
		boolean correcta, salir;
		
		String nombreCliente = new String ("Alejandro Rodríguez");
		Fecha fechaInicio = new Fecha (03, 01, 2014);
		Fecha fechaFin = new Fecha (07, 01, 2014);
		Fecha fechaRealizacion = new Fecha (02, 01, 2014);
		
		int importeMax = 650;
		int numDias = 5;
		int precio = 90;
		int coste = numDias*precio;
		
		Fecha fechaBloqueo = new Fecha (02, 01, 2014);
		int numHabitacion = 5;
		
		Reserva reserva = new Reserva (fechaInicio, fechaFin, nombreCliente, fechaRealizacion, coste);
		Bloqueo bloqueo = new Bloqueo (fechaInicio, fechaFin, nombreCliente, fechaRealizacion, numDias);

		salir = false;
		correcta = false;
		opcion = " ";
		mostrarMenuPrincipal();
		while (!correcta) {
			opcion = _teclado.leerLinea();
			if ((opcion.compareTo("1") >= 0) || (opcion.compareTo("6") <= 0)) {
				correcta = true;
			} else {
				System.out.println();
				System.out.println("ERROR: Opcion incorrecta");
				System.out.println();
				mostrarMenuPrincipal();
			}
		}

		switch (opcion.charAt(0)) {
		case '1': //Mostrar reserva en lista de reserva
		
			if (opcionMostrarReservas() == false) {
				System.out.println("No se ha realizado ninguna reserva.");
				salir = true;
			}
			
			while (!salir) {
				salir = listarReservas();
			}
			
			salir = false;
			break;

		case '2': //Disponibilidad
					
			if (opcionMostrarDisponibilidad() == false) {
				System.out.println("No hay ninguna habitación disponible en ese periodo o no ha introducido los datos correctamente. Vuelva a intentarlo.");
				salir = true;
			}
			
			while (!salir) {
				/*salir = listarHabitaciones(habitacionesLibres); */
			}
			
			salir = false;
			break;

		case '3': //Reservar habitación
					
			if (opcionReservarHabitacion(reserva) == false) {
				System.out.println("No se puede realizar la reserva.");
				salir = true;
			}
			
			while (!salir) {
				salir = mostrarHabitacionReservada(reserva);
			}
			
			salir = false;
			break;

		case '4': //Bloquear suite
				
			if (opcionBloquearSuite() == false) {
				System.out.println("No se ha podido realizar el bloqueo.");
				salir = true;
			}
			
			while (!salir) {
				salir = mostrarBloqueoSuite(bloqueo);
			}
			
			salir = false;
			break;		
					

		case '5':
			if (numHabitacion<0 && numHabitacion>10) {
				System.out.println("No existe la habitacion");
				salir = true;
			}
			while (!salir) {
				salir = opcionConfirmarBloqueo(numHabitacion,fechaBloqueo);
			}
			salir = false;
			break;

		case '6':
			salir = true;
		}

		return salir;
	}

	/**
	 * Mostrar reservas del hotel.
	 * 
	 * @return <code> true </code> si se han mostrado todas las reservas del hotel. 
	 * @return <code> false </code> no hay reservas para mostrar.
	 *         
	 */
	private boolean opcionMostrarReservas() {
	
		boolean correcto = false;
			/*if (Reservas.obtenerNumReservas() != 0){////////////////////////////////FALLO
				//Llamar método recorrerlistareservas
				correcto = true; 
			} 
			else 
			{
				correcto = false;
			}*/
							
		return correcto;
	}
	
	/**
	 * Mostrar Disponibilidad.
	 * 
	 * @return <code> true </code> si se ha mostrado lista de habitaciones libres del hotel.
	 * @return <code> false </code> no se ha mostrado toda la lista de habitaciones.
	 *         
	 */
	private boolean opcionMostrarDisponibilidad() {  
	
		boolean correcto = false;
			/*if (Hotel.listaHabitacionesLibresVacio() == false){
				for(int i =0; i < Hotel.listarHabitacionesLibres(); i++){
		    		for(int j =0; j< Hotel.listarHabitacionesLibres(); j++){ 
		        		System.out.println(Hotel.listarHabitacionesLibres());
		    		}
				}
				correcto = true; //Recorre el array de habitaciones libres del hotel creado en la clase Habitaciones.java
			} 
			else 
			{
				correcto = false;
			}*/
							
		return correcto; 
	}
	
	/**
	 * Reservar habitación.
	 * 
	 * @param reserva
	 * 
	 * @return <code> true </code> si se ha reservado la habitación.
	 * @return <code> false </code> la habitación ya está reservada.
	 *         
	 */
	private boolean opcionReservarHabitacion(Reserva reserva) {
		
		boolean correcto = false;
			/*if (Hotel.anyadirReserva(reserva) == true) {
				correcto = true; //Se añade reserva a la lista de reservas
			}
			else
			{
				correcto = false;
			}*/
		
		return correcto; 
	}
	
	/**
	 * Bloquear suite.
	 * 
	 * @return <code> true </code> si se ha bloqueado la suite.
	 * @return <code> false </code> No está disponible.
	 *         
	 */
	private boolean opcionBloquearSuite() {
	
		boolean correcto = false;
		/*	if (Hotel.anyadirBloqueo(bloqueo) == true) {
				correcto = true; //Se añade bloqueo a la lista de bloqueos
			}
			else
			{
				correcto = false;
			}*/
		
		return correcto; 
	}	
	
	/**
	 * Confirmar Bloqueo del hotel.
	 * 
	 * @param Número de habitación
	 * 
	 * @param Fecha de bloqueo
	 * 
	 * @return <code>true</code> Se ha confirmado el bloqueo.
	 *         <code>false</code> No se ha ejecutado la opcion de salida.
	 */
	private boolean opcionConfirmarBloqueo(int numHabitacion, Fecha fechaBloqueo) {
		
		
		boolean correcto = false;
			/*if (Hotel.confirmarBloqueo(bloqueo) == true) 
			{
				correcto = true; //El bloqueo pasa a reserva.
			}
			else
			{
				correcto = false;
			}*/
		
		return correcto; 
	}
	
	/**
	 * listar habitaciones libres
	 * 
	 * @param Habitaciones
	 * 
	 * @return <code> true </code> si se han listados las habitaciones
	 * @return <code> false </code> No hay habitaciones libres.
	 */
	private boolean listarHabitaciones(Habitaciones habitaciones) {
		/*Habitaciones.get_listaHabitaciones();*/
		return true;
	}
	
	/**
	 * listar reservas
	 * 
	 * @param reserva
	 * 
	 * @return <code> true </code> si se han listados las reservas
	 * @return <code> false </code> no hay reservas realizadas
	 */
	private boolean listarReservas() {
		/*return _reservas.mostrarListaReservas();*/
		return true;
	}
	
	/**
	 * Mostrar habitación reservada.
	 * 
	 * @param reserva
	 * 
	 * @return <code> true </code> si se ha mostrado la habitación.
	 * @return <code> false </code> no hay ninguna habitación reservada.
	 *         
	 */
	private boolean mostrarHabitacionReservada(Reserva reserva) {
	
		boolean correcto = false;
		/*if (System.out.println(Habitaciones.get_listaHabitaciones())) {
			correcto = true;
		}
		else
		{
			correcto = false;
		}*/
		
		return correcto; 
	}
	
	/* 
	void mostrarReserva() {
    System.out.println("Reserva: " + _numHabitacion + _tipo + _precio);
    Reservas.obtenerListaReservas();
  }

}
	 */
	
	/**
	 * Mostrar bloqueo suite.
	 * 
	 * @param bloqueo
	 * 
	 * @return <code> true </code> si se ha mostrado el bloqueo de suite.
	 * @return <code> false </code> no se ha mostrado el bloqueo.
	 *         
	 */
	private boolean mostrarBloqueoSuite(Bloqueo bloqueo) {
	
		boolean correcto = false;
		/*if (System.out.println(Bloqueos.get_listaBloqueos(bloqueo))) {
			correcto = true;
		}
		else
		{
			correcto = false;
		}*/
		
		return correcto; 
	}
	
	/*
	 void mostrarBloqueo() {
    System.out.println("Bloqueo: " + _numHabitacion + _tipo + _precio);
    Bloqueos.obtenerListaBloqueos();
  }
	 */

	/**
	 * Muestra por la salida estandar el menu principal del sistema.
	 */
	private void mostrarMenuPrincipal() {
		System.out.println();
		System.out.println("Hotel " + _hotel.get_nombre());
		System.out.println("1 - Mostrar reservas.");
		System.out.println("2 - Mostrar disponibilidad.");
		System.out.println("3 - Reservar habitaci\u00f3\n.");
		System.out.println("4 - Bloquear suite.");
		System.out.println("5 - Confirmar bloqueo.");
		System.out.println("6 - Salir");
		System.out.println();
		System.out.println("Seleccione una opcion...");
	}
	
}
