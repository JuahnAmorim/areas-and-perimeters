public class Quadrado extends Retangulo{    
    public Quadrado(float lado, float altura) {
        super(lado, altura);
        this.altura = this.lado;
    }
    
    @Override
    public double calcularArea(){
        return (lado * lado);
    }
    @Override
    public double calcularPerimetro(){
        return (4 * lado);
    }
    
    @Override
    public float getLado(){
        return this.lado;
    }
    @Override
    public void setLado(float lado){
        this.lado = lado;
    }
    
    @Override
    public String toString(){
        return("\nQuadrado \nLado: " + getLado() +
               "\nAltura: " + getAltura() +
               "\nArea: " + this.calcularArea() +
               "\nPerimetro: " + this.calcularPerimetro() + "\n");
    }
}

