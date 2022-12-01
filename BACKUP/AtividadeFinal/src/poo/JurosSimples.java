package poo;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args){
        
        Calculadora n = new Calculadora();        

        double c, i, t, j;

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo de juros: ");

        System.out.print("Digite o capital: ");
        c = scan.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        i = scan.nextDouble();

        System.out.print("Digite a tempo : ");
        t = scan.nextDouble();

        j = n.multiplicacao(n.multiplicacao(i, t), c);

        System.out.println("O juros e: " + j);
        
        scan.close();
    }
}
