/**
 * Clase que contiene la información del hotel.
 *
 * @author Nuria Rodríguez Jiménez y Sandra García-Siñeriz Herrador
 * 
 */
public class Hotel {
	/**
     * Nombre del hotel.
     */
    private String _nombre;
    /**
     * Categoría del hotel.
     */
    private String _categoria;
    /**
     * Número de habitación.
     */
    private int _numHabitacion;
    /**
     * Array de habitaciones del hotel.
     */
    private Habitaciones[] _habitaciones;
    /**
     * Número total de habitaciones del hotel.
     */
	private static final int NUM_MAX_HABITACIONES = 10;
	
	/**
     * Constructor que obtiene los datos del hotel.
     * 
     * @param Categoría del hotel
     * 
     * @param Nombre del hotel
     * 
     */
	public Hotel(String categoria, String nombre) {
    	_categoria = categoria;
    	_nombre = nombre;
    }

    /**
     * 
     * Devuelve el nombre del hotel.
     * 
     * @return Nombre
     * 
     */
	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
    /**
     * 
     * Devuelve la categoría del hotel.
     * 
     * @return Categoría.
     * 
     */
	public String get_categoria() {
		return _categoria;
	}

	public void set_categoria(String _categoria) {
		this._categoria = _categoria;
	}
    /**
     * 
     * Devuelve el número de habitación del hotel.
     * 
     * @return Número de habitación
     * 
     */
	public int get_numHabitacion() {
		return _numHabitacion;
	}

	public void set_numHabitacion(int _numHabitacion) {
		this._numHabitacion = _numHabitacion;
	}
    /**
     * 
     * Devuelve las habitaciones del hotel.
     * 
     * @return Habitaciones del hotel.
     * 
     */
	public Habitaciones[] get_habitaciones() {
		return _habitaciones;
	}

	public void set_habitaciones(Habitaciones[] _habitaciones) {
		this._habitaciones = _habitaciones;
	}
    /**
     * 
     * Devuelve el número total de habitaciones.
     * 
     * @return Total de habitaciones
     * 
     */
	public static int getNumMaxHabitaciones() {
		return NUM_MAX_HABITACIONES;
	}
	
	/**
     * Método para añadir una reserva.
     * 
     * @param reserva
     * 
     * @return <code> true </code> Se crea la reserva
     * @return <code> false </code> No se crea la reserva
     */
	public boolean anyadirReserva(Reserva reserva) {
		boolean correcto =  true;
			/*if (Habitaciones.crearReserva(reserva) == true) {
				correcto = true; 
			}
			else
			{
				correcto = false;
			}*/
		
				return correcto; 
	}
	
	/**
     * Método para bloquear una suite.
     * 
     * @param bloqueo
     * 
     * @return <code> true </code> Se bloquea la suite.
     * @return <code> false </code> Bloqueo ya realizado.
     */
	public boolean bloquearSuite(Bloqueo bloqueo) {
		boolean correcto = true;
			/*if (Habitaciones.bloquearSuite(bloqueo) == true) {
				correcto = true; 
			}
			else
			{
				correcto = false;
			}*/
	
			return correcto; 	
	}
	
	/**
     * Método para confirmar un bloqueo.
     * 
     * @param bloqueo
     * 
     * @return <code> true </code> Se confirma el bloqueo.
     * @return <code> false </code> Confirmación del bloqueo ya realizada.
     */
	public boolean confirmarBloqueo(Bloqueo bloqueo) {
		boolean correcto;
			if (_numHabitacion <= NUM_MAX_HABITACIONES && _numHabitacion > 0) {
				correcto = true; 
			}
			else
			{
				correcto = false;
			}
			return correcto; 
	}
	
	/**
     * Método para añadir un bloqueo.
     * 
     * @param bloqueo
     * 
     * @return <code> true </code> Se añade el bloqueo
     * @return <code> false </code> Bloqueo añadido anteriormente.
     */
	public boolean anyadirBloqueo(Bloqueo bloqueo) {
		boolean correcto;
			if (bloquearSuite(bloqueo) == true) {
				correcto = true; 
			}
			else
			{
				correcto = false;
			}

		return correcto; 	
	}

	/**
     * Método para listar las habitaciones libres.
     * 
     * @param Fecha de inicio
     * 
     * @param Fecha de finalización
     * 
     * @return <code> true </code> Se han listado todas las habitaciones libres.
     * @return <code> false </code> No se han listado.
     */
	public boolean listarHabsLibres(Fecha fecInicio, Fecha fecFin) {
		boolean correcto = true;
			/*if () {
				correcto = true; 
			}
			else
			{
				correcto = false;
			}*/
		return correcto;	
	}
	
	/**
     * Método para añadir habitación a la lista de habitaciones libres.
     * 
     * @param Nueva habitación
     * 
     * @return <code> true </code> Se ha añadido la habitación
     * @return <code> false </code> No se ha podido añadir la habitación.
     */
	public boolean anyadirHabitacion(Habitacion nuevaHabitacion) {
		boolean correcto = true;
		/*	if (Reservas.anyadirHabitacion(nuevaHabitacion) == true) {
				correcto = true; 
			}
			else
			{
				correcto = false;
			}*/
		return correcto;	
	}
	
	
}
