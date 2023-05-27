package codigos;
import java.util.ArrayList;

public class Execute {
    public static void main(String[] args) {
        
        ArrayList<Quadrilatero> quadrilateros = new ArrayList<>();
        ArrayList<Circulo> circulos = new ArrayList<>();
        try{
            Retangulo r1 = new Retangulo(2,5);
            Retangulo r2 = new Retangulo(4,3);
            Quadrado q1 = new Quadrado(5,5);
            Circulo c1 = new Circulo(4);
            Circulo c2 = new Circulo(3);
            quadrilateros.add(r1);
            quadrilateros.add(r2);
            quadrilateros.add(q1);
            quadrilateros.add(c1);
            quadrilateros.add(c2);
            circulos.add(c1);
            circulos.add(c2);
        }
        catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
        System.out.println(quadrilateros); //printar ArrayList quadrilateros;
        System.out.println(circulos); //printar ArrayList circulos;
    }
}