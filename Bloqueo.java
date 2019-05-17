/**
 * Clase que contiene los par�metros de los bloqueos realizados.
 *
 * @author Nuria Rodr�guez Jim�nez y Sandra Garc�a-Si�eriz Herrador
 *
 */
public class Bloqueo {
	/**
     * Fecha de inicio del bloqueo.
     */
    private Fecha _fecInicio;
    /**
     * Fecha de finalizaci�n del bloqueo.
     */
    private Fecha _fecFin;
    /**
     * Nombre del cliente del bloqueo.
     */
    private String _nombre;
    /**
     * Fecha de realizaci�n del bloqueo.
     */
    private Fecha _fecRealizacion;
    /**
     * N�mero de d�as del bloqueo.
     */
    private int _numDias;
    
    /**
     * Constructor que recibe los par�metros del bloqueo.
     * 
     * @param Fecha de inicio
     * 
     * @param Fecha de finalizaci�n
     * 
     * @param Nombre
     * 
     * @param Fecha de realizaci�n
     * 
     * @param N�mero de d�as
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
      * Devuelve la fecha de finalizaci�n del bloqueo.
      * 
      * @return Fecha de finalizaci�n del bloqueo.
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
      * Devuelve la fecha de realizaci�n del bloqueo.
      * 
      * @return Fecha de realizaci�n del bloqueo.
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
      * Devuelve el n�mero de d�as que dura el bloqueo.
      * 
      * @return N�mero de d�as del bloqueo.
      * 
      */
     public int getNumDias() {
 		return _numDias;
 	}     
     
     public void setNumDias(int numdias) {
    	 this._numDias = numdias;
	}
     
     /**
      * Constructor de copia. Se crea una copia por par�metros para poder comparar el bloqueo. 
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
      * M�todo para comparar dos bloqueos.
      * 
      * @param otraBloqueo
      *			Bloqueo a comparar
      * @return <code> -1 </code> Fecha de finalizaci�n de este bloqueo es anterior a la fecha de inicio del otro bloqueo.
      * @return <code> 0 </code> Fecha de inicio de este bloqueo con la fecha de finalizaci�n del otro bloqueo son iguales.
      * @return <code> 1 </code> Fecha de inicio de este bloqueo es posterior a la fecha de finalizaci�n del otro bloqueo.
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