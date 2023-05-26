public class Circulo extends Quadrilatero {
    public float raio;
    public Circulo(float raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return (3.14 * (this.getRaio() * this.getRaio()));
    }
    @Override
    public double calcularPerimetro(){
        return (2 * 3.14 * this.getRaio());
    }
    
    public float getRaio(){
        return this.raio;
    }
    public void setRaio(float raio){
        this.raio = raio;
    }
    
    @Override
    public String toString(){
        return "\nCirculo \nRaio: " + getRaio() +
               "\nArea: " + this.calcularArea() + 
               "\nPerimetro: " + this.calcularPerimetro() + "\n";
    }
}
