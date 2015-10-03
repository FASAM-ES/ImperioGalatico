/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.projetointegracao;

/**
 *
 * @author Alysson
 */
public class Quadrado {
    private Integer area;
    private Integer perimetro;
    private Integer lado;
    
    public Quadrado(Integer lado){
        this.lado = lado;
    }

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

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }
    
    public Integer areaQuadrado(){
        return lado * lado;        
    }
    
    public Integer perimetroQuadrado(){
        return 4 * lado;
    }
    
}
