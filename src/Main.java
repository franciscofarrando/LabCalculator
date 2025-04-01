public class Main {

    public static void main(String[] args) {
        int module = Module.module(2,3);
        System.out.println("Modulo: " + module);
        double absolute = Module.absolute(-2.33);
        System.out.println("Absolute: " + absolute);
        double celsius = UnitConverter.FToC(23);
        System.out.println(celsius);
        double fahrenheit = UnitConverter.CToF(23);
        System.out.println(fahrenheit);
        double grados = UnitConverter.GToR(34);
        System.out.println(grados);
        double radianes = UnitConverter.RToG(56);
        System.out.println(radianes);

    }
}