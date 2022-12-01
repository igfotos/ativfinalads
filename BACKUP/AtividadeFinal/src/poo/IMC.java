package poo;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
		Calculadora n = new Calculadora();  
	       
        Scanner teclado = new Scanner(System.in);
        
        double x = 0;
        double y = 0;
 
        System.out.println("==========CÁLCULO DE IMC============");
        
        System.out.println("Insira sua Altura: ");
        x = teclado.nextDouble();
        
        System.out.println("Insira seu peso corporal: ");
        y = teclado.nextDouble();
        
        System.out.println("O SEU IMC É: " + y/Calculadora.multiplicacao(x, x));
        
	}
}
