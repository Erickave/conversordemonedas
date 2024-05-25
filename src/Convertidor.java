import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convertidor {
    public void conversor(String de, String a, double monto){
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/d8472d044d3d21835e428cf4/latest/" + de))
                    .build();

            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();
            Respuesta respuesta = gson.fromJson(json, Respuesta.class);

            if (a.equalsIgnoreCase("pen")){
                System.out.println("La equivalencia en soles es: " + (respuesta.conversionRates().pen() * monto));
            }
            if (a.equalsIgnoreCase("usd")){
                System.out.println("La equivalencia en dólares es: " + (respuesta.conversionRates().usd() * monto));
            }
            if (a.equalsIgnoreCase("eur")){
                System.out.println("La equivalencia en euros es: " + (respuesta.conversionRates().eur() * monto));
            }

        }
        catch (Exception e) {
            System.out.println("Dio un error!");


        }

    }
}
