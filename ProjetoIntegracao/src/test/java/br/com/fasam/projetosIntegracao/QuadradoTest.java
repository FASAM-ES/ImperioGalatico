/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetosIntegracao;
import br.edu.fasam.projetointegracao.Quadrado;
import junit.framework.TestCase;

/**
 *
 * @author Alysson
 */
public class QuadradoTest extends TestCase {
    
    public QuadradoTest(String testName) {
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

    // TODO add test methods here. The name must begin with 'test'. For example:
    public void testArea() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(25, (int) quadrado.Area());
        
    }
}
