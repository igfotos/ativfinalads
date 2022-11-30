package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Calculadora n = new Calculadora();

        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while(continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("Digite a operação que deseja realizar: "
            +                        " \n 1 para soma "
            +                        " \n 2 para subtração "
            +                        " \n 3 para multiplicado"
            +                        " \n 4 para divisao"
            +                        " \n 5 para potenciacao"
            +                        " \n 6 para raiz quadrada"            
            +                        " \n ou 0 para finalizar o programa"            		
            );

            operacao = scan.nextInt();

            // if (operacao == 0) {
            //     continuar = false;
            //     return;
            // }
            
            if(operacao == 1) {
          	  System.out.println("Insira o primeiro número: ");
          	   x = scan.nextDouble();
          	  System.out.println("Insira o segundo número: ");
          	   y = scan.nextDouble();
          }
            else if(operacao == 2) {
              System.out.println("Insira o primeiro número: ");
           	   x = scan.nextDouble();
              System.out.println("Insira o segundo número: ");
               y = scan.nextDouble();
         }
            else if(operacao == 3) {
              System.out.println("Insira o primeiro número: ");
           	   x = scan.nextDouble();
           	  System.out.println("Insira o segundo número: ");
           	   y = scan.nextDouble();
         }  
            else if(operacao == 4) {
              System.out.println("Insira o primeiro número: ");
           	   x = scan.nextDouble();
           	  System.out.println("Insira o segundo número: ");
           	   y = scan.nextDouble();
         }
            else if(operacao == 5) {
              System.out.println("Insira o primeiro número: ");
           	   x = scan.nextDouble();
           	  System.out.println("Insira o segundo número: ");
           	   y = scan.nextDouble();
         } 
            else if( operacao == 6) {
        	  System.out.println("Insira o número: ");
        	   x = scan.nextDouble();
         } 
            else if(operacao == 0) {
            	System.out.println("O PROGRAMA FOI FINALIZADO");
            }
            switch (operacao) {
                case 1:
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;
                case 2:
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;
                case 3:
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                    break;
                case 4:
                    imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    break;
                case 5:
                	imprimeCalculadora(operacao, n.potenciacao(x, y), x, y);
                case 6:
                	imprimeCalculadora(operacao, n.raizQuadrada(x), x, 0);
                case 0:
                    continuar = false;
                    break;
            }

        }

        scan.close();
        return;
    }


    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        System.out.println("O resultado do cálculo é: " + resultado);
    
    }

    // static void imprimeResultado(String operacao, double x, double y, double resultado){
    //   System.out.println("O resultado de " + x + operacao + " com " + y + " resulta em " + resultado);
    // }
}
