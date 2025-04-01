package clases;

public class Producto {

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double multiplicar(double a, double b, double c){
        return a * b * c;
    }

    public static int potencia(int base, int exponente){
        return (int) Math.pow(base, exponente);
    }
}
