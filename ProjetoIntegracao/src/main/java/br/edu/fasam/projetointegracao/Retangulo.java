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
public class Retangulo {
    private Integer base;
    private Integer altura;
    private Integer area;
    private Integer perimetro;
    
    public Retangulo(Integer base, Integer altura){
        this.base = base;
        this.altura = altura;
    }
    
    public Retangulo(){
        
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
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
    
    public Integer area(){
        return base * altura;    
    }
    
    public Integer perimetro(){
        return 2 * base + 2 * altura;
    }
}
