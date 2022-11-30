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
            +                        " \n ou 0 para finalizar o programa"
            );

            operacao = scan.nextInt();

            // if (operacao == 0) {
            //     continuar = false;
            //     return;
            // }

            if(operacao != 0){
                System.out.println("Informe o valor do primeiro número");
                x = scan.nextDouble();

                System.out.println("Informe o valor do segundo número");
                y = scan.nextDouble();
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
                case 0:
                    continuar = false;
                    break;
            }

        }

        scan.close();
        return;
    }


    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, " somado ");
        mapOperacao.put(2, " subtraido ");
        mapOperacao.put(3, " multiplicado ");
        mapOperacao.put(4, " dividido ");
        
        System.out.println("\n o resultado de " + x +  mapOperacao.get(operacao) + " por " 
        + y + " é igual a " + resultado + "\n");
    }

    // static void imprimeResultado(String operacao, double x, double y, double resultado){
    //   System.out.println("O resultado de " + x + operacao + " com " + y + " resulta em " + resultado);
    // }
}
