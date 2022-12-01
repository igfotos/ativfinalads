package poo;

import java.util.Scanner;

public class Piso {


        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();
                
               
                Scanner scanner = new Scanner(System.in);
                
                int numero = -1;
                double x;
    
                while (true){
                
                if(numero == 0)
                        break;
                
                System.out.print("Digite um numero para calcular o piso : ");
                x = scanner.nextDouble();
                
               System.out.println(calculadora.piso(x));
               break;
               
           }
           
           }
                
            }
    
