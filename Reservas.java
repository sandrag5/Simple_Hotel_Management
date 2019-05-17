import java.util.ArrayList;

/**
 * Clase que contiene el array de reservas.
 *
 * 
 */
public class Reservas {
	/**
     * ArrayList de reservas.
     */
	private static ArrayList<Reserva> _listaReservas;
	/**
     * Obtiene el siguiente (para el agregado).
     */
	private int _siguiente;
	
	/**
     * 
     * Devuelve el ArrayList de reservas.
     * 
     * @return ArrayList de reservas.
     * 
     */
	public ArrayList<Reserva> get_listaReservas() {
		return _listaReservas;
	}

	public void set_listaReservas(ArrayList<Reserva> _listaReservas) {
		this._listaReservas = _listaReservas;
	}
	/**
     * 
     * Devuelve el agregado.
     * 
     * @return Agregado.
     * 
     */
	public int get_siguiente() {
		return _siguiente;
	}

	public void set_siguiente(int _siguiente) {
		this._siguiente = _siguiente;
	}

	/**
     * Agregado de una reserva a una habitación.
     * 
     * @param tamaño
     */
	Reservas (int tamanyo) {
		_siguiente = 0;
		_listaReservas =new ArrayList<Reserva> (tamanyo);
	}
	
	/**
	 * Método para obtener el número de reservas, que será el tamaño del array.
	 * 
	 * @return Tamaño del ArrayList
	 */
	public int obtenerNumReservas(){
		return (_listaReservas.size());
	}
	
	/**
     * Añade una reserva al ArrayList de reservas.
     * 
     * @param reserva
     * 
     * @return <code> true </code> Si se ha añadido la reserva.
     * @return <code> false </code> Si la reserva ya estaba realizada.
     */
	public boolean anyadirReserva(Reserva reserva) {
		boolean correcto;
			if (reserva.compareTo(reserva) == 0) {
				_listaReservas.add(reserva);
					correcto = true;
			}
			else
			{
					correcto = false;
			}
		return correcto;
	}
		
	/**
     * Busca la reserva en el ArrayList.
     * 
     * @param reserva
     * 
     * @return <object> reserva </object> Reserva encontrada.
     * @return <object> null </object> Reserva no encontrada.
     */	
	Reserva buscarReserva(Reserva reserva) {
		Reserva encontrado = reserva;
			for(int i=0; i<_listaReservas.size(); i++)
				if( _listaReservas.get(i).equals(reserva)) {
					encontrado = reserva;
				}
				else
				{
				encontrado = null;
				}
			return encontrado;
	}	
	
	/**
     * Obtiene la lista de reservas.
     * 
     * @return ArrayList de reservas.
     */
	public boolean mostrarListaReservas() {
		boolean correcto;
			if (obtenerNumReservas() != 0){
				for(int i = 0 ; i < _listaReservas.size() ; i++){
					System.out.println(_listaReservas.get(i));
				}
						correcto = true;
			}
			else
			{
				System.out.println("No hay reservas para mostrar.");
						correcto = false;
			}
		return correcto;
	}
	
	/**
     * Comprueba que no exista una reserva en el mismo periodo.
     * 
     * @return <code> true </code> Si no hay ninguna reserva en ese periodo.
     * @return <code> false </code> Si ya hay una reserva realizada.
     */
	public boolean comprobarReserva (Fecha inicio, Fecha fin) {
		boolean valido = false;
		
			Reserva reserva = new Reserva (inicio, fin, null, null, 0);
			Reserva reservaPrueba = new Reserva (inicio, fin, null, null, 0);
			
			int posicionReserva = _listaReservas.indexOf(reserva);
			
			if (obtenerNumReservas()==0) {
				valido = true;
			}
			else {
				while (posicionReserva < _listaReservas.size() && reservaPrueba.compareTo(_listaReservas.get(posicionReserva)) > 0) {
					posicionReserva++;
					if (posicionReserva == 0 && reservaPrueba.compareTo(_listaReservas.get(posicionReserva)) < 0) {
						valido = true;
					}
					else if (posicionReserva == _listaReservas.size() && reservaPrueba.compareTo(_listaReservas.get(posicionReserva-1)) > 0) {
						valido = true;
					}
					else
					{
						if (reservaPrueba.compareTo(_listaReservas.get(posicionReserva)) > 0 && reservaPrueba.compareTo(_listaReservas.get(posicionReserva-1)) > 0) {
						valido = true;
						}
					}
				}
			}
		return valido;
	}
}
