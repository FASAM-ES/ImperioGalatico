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
    private double area;
    private double perimetro;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double PerimetroCirculo() {
        return 2 * 3.14 * raio;
    }
    
    public double AreaCirculo() {
        return 3.14 * (raio * raio);
    }
}
