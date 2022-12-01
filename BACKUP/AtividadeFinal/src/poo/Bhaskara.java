package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args){
        
        Calculadora n = new Calculadora();

        double a, b, c;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calculo bhaskara: ");

        System.out.println("Digite o coeficiente a: ");
        a = scan.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        b = scan.nextDouble();

        System.out.println("Digite o coeficiente c: ");
        c = scan.nextDouble();

        double delta = n.potenciacao(b, 2) - n.multiplicacao(n.multiplicacao(a, c), 4);

        double x = n.soma(-b, n.raizQuadrada(delta));
        x = n.divisao(x, n.multiplicacao(2, a));

        double y = n.subtracao(-b, n.raizQuadrada(delta));
        y = n.divisao(y, n.multiplicacao(2, a));

        List<Double> raizes = new ArrayList<>();
            raizes.add(x);
            raizes.add(y);

        for(double i: raizes){
            System.out.println(i);
        }  
        scan.close();      
    }
}
