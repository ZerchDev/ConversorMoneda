import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        Scanner teclado1=new Scanner(System.in);
        ConsultarMoneda consulta=new ConsultarMoneda();

        int opcion=0;
        while (opcion!=8){
            System.out.println("""
                    elige una opcion
                    1: dolares a pesos Argentino
                    2: Peso argentino a dolares
                    3: dolares a Real brasileño
                    4: Real brasileño a dolares
                    5: dolares a pesos colombianos
                    6: pesos colombianos a dolares
                    7: convertir otra moneda
                    8: salir
                    """);
            opcion=teclado1.nextInt();
            teclado1.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","MXN",consulta,teclado1);
                    break;
                case 2:
                    ConvertirMoneda.convertir("MXN","USD",consulta,teclado1);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,teclado1);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,teclado1);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,teclado1);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,teclado1);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,teclado1);
                    break;
                case 8:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;


            }
        }









        /*Scanner teclado=new Scanner(System.in);


        System.out.println("escribe la cantidad que deseas convertir");
        var cantidad=teclado.nextLine();

        //https://v6.exchangerate-api.com/v6/3d4fbcdd8e0f73137a99d2ee/pair/EUR/DZD/10
        String direccion="https://v6.exchangerate-api.com/v6/3d4fbcdd8e0f73137a99d2ee/pair/EUR/DZD/"+cantidad;

        //para buscar esto en javadoc11,HttpRequest
        //link inicial de la api,
        // https://v6.exchangerate-api.com/v6/3d4fbcdd8e0f73137a99d2ee/latest/USD
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        //para esto buscar,HttpResponse
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        //para veralgo hay que imprimir
        //System.out.println(response.body().toString("conversion_result"));
        */

    }
}
