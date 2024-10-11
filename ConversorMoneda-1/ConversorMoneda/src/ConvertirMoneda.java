import java.util.Locale;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner teclado1){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas=consulta.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("la tasa de conversion\n1"+monedaBase+" = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("ingrese la cantidad de "+monedaBase);
        cantidad=Double.parseDouble(teclado1.nextLine());
        cantidadConvertida=cantidad*monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+monedas.target_code());

    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta,Scanner teclado1){
        System.out.println("ingrese el codigo de la moneda base");
        String monedaBase= teclado1.next().toUpperCase();
        System.out.println("ingrese la moneda objetivo");
        String monedaObjetivo= teclado1.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetivo,consulta,teclado1);
    }
}
