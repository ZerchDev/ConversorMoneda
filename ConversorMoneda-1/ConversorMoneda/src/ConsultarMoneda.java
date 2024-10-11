import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3d4fbcdd8e0f73137a99d2ee/pair/"+monedaBase+"/"+monedaTarget);
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String>response=client.send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Monedas.class);
        }
        catch (Exception e){
            throw new RuntimeException("no econtre la moneda");
        }
    }
}
