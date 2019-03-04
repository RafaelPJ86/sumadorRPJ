package sumador;

/**
 * @author usuario
 *
 */
public class ASumar {

	private String valor_inicial;

	/**
	 * @param string
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}

	/**
	 * @return
	 * si numero.length == 1
	 */
	public String mostrar() {
        String numero = valor_inicial;
        String cadena="";
        if (numero.length() == 1) {
        	
            cadena= (numero + " = " + numero);
        }
		return cadena;
		
}
	
}
