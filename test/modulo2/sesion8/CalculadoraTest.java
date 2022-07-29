package modulo2.sesion8;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Danie
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Test
    public void sumarTest() {
        Calculadora calculadora_1 = new Calculadora();
        int resultado = calculadora_1.sumar(5, 5);
        Assert.assertEquals(11, resultado);
    }
    
    
}
