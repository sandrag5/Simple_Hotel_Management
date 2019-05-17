import java.util.ArrayList;

/**
 * Clase que contiene el array de bloqueos.
 *
 * 
 */
public class Bloqueos {
	/**
     * ArrayList de bloqueos.
     */
	private ArrayList<Bloqueo> _listaBloqueos;
	/**
     * Obtiene el siguiente (para el agregado).
     */
	private int _siguiente;

	 /**
     * 
     * Devuelve el ArrayList de los bloqueos realizados.
     * 
     * @return Bloqueos
     * 
     */
	public ArrayList<Bloqueo> get_listaBloqueos() {
		return _listaBloqueos;
	}
	public void set_listaBloqueos(ArrayList<Bloqueo> _listaBloqueos) {
		this._listaBloqueos = _listaBloqueos;
	}
	 /**
     * 
     * Devuelve el agregado.
     * 
     * @return Siguiente bloqueo
     * 
     */
	public int get_siguiente() {
		return _siguiente;
	}
	public void set_siguiente(int _siguiente) {
		this._siguiente = _siguiente;
	}
	
	/**
     * Agregado de un bloqueo a una suite.
     * 
     * @param tamaño
     */
	Bloqueos (int tamanyo) {
		_siguiente = 0;
		_listaBloqueos =new ArrayList<Bloqueo> (tamanyo);
	}
	
	/**
	 * Método para obtener el número de reservas, que será el tamaño del array.
	 */
	public int obtenerNumBloqueos(){
		return (_listaBloqueos.size());
	}
	
	/**
     * Añade un bloqueo al ArrayList de bloqueos.
     * 
     * @param bloqueo
     * 
     * @return <code> true </code> Si el bloqueo se ha añadido al ArrayList.
     * @return <code> false </code> El bloqueo ya estaba realizado.
     */
	public boolean anyadirBloqueo(Bloqueo bloqueo) {
		boolean correcto;
			if (bloqueo.compareTo(bloqueo) == 0) {
				_listaBloqueos.add(bloqueo);
					correcto = true;
			}
			else
			{
					correcto = false;
			}
		return correcto;
	}
		
	/**
     * Busca el bloqueo en el ArrayList.
     * 
     * @param bloqueo
     * 
     * @return <object> bloqueo </object> Bloqueo encontrado.
     * @return <object> null </object> Bloqueo no encontrado.
     */	
	Bloqueo buscarBloqueo(Bloqueo bloqueo) {
		Bloqueo encontrado = bloqueo;
			for(int i=0; i<_listaBloqueos.size(); i++)
				if( _listaBloqueos.get(i).equals(bloqueo)) {
					encontrado = bloqueo;
				}
				else
				{
				encontrado = null;
				}
			return encontrado;
	}	
	
	/**
     * Obtiene la lista de bloqueos.
     * 
     * @return ArrayList de bloqueos.
     */
	public boolean mostrarListaBloqueos() {
		boolean correcto;
			if (obtenerNumBloqueos() != 0){
				for(int i = 0 ; i < _listaBloqueos.size() ; i++){
					System.out.println(_listaBloqueos.get(i));
				}
						correcto = true;
			}
			else
			{
					System.out.println("No hay bloqueos para mostrar.");
						correcto = false;
			}
		return correcto;
	}
	
	/**
     * Comprueba que no exista un bloqueo en el mismo periodo.
     * 
     * @return <code> true </code> Si no existe ningún bloqueo en ese periodo.
     * @return <code> false </code> Si ya hay un bloqueo realizado.
     */
	public boolean comprobarBloqueo (Fecha inicio, Fecha fin) {
		boolean valido = false;
		
			Bloqueo bloqueo = new Bloqueo (inicio, fin, null, null, 0);
			Bloqueo bloqueoPrueba = new Bloqueo (inicio, fin, null, null, 0);
			
			int posicionBloqueo = _listaBloqueos.indexOf(bloqueo);
			
			if (obtenerNumBloqueos()==0) {
				valido = true;
			}
			else {
				while (posicionBloqueo < _listaBloqueos.size() && bloqueoPrueba.compareTo(_listaBloqueos.get(posicionBloqueo)) > 0) {
					posicionBloqueo++;
					if (posicionBloqueo == 0 && bloqueoPrueba.compareTo(_listaBloqueos.get(posicionBloqueo)) < 0) {
						valido = true;
					}
					else if (posicionBloqueo == _listaBloqueos.size() && bloqueoPrueba.compareTo(_listaBloqueos.get(posicionBloqueo-1)) > 0) {
						valido = true;
					}
					else
					{
						if (bloqueoPrueba.compareTo(_listaBloqueos.get(posicionBloqueo)) > 0 && bloqueoPrueba.compareTo(_listaBloqueos.get(posicionBloqueo-1)) > 0) {
						valido = true;
						}
					}
				}
			}
		return valido;
	}
	
	/*
     * Método que desplaza a la derecha los elementos del ArrayList.
     * 
     * @param Posicion en la que se inserta el objeto
     * 
     * @param Posiciones que hay que desplazar los elementos de la lista.
	 * 
     
	public void desplazarElementos(int posicionInsertar, int posicionesDesplazar) {
			if (obtenerNumReservas() != 0){
				for(int i = posicionInsertar; i < _listaBloqueos.size()+posicionesDesplazar; i++);
			}
	}
	
	/**
     * Método que inserta bloqueo en el ArrayList.
     * 
     * @param bloqueo
     * 
     * @param Posición en la que se inserta el objeto bloqueo en la lista.
     * 
     * @return <code> true </code> El objeto se inserta en la lista.
     * @return <code> false </code> El objeto no se puede insertar.
     
	public boolean insertarBloqueo(Bloqueo bloqueo, int posicionInsertar) {
		boolean correcto;
			if (obtenerNumReservas() != 0){
				desplazarElementos(posicionInsertar, 1);
					_listaBloqueos.add(posicionInsertar, bloqueo);
						correcto = true; 
			} 
			else 
			{
						correcto = false;
			}
						return correcto;
	}
	
	/**
     * Método que devuelve la posición del bloqueo en el ArrayList.
     * 
     * @param bloqueo
     * 
     * @return La primera posición en la que se encuentre el objeto bloqueo.
     * 
     
	public int buscarPosicion(Bloqueo bloqueo){
		return _listaBloqueos.indexOf(bloqueo);
		
	}*/
	
}
