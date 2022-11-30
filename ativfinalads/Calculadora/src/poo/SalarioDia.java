package poo;

import java.util.Scanner;


public class SalarioDia {
    public static void main(String[] args) {

        Calculadora n = new Calculadora();  
        
        Scanner teclado = new Scanner(System.in);
        
        double x = 0;
        double y = 0;

        System.out.println("Valor do Salário por Dia");
       
        System.out.print("Digite o valor da remuneração por hora: ");
        x = teclado.nextDouble();
       
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        y = teclado.nextDouble();
        
        System.out.print("O valor do salário por dia é de: " + n.multiplicacao(x, y));


       
        teclado.close();
        return;
    }

}
   

