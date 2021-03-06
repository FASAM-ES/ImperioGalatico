/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetosIntegracao;

import br.edu.fasam.projetointegracao.Retangulo;
import junit.framework.TestCase;

/**
 *
 * @author Alysson
 */
public class RetanguloTest extends TestCase {
    
    public RetanguloTest(String testName) {
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

    // Rotina responsável por calcular a área
    public void testArea() {
        Retangulo retangulo = new Retangulo(3, 4);
        assertEquals(12, (int) retangulo.area());
        assertNotSame(30, (int) retangulo.area());
        assertEquals(14, (int) retangulo.perimetro());
        assertNotNull("OK", retangulo);
        
    }
}
