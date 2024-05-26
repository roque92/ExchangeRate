package Connection;

public class Enviroment {

    public static final String URI = "https://v6.exchangerate-api.com/v6/";
    public static final String API_KEY = {{secrets.API_KEY}};
    public static final String URI_COMP= "/pair/";
    public static final String BASE_URL = URI+API_KEY+URI_COMP;
}
