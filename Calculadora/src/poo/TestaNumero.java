package poo;

import java.util.List;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {

        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while(continuar) {
            
            int operacao = 0;

            System.out.println("Digite a operacao que deseja realizar: "
            +" \n 1.Para soma  " + "  2.Para subtracao "
            +" \n 3.Para multiplicado  " + " 4.Para divisao "
            +" \n 5.Para potenciacao  " + "  6.Para raiz quadrada "
            +" \n 7.Para piso  " + "  8.Para teto "
            +" \n 9.Para bhaskara  " + "  10.Para juros simples "
            +" \n 11.Ingressos  " + "  12.Salario do dia "
            +" \n ou 0.para finalizar o programa"
            );

            operacao = scan.nextInt();

            switch (operacao) {
                case 1:
				System.out.println(Calculadora.soma(input("Digite o primeiro numero: "), input("Digite o segundo numero: ")));
                    break;
                case 2:
				System.out.println(Calculadora.subtracao(input("Digite o primeiro numero: "), input("Digite o segundo numero: ")));
                    break;
                case 3:
				System.out.println(Calculadora.multiplicacao(input("Digite o primeiro numero: "), input("Digite o segundo numero: ")));
                    break;
                case 4:
				    System.out.println(Calculadora.divisao(input("Digite o primeiro numero: "), input("Digite o segundo numero: ")));
                    break;
                case 5:
				    System.out.println(Calculadora.potenciacao(input("Digite o primeiro numero: "), input("Digite o segundo numero: ")));
                    break;
                case 6:
				    System.out.println(Calculadora.raizQuadrada(input("Digite um numero: ")));
				    break;
                case 7:
				    System.out.println((int)Calculadora.piso(input("Digite um numero: ")));
				    break;
                case 8:
                    System.out.println((int)Calculadora.teto(input("Digite um numero: ")));
                    break;
                case 9:
                    List<Double> valores = Raizes.bhaskara(input("Digite o coeficiente a: ") , input("Digite o coeficiente b: "), input("Digite o coeficiente c: "));
                    for(double i: valores){
                        System.out.println(i);
                    }
                    break;
                case 10:
                    System.out.println("O juros é: " + JurosSimples.juros(input("Digite o capital: "), input("Digite a taxa de juros: "), input("Digite o tempo: ")));
                    break;
                case 11:
                    System.out.println("Quantidade de ingressos disponiveis");
                    System.out.println("A quantidade de ingressos disponiveis e de: " + Ingressos.ingressos(input("Digite o valor da carga total de ingressos: "), input("Digite a quantidade de ingressos vendidos: ")));
                    break;
                case 12:
                    System.out.println("Valor do salario por dia");
                    System.out.println("O valor do salario por dia e de: " + SalarioDia.salario(input("Digite o valor da remuneracao por hora: "), input("Digite a quantidade de horas trabalhadas: ")));
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Calculadora fechada. ");
                    break;
            }

        }

        scan.close();
        return;
    }

    private static double input(String mensagem){
        Scanner scan = new Scanner(System.in);
            System.out.println(mensagem);
            return scan.nextDouble();
    }
    
}
