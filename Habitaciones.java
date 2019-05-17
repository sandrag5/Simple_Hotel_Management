import java.util.ArrayList;

/**
 * Clase que contiene las caracter�sticas de las habitaciones.
 *
 * @author Nuria Rodr�guez Jim�nez y Sandra Garc�a-Si�eriz Herrador
 *
 */	
	public class Habitaciones {
    /**
     * Siguiente habitaci�n.
     */
    private int _siguiente;
    /** 
     * ArrayList de habitaciones. 
     */
    private ArrayList<Habitacion> _listaHabitaciones;
    
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
     * 
     * Devuelve el ArrayList de habitaciones.
     * 
     * @return ArrayList de habitaciones.
     * 
     */
	public ArrayList<Habitacion> get_listaHabitaciones() {
		return _listaHabitaciones;
	}

	public void set_listaHabitaciones(ArrayList<Habitacion> _listaHabitaciones) {
		this._listaHabitaciones = _listaHabitaciones;
	} 
    /**
     * Agregado de habitaciones.
     *
     * @param tama�o
     *           
     */
    Habitaciones (int tamanyo) { 
        _siguiente = 0; 
        _listaHabitaciones =new ArrayList<Habitacion> (tamanyo); 
    }
    
    /**
     * M�todo para crear reservas.
     * 
     * @param reserva.
     * 
     * @return <code> true </code>
     * @return <code> false </code>
     * 
     */
    /*public boolean crearReserva(Reserva reserva){ YA EST� CREADO EN HABITACI�N IGUAL QUE BLOQUEAR SUITE Y CONFIRMAR BLOQUEO
    	boolean creada= true;
    	
    	return creada;
    */
    
    /**
     * M�todo para listar las habitaciones libres.
     *
	 * @param Fecha inicio
	 * @param Fecha finalizaci�n
     */
    private void listarHabsLibres(Fecha inicio, Fecha finalizacion) { //�qu� hay que hacer con fecha inicio&&fin?
    	int listarHabitacionesLibres=0;
    	for (int i=0; i<_listaHabitaciones.size();i++)
    	{
    		if(_listaHabitaciones.get(i)==null)
    		{
    			listarHabitacionesLibres= listarHabitacionesLibres +1;
    		}
    	}
    }
    
    /**
     * M�todo para listar las habitaciones reservadas.
     *
	 * @param Fecha inicio
	 * @param Fecha finalizaci�n
     */
     private void listarHabsReservadas(Fecha inicio, Fecha finalizacion) { //�qu� hay que hacer con fecha inicio&&fin?
    	 int listarHabitacionesReservadas= 0;
    	 for (int i=0;i<_listaHabitaciones.size();i++)
    	 {
    		if(_listaHabitaciones.get(i)!=null)
    		{
    			listarHabitacionesReservadas = listarHabitacionesReservadas +1;
    		}
    	 }
    
    }
     /** 
      * A�ade al ArrayList de reservas una habitaci�n. 
      * 
      * @param Nueva habitaci�n
      * 
      * @return <code> true </code> Se a�ade la habitaci�n a la reserva.
      * @return <code> false </code> No se a�ade la habitaci�n.
      */
     public boolean anyadirReservas(Habitacion nuevaHabitacion) { 
    	 boolean correcto = true; 
           /*  if (Habitacion.compareTo(nuevaHabitacion) == 0) //Hay que crear un metodo para comparar habitacioneis
             { 
                 _listaHabitaciones.add(nuevaHabitacion); 
                     correcto = true; 
             } 
             else
             { 
                     correcto = false; 
             } */
         return correcto; 
     }
    
     /** 
      * M�todo que inserta una habitacion en el ArrayList. 
      * 
      * @param Nueva habitaci�n
      * 
      * @param Posici�n en la que se inserta la habitaci�n
      * 
      * @return <code> true </code> Se inserta la habitaci�n
      * @return <code> false </code> No se inserta la habitaci�n.
      */
     public boolean insertarHabitacion(Habitacion nuevaHabitacion, int posicionInsertar) { 
         boolean correcto= true; 
          
         for(int i=0; i<_listaHabitaciones.size();i++)
         {
        	 if (_listaHabitaciones.get(i) != null)
             { 
                 /*desplazarElementos(posicionInsertar, 1); 
                     _listaHabitaciones.add(posicionInsertar, nuevaHabitacion); */
                         correcto = true;  
             }  
             else 
             { 
                         correcto = false; 
             } 
                         
         }
         return correcto; 
         	
     } 
       
     /** 
      * M�todo que devuelve la posici�n de la habitacion en el ArrayList. 
      * 
      * @param Nueva habitaci�n
      * 
      * @return Primera posici�n del objeto habitaci�n en el ArrayList
      * 
      */
     public int buscarPosicion(Habitacion nuevaHabitacion){ 
         return _listaHabitaciones.indexOf(nuevaHabitacion); 
           
     } 
}
