package br.edu.fasam.projetointegracao;

public class Triangulo {

    private float area;
    private float perimetro;
    private float lado1;
    private float lado2;
    private float lado3;
    
    public Triangulo (float lado1, float lado2, float lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(Integer lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(Integer lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(Integer lado3) {
        this.lado3 = lado3;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;

    }

    public double calcularArea() {
        double p = (lado1 + lado2 + lado3) / 2;
        double area = p * (p - lado1) * (p - lado2) * (p - lado3);
        return Math.sqrt(area);

    }

}
