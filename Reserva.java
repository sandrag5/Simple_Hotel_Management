/**
 * Clase que contiene los par�metros de las reservas.
 *
 * @author Nuria Rodr�guez Jim�nez y Sandra Garc�a-Si�eriz Herrador
 *
 */
public class Reserva {
    /**
     * Fecha de inicio de la reserva.
     */
     private Fecha _fecInicio;
    /**
     * Fecha de finalizaci�n de la reserva.
     */
     private Fecha _fecFin;
     /**
      * Nombre del cliente que ha realizado la reserva.
      */
     private String _nombre;
     /**
      * Fecha de realizaci�n de la reserva.
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
      * @param Fecha de finalizaci�n
      * 
      * @param Nombre del cliente
      * 
      * @param Fecha de realizaci�n
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
       * Devuelve la fecha de finalizaci�n de la reserva.
       * 
       * @return Fecha de finalizaci�n.
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
       * Devuelve la fecha de realizaci�n de la reserva.
       * 
       * @return Fecha de realizaci�n.
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
       * Constructor de copia. Se crea una copia por par�metros para poder comparar la reserva. 
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
       * M�todo para comparar dos reservas.
       * 
       * @param otraReserva
       *			Reserva a comparar
       * @return <code> -1 </code> Fecha de finalizaci�n de esta reserva es anterior a la fecha de inicio de la otra reserva.
       * @return <code> 0 </code> Fechas de inicio de esta reserva con la fecha de finalizaci�n de la otra reserva son iguales.
       * @return <code> 1 </code> Fecha de inicio de esta reserva es posterior a la fecha de finalizaci�n de la otra reserva.
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