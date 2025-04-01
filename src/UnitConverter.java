public class UnitConverter {
    public static double CToF(double celsius){
        return (celsius*9/5)+32;
    }
    public static double FToC(double fahrenheit){
        return (fahrenheit-32) * 5/9;
    }
    public static double GToR(double grados){
        return grados*3.14/180;
    }
    public static double RToG(double radianes){
        return radianes*180/3.14;
    }
}
