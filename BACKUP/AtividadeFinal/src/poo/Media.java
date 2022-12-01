package poo;
import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
        Calculadora n = new Calculadora();  
       
        Scanner teclado = new Scanner(System.in);
        
        double x = 0;
        double y = 0;
 
        System.out.println("==========CÁLCULO DE MÉDIA============");
        
        System.out.println("Insira a primeira nota: ");
        x = teclado.nextDouble();
        
        System.out.println("Insira a Segunda Nota");
        y = teclado.nextDouble();
        
        System.out.println("A média do aluno é: " + Calculadora.soma(x, y)/2);
        
	}
}