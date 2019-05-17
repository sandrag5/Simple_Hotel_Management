/**
 * Clase que contiene los par�metros de las fechas.
 *
 * @author Nuria Rodr�guez Jim�nez y Sandra Garc�a-Si�eriz Herrador
 * 
 */
public class Fecha {
	/**
     * D�a de la reserva.
     */
    private int _dia;
    /**
     * Mes de la reserva.
     */
    private int _mes;
    /**
     * A�o de la reserva.
     */
    private int _anyo;
    
    /**
     * Constructor que recibe la fecha.
     * 
     * @param D�a
     * 
     * @param Mes
     * 
     * @param A�o
     * 
     */
     public Fecha(int dia, int mes, int anyo) {
     	_dia = dia;
     	_mes = mes;
     	_anyo = anyo;
     }
     
     /**
      * 
      * Devuelve el d�a de la reserva.
      * 
      * @return D�a de la reserva.
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
      * Devuelve el a�o de la reserva.
      * 
      * @return A�o de la reserva.
      * 
      */
     public int getAnyo() {
 		return _anyo;
 	} 
     
     public void setAnyo(int anyo) {
    	 this._anyo = anyo;
	}
     
     /**
      * Constructor de copia. Se crea una copia por par�metros para poder comparar la fecha. 
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
      * M�todo para comparar dos fechas.
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
	 * M�todo para comparar dos fechas iguales.
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
	 * M�todo para imprimir por pantalla la fecha.
	 * 
	 */
	
	public void mostrarFecha() {
			System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAnyo());
	}
	
}
