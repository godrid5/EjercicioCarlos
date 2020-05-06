package RepasoHerencia;

import java.util.ArrayList;
import java.util.Scanner;


public class UsarFiguras {
    public static void main(String[] args) {
       
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(leerTE());
        figuras.add(leerTE());
        figuras.add(leerRect());
        figuras.add(leerRect());
        figuras.add(leerRect());
        
        for (Figura fig : figuras){
            System.out.println(fig);
        }
        
        for (Figura fig : figuras){
            System.out.println("El Ã¡rea es " +fig.calcularArea());
            System.out.println("El perÃ­metro es " +fig.calcularPerimetro());
        }
        
        
    }
    
    public static TrianguloEquilatero leerTE(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce lado del triÃ¡ngulo equilÃ¡tero: ");
        double lado = teclado.nextDouble();        
        TrianguloEquilatero tri = new TrianguloEquilatero(lado);        
        return tri;        
    }
    
    public static Rectangulo leerRect(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base del rectÃ¡ngulo: ");
        double base = teclado.nextDouble();    
        System.out.print("Introduce la altura del rectÃ¡ngulo: ");
        double altura = teclado.nextDouble(); 
        Rectangulo rect = new Rectangulo(base, altura);        
        return rect;        
    }
    
}
