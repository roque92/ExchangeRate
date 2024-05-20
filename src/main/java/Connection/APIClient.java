package Connection;

import java.net.URI;

import Model.Conversion;
import Model.DVO;
import com.google.gson.Gson;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class APIClient {
    static Gson gson = new Gson();


    public static DVO connection(String base, String target){

        DVO dvo = new DVO();
       try {
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create( Enviroment.BASE_URL + base + "/" + target))
                    .build();
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
           String responseBody = response.body();
            dvo = gson.fromJson(responseBody, DVO.class);
        } catch (Exception e) {
            dvo.setURIErrorMesssage(e.getMessage());
        }
        return dvo;

    }


}
