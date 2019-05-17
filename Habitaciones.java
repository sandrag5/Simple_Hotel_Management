import java.util.ArrayList;

/**
 * Clase que contiene las características de las habitaciones.
 *
 * @author Nuria Rodríguez Jiménez y Sandra García-Siñeriz Herrador
 *
 */	
	public class Habitaciones {
    /**
     * Siguiente habitación.
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
     * @param tamaño
     *           
     */
    Habitaciones (int tamanyo) { 
        _siguiente = 0; 
        _listaHabitaciones =new ArrayList<Habitacion> (tamanyo); 
    }
    
    /**
     * Método para crear reservas.
     * 
     * @param reserva.
     * 
     * @return <code> true </code>
     * @return <code> false </code>
     * 
     */
    /*public boolean crearReserva(Reserva reserva){ YA ESTÁ CREADO EN HABITACIÓN IGUAL QUE BLOQUEAR SUITE Y CONFIRMAR BLOQUEO
    	boolean creada= true;
    	
    	return creada;
    */
    
    /**
     * Método para listar las habitaciones libres.
     *
	 * @param Fecha inicio
	 * @param Fecha finalización
     */
    private void listarHabsLibres(Fecha inicio, Fecha finalizacion) { //¿qué hay que hacer con fecha inicio&&fin?
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
     * Método para listar las habitaciones reservadas.
     *
	 * @param Fecha inicio
	 * @param Fecha finalización
     */
     private void listarHabsReservadas(Fecha inicio, Fecha finalizacion) { //¿qué hay que hacer con fecha inicio&&fin?
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
      * Añade al ArrayList de reservas una habitación. 
      * 
      * @param Nueva habitación
      * 
      * @return <code> true </code> Se añade la habitación a la reserva.
      * @return <code> false </code> No se añade la habitación.
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
      * Método que inserta una habitacion en el ArrayList. 
      * 
      * @param Nueva habitación
      * 
      * @param Posición en la que se inserta la habitación
      * 
      * @return <code> true </code> Se inserta la habitación
      * @return <code> false </code> No se inserta la habitación.
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
      * Método que devuelve la posición de la habitacion en el ArrayList. 
      * 
      * @param Nueva habitación
      * 
      * @return Primera posición del objeto habitación en el ArrayList
      * 
      */
     public int buscarPosicion(Habitacion nuevaHabitacion){ 
         return _listaHabitaciones.indexOf(nuevaHabitacion); 
           
     } 
}
