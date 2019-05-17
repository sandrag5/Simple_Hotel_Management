/**
 * Clase que contiene los parámetros de los bloqueos realizados.
 *
 * @author Nuria Rodríguez Jiménez y Sandra García-Siñeriz Herrador
 *
 */
public class Bloqueo {
	/**
     * Fecha de inicio del bloqueo.
     */
    private Fecha _fecInicio;
    /**
     * Fecha de finalización del bloqueo.
     */
    private Fecha _fecFin;
    /**
     * Nombre del cliente del bloqueo.
     */
    private String _nombre;
    /**
     * Fecha de realización del bloqueo.
     */
    private Fecha _fecRealizacion;
    /**
     * Número de días del bloqueo.
     */
    private int _numDias;
    
    /**
     * Constructor que recibe los parámetros del bloqueo.
     * 
     * @param Fecha de inicio
     * 
     * @param Fecha de finalización
     * 
     * @param Nombre
     * 
     * @param Fecha de realización
     * 
     * @param Número de días
     * 
  	*/
     public Bloqueo(Fecha inicio, Fecha finalizacion, String nombre, Fecha realizacion, int numDias) {
     	_fecInicio = inicio;
     	_fecFin = finalizacion;
     	_nombre = nombre;
     	_fecRealizacion = realizacion;
     	_numDias = numDias;
     }
     
     /**
      * 
      * Devuelve la fecha de inicio del bloqueo.
      * 
      * @return Fecha de inicio del bloqueo.
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
      * Devuelve la fecha de finalización del bloqueo.
      * 
      * @return Fecha de finalización del bloqueo.
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
      * Devuelve el nombre del cliente que realiza el bloqueo.
      * 
      * @return Nombre del cliente que realiza el bloqueo.
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
      * Devuelve la fecha de realización del bloqueo.
      * 
      * @return Fecha de realización del bloqueo.
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
      * Devuelve el número de días que dura el bloqueo.
      * 
      * @return Número de días del bloqueo.
      * 
      */
     public int getNumDias() {
 		return _numDias;
 	}     
     
     public void setNumDias(int numdias) {
    	 this._numDias = numdias;
	}
     
     /**
      * Constructor de copia. Se crea una copia por parámetros para poder comparar el bloqueo. 
      *
      * @param otroBloqueo
      *            Bloqueo a copiar.
      */
     public Bloqueo(Bloqueo otroBloqueo) {
    	 _fecInicio = otroBloqueo.getFecInicio();
    	 _fecFin = otroBloqueo.getFecFin();
    	 _nombre = otroBloqueo.getNombre();
    	 _fecRealizacion = otroBloqueo.getFecRealizacion();
    	 _numDias = otroBloqueo.getNumDias();
     }
     
     /**
      * 
      * Método para comparar dos bloqueos.
      * 
      * @param otraBloqueo
      *			Bloqueo a comparar
      * @return <code> -1 </code> Fecha de finalización de este bloqueo es anterior a la fecha de inicio del otro bloqueo.
      * @return <code> 0 </code> Fecha de inicio de este bloqueo con la fecha de finalización del otro bloqueo son iguales.
      * @return <code> 1 </code> Fecha de inicio de este bloqueo es posterior a la fecha de finalización del otro bloqueo.
      */
     int compareTo(Bloqueo otroBloqueo){
        int comparador; 
         	if (this.getFecFin().compareTo(otroBloqueo.getFecInicio()) == -1) {
              comparador = -1; //Bloqueo anterior
         	}
           else if (this.getFecInicio().compareTo(otroBloqueo.getFecFin()) == 1) {
                comparador = 1; //Bloqueo posterior
           }
            else {
                comparador = 0; //Este bloqueo empieza cuando el otro acaba
           } 
            return comparador; 
     }
     
}