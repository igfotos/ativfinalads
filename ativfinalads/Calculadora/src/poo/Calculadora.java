package poo;

public class Calculadora {
    private double x;

    private double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double soma (double x, double y){
        setX(x + y);
        return getX();
    }

    public double subtracao (double x, double y){
        setX(x - y);
        return getX();
    }

    public double multiplicacao(double x, double y){
            return x * y;
    }
    
    public double divisao(double x, double y){
        return x / y;
    }
    public double potenciacao(double x, double y){
    	return Math.pow( x, y);
    }
    public double raizQuadrada(double x) {
    	return Math.sqrt(x);
    }
}
