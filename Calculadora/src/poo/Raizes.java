package poo;

import java.util.ArrayList;
import java.util.List;

public class Raizes {
    
    private static double calcularDelta(double a, double b, double c){
       
        b = Calculadora.potenciacao(b, 2);
        double ac4 = Calculadora.multiplicacao(Calculadora.multiplicacao(a, c), 4);
        return b - ac4;
    }

    public static List<Double> bhaskara(double a, double b, double c){
        
        double x = Calculadora.soma(-b, Calculadora.raizQuadrada(calcularDelta(a, b, c)));
        x = Calculadora.divisao(x, Calculadora.multiplicacao(2, a));

        double y = Calculadora.subtracao(-b, Calculadora.raizQuadrada(calcularDelta(a, b, c)));
        y = Calculadora.divisao(y, Calculadora.multiplicacao(2, a));

        List<Double> raizes = new ArrayList<>();
        raizes.add(x);
        raizes.add(y);
        return raizes;
    }

}
