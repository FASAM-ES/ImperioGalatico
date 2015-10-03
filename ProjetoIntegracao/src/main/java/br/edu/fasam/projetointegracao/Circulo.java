/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.projetointegracao;

/**
 *
 * @author Angelita
 */
public class Circulo {
    private Integer area;
    private Integer perimetro;
    private Integer raio;
    
     public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Integer perimetro) {
        this.perimetro = perimetro;
    }

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }
    
    public double PerimetroCirculo() {
        return 2 * 3.14 * raio;
    }
    
    public double AreaCirculo() {
        return 3.14 * (raio ^ 2);
    }
}
