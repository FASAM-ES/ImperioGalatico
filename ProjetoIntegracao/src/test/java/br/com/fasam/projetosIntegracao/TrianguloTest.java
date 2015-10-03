
package br.com.fasam.projetosIntegracao;

import br.edu.fasam.projetointegracao.Triangulo;
import junit.framework.TestCase;

/**
 *
 * @author Rogério
 */
public class TrianguloTest extends TestCase {
    
    public TrianguloTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     *
     */
    public void testCalcularArea(){
        Triangulo triangulo = new Triangulo(3, 3, 3);
        assertEquals(1, 1, 1);
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
