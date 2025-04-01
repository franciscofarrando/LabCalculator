package main;

import clases.Division;
import clases.Producto;

public class Main {

    public static void main(String[] args) {

        //Producto
        double res_multiplicarDecimal = Producto.multiplicar(2.4, 6.1);

        System.out.println(res_multiplicarDecimal);

        int res_multiplicarEntero = Producto.multiplicar(5, 2);

        System.out.println(res_multiplicarEntero);

        double res_mult_3_valores = Producto.multiplicar(2.5, 5.3, 3.7);

        System.out.println(res_mult_3_valores);

        //Division

        double dividirDecimales = Division.dividir(2.3, 4.5);

        System.out.println(dividirDecimales);

        int dividirEnteros = Division.dividir(10, 2);

        System.out.println(dividirEnteros);

        double valorInverso = Division.getInverso(5.7);

        System.out.println(valorInverso);

        int potencia = Producto.potencia(2, 3);

        System.out.println(potencia);


    }
}