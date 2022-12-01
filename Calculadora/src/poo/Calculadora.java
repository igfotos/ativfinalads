package poo;

public class Calculadora {

    public static double soma (double x, double y){
        return x + y;
    }

    public static double subtracao (double x, double y){
        return x - y;
    }

    public static double multiplicacao(double x, double y){
        return x * y;
    }
    
    public static double divisao(double x, double y){
        return x / y;
    }

    public static double potenciacao(double x, double y){
    	return Math.pow( x, y);
    }

    public static double raizQuadrada(double x) {
    	return Math.sqrt(x);
    }

    public static double piso(double x){
        return Math.floor(x);
    }

    public static double teto(double x){
         return Math.ceil(x);
    }

}
