package model;



public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int suma(int a, int b){
        return a + b;
    }
    public int resta(int a,int b){
        return a - b;
    }
    public int multiplicacion(int a,int b){
        return a * b;
    }
    public double division(double a, double b){
            return a / b;
    }
    public double potencia(int a, int b){
        return Math.pow(a,b);
    }

    public double raiz(double a,double b){
        return Math.pow(a,1/b);
    }
}
