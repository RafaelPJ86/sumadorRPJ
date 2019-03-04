package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAsumar {

	@Test
    public void testNumero() {
        ASumar sumi = new ASumar("22");
        String expresion = sumi.expresion();
        int total1 =sumi.total();
        String total2= String.valueOf(total1);
        String resultado=expresion + "=" +total2;  

        assertEquals("2+2=4", resultado);
    }

}
