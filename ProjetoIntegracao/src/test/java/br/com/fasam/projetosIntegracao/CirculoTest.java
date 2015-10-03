/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetosIntegracao;

import br.edu.fasam.projetointegracao.Circulo;
import junit.framework.TestCase;

/**
 *
 * @author DiogoDil
 */
public class CirculoTest extends TestCase {
    
    public CirculoTest(String testName) {
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
    
    public void testCalculaAreaCirculo(){
        Circulo circulo = new Circulo(5);
        assertEquals(21.98, (double) circulo.AreaCirculo() );
    }
    
    public void testCalculaPerimetroCirculo(){
        Circulo circulo = new Circulo(5);
        assertEquals(31.4, (double) circulo.PerimetroCirculo() );
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
