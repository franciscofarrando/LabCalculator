public class Main {

    public static void main(String[] args) {

        int suma = Suma.sumar(2 , 3);
        double sumaDecimales = Suma.sumar(2.5, 3.7);
        double suma3Decimales = Suma.sumar(1.5, 0.3, 4.2);

        int resta = Resta.restar(4 , 2);
        double restaDecimales = Resta.restar(3.8, 1.5);
        double resta3Decimales = Resta.restar(2.8, 1.9, 0.5);

        System.out.println( suma);
        System.out.println(sumaDecimales);
        System.out.println(suma3Decimales);
        System.out.println( resta);
        System.out.println(restaDecimales);
        System.out.println(resta3Decimales);

        System.out.println("Hello, World!");
    }


}