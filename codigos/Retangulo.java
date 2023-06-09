package codigos;
public class Retangulo extends Quadrilatero{
    
    public float lado;
    public float altura;
    
    public Retangulo(float lado, float altura){
        if(lado <= 0 || altura <= 0){
            throw new RuntimeException("O valor do lado e da altura do "
                                          + "retangulo precisa ser maior"
                                          + " ou igual a 0.");
        }
        
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return this.getLado() * this.getAltura();
    }
    @Override
    public double calcularPerimetro(){
        return (2*this.getLado() * 2*this.getAltura());
    }

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return("\nRetangulo \nLado: " + getLado() +
               "\nAltura: " + getAltura() + 
               "\nArea: " + this.calcularArea() +
               "\nPerimetro: " + this.calcularPerimetro() + "\n");
    }
}