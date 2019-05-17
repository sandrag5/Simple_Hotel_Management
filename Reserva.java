/**
 * Clase que contiene los parámetros de las reservas.
 *
 *
 */
public class Reserva {
    /**
     * Fecha de inicio de la reserva.
     */
     private Fecha _fecInicio;
    /**
     * Fecha de finalización de la reserva.
     */
     private Fecha _fecFin;
     /**
      * Nombre del cliente que ha realizado la reserva.
      */
     private String _nombre;
     /**
      * Fecha de realización de la reserva.
      */
     private Fecha _fecRealizacion;
     /**
      * Precio de la reserva.
      */
     private int _precio;
     
     /**
      * Constructor que obtiene los datos sobre la reserva.
      * 
      * @param Fecha de inicio
      * 
      * @param Fecha de finalización
      * 
      * @param Nombre del cliente
      * 
      * @param Fecha de realización
      * 
      * @param Precio
      * 
      */
      public Reserva(Fecha inicio, Fecha finalizacion, String nombre, Fecha realizacion, int precio) {
    	_fecInicio = inicio;
    	_fecFin = finalizacion;
      	_nombre = nombre;
      	_fecRealizacion = realizacion;
      	_precio = precio;
      }
     
      /**
       * 
       * Devuelve la fecha de inicio de la reserva.
       * 
       * @return Fecha de inicio.
       * 
       */
      public Fecha getFecInicio() {
  		return _fecInicio;
  	}
      
      public void setFecInicio(Fecha fecinicio) {
     	 this._fecInicio = fecinicio;
 	}
      
      /**
       * 
       * Devuelve la fecha de finalización de la reserva.
       * 
       * @return Fecha de finalización.
       * 
       */
      public Fecha getFecFin() {
  		return _fecFin;
  	}
      
      public void setFecFin(Fecha fecfin) {
     	 this._fecFin = fecfin;
 	}
      
      /**
       * 
       * Devuelve el nombre del cliente.
       * 
       * @return Nombre del cliente.
       * 
       */
      public String getNombre() {
  		return _nombre;
  	}
      
      public void setNombre(String nombre) {
     	 this._nombre = nombre;
 	}
      
      /**
       * 
       * Devuelve la fecha de realización de la reserva.
       * 
       * @return Fecha de realización.
       * 
       */
      public Fecha getFecRealizacion() {
  		return _fecRealizacion;
  	}
      
      public void setFecRealizacion(Fecha fecrealizacion) {
     	 this._fecRealizacion = fecrealizacion;
 	}
      
      /**
       * 
       * Devuelve el precio de la reserva.
       * 
       * @return Precio de la reserva.
       * 
       */
      public int getPrecio() {
  		return _precio;
  	}     
    
      public void setPrecio(int precio) {
     	 this._precio = precio;
 	} 
      
      /**
       * Constructor de copia. Se crea una copia por parámetros para poder comparar la reserva. 
       *
       * @param otraReserva
       *            Reserva a copiar.
       */
      public Reserva(Reserva otraReserva) {
    	  _fecInicio = otraReserva.getFecInicio();
    	  _fecFin = otraReserva.getFecFin();
          _nombre = otraReserva.getNombre();
          _fecRealizacion = otraReserva.getFecRealizacion();
          _precio = otraReserva.getPrecio();
      }
      
      /**
       * 
       * Método para comparar dos reservas.
       * 
       * @param otraReserva
       *			Reserva a comparar
       * @return <code> -1 </code> Fecha de finalización de esta reserva es anterior a la fecha de inicio de la otra reserva.
       * @return <code> 0 </code> Fechas de inicio de esta reserva con la fecha de finalización de la otra reserva son iguales.
       * @return <code> 1 </code> Fecha de inicio de esta reserva es posterior a la fecha de finalización de la otra reserva.
       */
      int compareTo(Reserva otraReserva){
         int comparadorReservas; 
          	if (this.getFecFin().compareTo(otraReserva.getFecInicio()) == -1) {
               comparadorReservas = -1; //Reserva anterior
          	}
            else if (this.getFecInicio().compareTo(otraReserva.getFecFin()) == 1) {
                 comparadorReservas = 1; // Reserva posterior
            }
             else {
                 comparadorReservas = 0; //Esta reserva empieza cuando la otra acaba
            } 
             return comparadorReservas; 
      }
      
}
