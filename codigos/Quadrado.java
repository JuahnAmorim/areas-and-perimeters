package codigos;
public class Quadrado extends Retangulo{    
    
    public Quadrado(float lado, float altura) {
        super(lado, altura);
        if(lado <= 0 || altura <= 0){
            throw new RuntimeException("O valor do lado e da altura "
                    + "do quadrado precisa ser maior ou igual a 0.");
        }else if(lado != altura){
            throw new RuntimeException("No quadrado, lado e altura "
                                       + "precisam ter valores iguais.");
        }
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