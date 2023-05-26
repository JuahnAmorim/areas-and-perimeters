import java.util.ArrayList;

public class Execute {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(3,2);
        Retangulo r2 = new Retangulo(4,3);
        
        Quadrado q1 = new Quadrado(5,5);
        
        Circulo c1 = new Circulo(4);
        Circulo c2 = new Circulo(3);
        
        ArrayList<Quadrilatero> quadrilateros = new ArrayList<>();
        quadrilateros.add(r1);
        quadrilateros.add(r2);
        quadrilateros.add(q1);
        quadrilateros.add(c1);
        quadrilateros.add(c2);
        
        ArrayList<Circulo> circulos = new ArrayList<>();
        circulos.add(c1);
        circulos.add(c2);
        
        System.out.println(quadrilateros);
        System.out.println(circulos);
    }
    
}