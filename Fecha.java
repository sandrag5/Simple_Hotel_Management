/**
 * Clase que contiene los parámetros de las fechas.
 *
 * @author Nuria Rodríguez Jiménez y Sandra García-Siñeriz Herrador
 * 
 */
public class Fecha {
	/**
     * Día de la reserva.
     */
    private int _dia;
    /**
     * Mes de la reserva.
     */
    private int _mes;
    /**
     * Año de la reserva.
     */
    private int _anyo;
    
    /**
     * Constructor que recibe la fecha.
     * 
     * @param Día
     * 
     * @param Mes
     * 
     * @param Año
     * 
     */
     public Fecha(int dia, int mes, int anyo) {
     	_dia = dia;
     	_mes = mes;
     	_anyo = anyo;
     }
     
     /**
      * 
      * Devuelve el día de la reserva.
      * 
      * @return Día de la reserva.
      * 
      */
     public int getDia() {
 		return _dia;
 	}   
     
     public void setDia(int dia) {
    	 this._dia = dia;
	}
     
     /**
      * 
      * Devuelve el mes de la reserva.
      * 
      * @return Mes de la reserva.
      * 
      */
     public int getMes() {
 		return _mes;
 	} 
     
     public void setMes(int mes) {
    	 this._mes = mes;
	}
      
     /**
      * 
      * Devuelve el año de la reserva.
      * 
      * @return Año de la reserva.
      * 
      */
     public int getAnyo() {
 		return _anyo;
 	} 
     
     public void setAnyo(int anyo) {
    	 this._anyo = anyo;
	}
     
     /**
      * Constructor de copia. Se crea una copia por parámetros para poder comparar la fecha. 
      *
      * @param otra
      *            Fecha a copiar.
      */
     public Fecha(Fecha otra) {
    	 	_dia = otra.getDia();
    	 	_mes = otra.getMes();
    	 	_anyo = otra.getAnyo();
     }
     
     /**
      * 
      * Método para comparar dos fechas.
      * 
      * @param otra
      *			Fecha a comparar
      *
      * @return <code> -1 </code> La fecha es anterior.
      * @return <code> 0 </code> Si las fechas coinciden.
      * @return <code> 1 </code> La fecha es posterior.
      *         
      */
     
     int compareTo(Fecha otra){
    	 int compararFechas;
      
    	 	if (this.getAnyo() < otra.getAnyo()
    	 			&& this.getMes() <= otra.getMes()
    	 			&& this.getDia() <= otra.getDia())
    	 				compararFechas = -1;
    	 	else if (this.getAnyo() == otra.getAnyo()
    	 			&& this.getMes() == otra.getMes()
    	 			&& this.getDia() == otra.getDia())
    	 				compararFechas = 0;
    	 	else
    	 				compararFechas = 1;
      
    	 return compararFechas;
	}

 
	/**
	 * 
	 * Método para comparar dos fechas iguales.
	 * 
	 * @param otra
	 *			Fecha a comparar
	 * @return <code> true </code> Fechas iguales.
	 *         <code> false </code> En caso contrario.
	 */

	public boolean esIgual(Fecha otra) {
			return ((this.getDia() == otra.getDia()) && 
					(this.getMes() == otra.getMes()) &&
					(this.getAnyo() == otra.getAnyo()));
			}
	
	/**
	 * 
	 * Método para imprimir por pantalla la fecha.
	 * 
	 */
	
	public void mostrarFecha() {
			System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAnyo());
	}
	
}
