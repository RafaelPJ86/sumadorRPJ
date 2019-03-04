package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAsumar {

	@Test
    public void testNegativo() {
        ASumar sumi = new ASumar("-1");
        String resultado = sumi.mostrar();
        assertEquals("",resultado );
    }

}
