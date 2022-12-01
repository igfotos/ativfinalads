package poo;

public class JurosSimples {
    
    public static double juros(double c, double i, double t){
        double j = Calculadora.multiplicacao(Calculadora.multiplicacao(i, t), c);
        return j;
    }
}
