package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args){
        
        double a, b, c;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calculo bhaskara: ");

        System.out.println("Digite o coeficiente a: ");
        a = scan.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        b = scan.nextDouble();

        System.out.println("Digite o coeficiente c: ");
        c = scan.nextDouble();

        double delta = Calculadora.potenciacao(b, 2) - Calculadora.multiplicacao(Calculadora.multiplicacao(a, c), 4);

        double x = Calculadora.soma(-b, Calculadora.raizQuadrada(delta));
        x = Calculadora.divisao(x, Calculadora.multiplicacao(2, a));

        double y = Calculadora.subtracao(-b, Calculadora.raizQuadrada(delta));
        y = Calculadora.divisao(y, Calculadora.multiplicacao(2, a));

        List<Double> raizes = new ArrayList<>();
            raizes.add(x);
            raizes.add(y);

        for(double i: raizes){
            System.out.println(i);
        }  
        scan.close();      
    }
}
