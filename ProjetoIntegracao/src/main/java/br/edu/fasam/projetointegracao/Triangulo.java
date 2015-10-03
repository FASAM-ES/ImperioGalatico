package br.edu.fasam.projetointegracao;
 


public class Triangulo {

        private float lado;
        private float area;
        private float altura;
        private float perimetro;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
       
    }
    public float calcularlado (){
        return 4*lado;
        
        
    
    }
    
}


	
	