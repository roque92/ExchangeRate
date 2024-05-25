package Connection;

import Model.SingletonDVO;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class APIClient {
    private static final SingletonDVO dvo = SingletonDVO.obtenerInstancia();
    private static final Gson gson = new Gson();



    public void APIConnection(String base, String target){
        try {
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create( Enviroment.BASE_URL + base + "/" + target))
                    .build();
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
           String responseBody = response.body();
           actualizarDVO(responseBody);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void actualizarDVO(String responseBody) {
        // Actualiza el objeto DVO con los datos del JSON
        SingletonDVO nuevoDVO = gson.fromJson(responseBody, SingletonDVO.class);
        dvo.setRate(nuevoDVO.getRate());
    }


}
