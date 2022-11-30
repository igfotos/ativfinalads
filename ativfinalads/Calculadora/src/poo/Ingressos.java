package poo;

import java.util.Scanner;

public class Ingressos {
    
    public static void main(String[] args) {

        Calculadora n = new Calculadora();  
        
        Scanner teclado = new Scanner(System.in);
        
        double x = 0;
        double y = 0;

        System.out.println("Quantidade de ingressos disponíveis");
       
        System.out.print("Digite o valor da carga total de ingressos: ");
        x = teclado.nextDouble();
       
        System.out.print("Digite a quantidade de ingressos vendidos: ");
        y = teclado.nextDouble();
        
        System.out.print("A quantidade de ingressos disponíveis é de: " + n.subtracao(x, y));


       
        teclado.close();
        return;
    }

}
