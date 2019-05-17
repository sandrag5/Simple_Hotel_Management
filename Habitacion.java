/**
 * Clase que contiene los parámetros de las habitaciones.
 *
 * 
 */
public class Habitacion {
	/**
     * Número de habitación.
     */
    private int _numHabitacion;
    /**
     * Tipo de habitación.
     */
    private String _tipo;
    /**
     * Precio de la habitación.
     */
    private int _precio;
    /**
     * Agregado de las reservas a las habitaciones.
     */
    private Reservas _reservas;
    /**
     * Agregado de los bloqueos a las suites.
     */
    private Bloqueos _bloqueos;
    /**
     * Número máximo de bloqueos.
     */
	private final int NUM_MAX_BLOQUEOS = 100;
	/**
     * Número máximo de reservas.
     */
	private final int NUM_MAX_RESERVAS = 100;
	
	 /**
     * 
     * Devuelve el número de habitación.
     * 
     * @return Número de habitación.
     * 
     */
	public int get_numHabitacion() {
		return _numHabitacion;
	}

	public void set_num_habitacion(int _numHabitacion) {
		this._numHabitacion = _numHabitacion;
	}
	 /**
     * 
     * Devuelve el tipo de habitación.
     * 
     * @return Tipo de habitación.
     * 
     */
	public String get_tipo() {
		return _tipo;
	}

	public void set_tipo(String _tipo) {
		this._tipo = _tipo;
	}
	 /**
     * 
     * Devuelve el precio.
     * 
     * @return Precio.
     * 
     */
	public int get_precio() {
		return _precio;
	}

	public void set_precio(int _precio) {
		this._precio = _precio;
	}
	 /**
     * 
     * Devuelve las reservas de la habitación.
     * 
     * @return Reservas.
     * 
     */
	public Reservas get_reservas() {
		return _reservas;
	}

	public void set_reservas(Reservas _reservas) {
		this._reservas = _reservas;
	}
	 /**
     * 
     * Devuelve los bloqueos de la suite.
     * 
     * @return Bloqueos.
     * 
     */
	public Bloqueos get_bloqueos() {
		return _bloqueos;
	}

	public void set_bloqueos(Bloqueos _bloqueos) {
		this._bloqueos = _bloqueos;
	}
	 /**
     * 
     * Devuelve el número máximo de bloqueos.
     * 
     * @return Número máximo de bloqueos.
     * 
     */
	public int getNumMaxBloqueos() {
		return NUM_MAX_BLOQUEOS;
	}
	 /**
     * 
     * Devuelve el número máximo de reservas.
     * 
     * @return Número máximo de reservas.
     * 
     */
	public int getNumMaxReservas() {
		return NUM_MAX_RESERVAS;
	}

	/**
     * Constructor de una habitación.
     * 
     * @param Número de habitación
     * 
     * @param Tipo de habitación
     * 
     * @param Precio de la habitación
     */
	public Habitacion(int numeroHab, String tipo, int precio) {
     	_numHabitacion = numeroHab;
     	_tipo = tipo;
     	_precio = precio;
     	_bloqueos = new Bloqueos(NUM_MAX_BLOQUEOS); //Agregado de los bloqueos
     	_reservas = new Reservas(NUM_MAX_RESERVAS); //Agregado de las reservas
     }

	/**
     * Método para identificar una suite.
     * 
     * @return <code> true </code> Si es una suite.
     * @return <code> false </code> Si no es una suite.
     */
	public boolean esUnaSuite() {
		 boolean correcto;
		 	if (_tipo == "suite") {
		 		 correcto = true;
		 	}
		 	else { 
		 		correcto = false;
		 	}
		 return correcto;
	 }

	/**
     * Método para saber la disponibilidad de una habitación.
     * 
     * @param Fecha de inicio de la reserva o bloqueo
     * 
     * @param Fecha de finalización de la reserva o bloqueo
     * 
     * @return <code> true </code> Si la habitación está disponible.
     * @return <code> false </code> Si la habitación está reservada, y en caso de ser una suite, está reservada o bloqueada.
     */
	public boolean estaLibreEnPeriodo(Fecha fecInicio, Fecha fecFin) {
        boolean librePeriodo = true;       
         /*  if (esUnaSuite() == false && _reservas.comprobarReserva(fecInicio, fecFin) == true)
           {       
        	   librePeriodo = true; 
           } 
           if (esUnaSuite() == true && _reservas.comprobarReserva(fecInicio, fecFin) == true && _bloqueos.comprobarBloqueo(fecInicio, fecFin) == true)
           {
        	   librePeriodo = true;
           }
           else
           {
        	   librePeriodo = false;
           }*/
       return librePeriodo;
	}

	/**
     * Método para crear una reserva.
     * 
     * @param reserva
     * 
     * @return Reserva de la habitación.
     */
	public boolean crearReserva(Reserva reserva) {
	    return _reservas.anyadirReserva(reserva);
	  } 
	
	/**
     * Método para bloquear una suite.
     * 
     * @param bloqueo
     * 
     * @return Bloqueo de la habitación.
     */
	public boolean bloquearSuite(Bloqueo bloqueo) {
	    return _bloqueos.anyadirBloqueo(bloqueo);
	  } 
	
	/**
     * Método para confirmar un bloqueo ya realizado anteriormente.
     * 
     * @param bloqueo
     * 
     * @return Bloqueo añadido a la lista de reservas.
     */
	public boolean confirmarBloqueo(Bloqueo bloqueo){
	/*	Bloqueo bloqueo = new Bloqueo(inicio, finalizacion, nombre, null, 0);
		Reserva bloqueo = new Reserva (inicio, finalizacion, nombre, null, 0);
		return _reservas.anyadirReserva(nuevaReserva);*/
		return true;
	}
	
}
