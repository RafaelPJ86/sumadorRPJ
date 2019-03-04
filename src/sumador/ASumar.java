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
	 */
	public int total() {
	        int suma = 0;

	        for (int i = 0; i < valor_inicial.length(); i++) {
	            // Cadena de un d�gito.
	            String digito = valor_inicial.substring(i, 1);
	            suma = suma + Integer.parseInt(digito);
	        }
	        return suma;

	    }
	 
	 /**
	 * @return
	 */
	public String expresion() {
	        String suma = "";

	        for (int i = 0; i < valor_inicial.length(); i++) {
	            // Cadena de un d�gito.
	            String digito = valor_inicial.substring(i, 1);
	            suma = suma + digito + " + "; //Atenci�n puede que as� no funcione**
	        }
	        return suma;

	    }


        	
            


        	
        	
     
		
}
