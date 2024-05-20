package Model;

import com.google.gson.annotations.SerializedName;

public class DVO {
    private String URIerrorMesssage;
    private double amount;
    private double total;

    @SerializedName("base_code")
    private String base;
    @SerializedName("target_code")
    private String target;
    @SerializedName("conversion_rate")
    private double rate;


    private String[][] currencies = {
            {"AED", "Dírham de los Emiratos Árabes Unidos"},
            {"AFN", "Afgano Afgano"},
            {"ALL", "Lek albanés"},
            {"AMD", "Dram armenio"},
            {"ANG", "Florín antilliano de los Países Bajos"},
            {"AOA", "Kwanza angoleño"},
            {"ARS", "Peso Argentino"},
            {"AUD", "Dólar australiano"},
            {"AWG", "Florín de Aruba"},
            {"AZN", "Manat azerbaiyano"},
            {"BAM", "Marcos de Bosnia y Herzegovina"},
            {"BBD", "Dólar de Barbados"},
            {"BDT", "Taka bangladesí"},
            {"BGN", "Lev búlgaro"},
            {"BHD", "Dinar bahreiní"},
            {"BIF", "Franco burundés"},
            {"BMD", "Dólar de las Bermudas"},
            {"BND", "Dólar de Brunéi"},
            {"BOB", "Bolivian Boliviano"},
            {"BRL", "Real brasileño"},
            {"BSD", "Dólar bahameño"},
            {"BTN", "Ngultrum butanés"},
            {"BWP", "Botswana Pula"},
            {"BYN", "Rublo bielorruso"},
            {"BZD", "Dólar de Belice"},
            {"CAD", "Dólar canadiense"},
            {"CDF", "Franco congoleño"},
            {"CHF", "Franco suizo"},
            {"CLP", "Peso Chileno"},
            {"CNY", "Renminbi chino"},
            {"COP", "Peso Colombiano"},
            {"CRC", "Colón costarricense"},
            {"CUP", "Peso Cubano"},
            {"CVE", "Escudo caboverdiano"},
            {"CZK", "Corona checa"},
            {"DJF", "Franco de Djibouti"},
            {"DKK", "Corona danesa"},
            {"DOP", "Peso Dominicano"},
            {"DZD", "Dinar argelino"},
            {"EGP", "Libra egipcia"},
            {"ERN", "Nakfa eritrea"},
            {"ETB", "Birr etíope"},
            {"EUR", "Euro"},
            {"FJD", "Dólar de Fiji"},
            {"FKP", "Libra de las Islas Malvinas"},
            {"FOK", "Corona feroesa"},
            {"GBP", "Libra esterlina"},
            {"GEL", "Lari georgiano"},
            {"GGP", "Libra de Guernsey"},
            {"GHS", "Cedi ghanés"},
            {"GIP", "Libra de Gibraltar"},
            {"GMD", "Dalasi gambiano"},
            {"GNF", "Franco guineano"},
            {"GTQ", "Quetzal guatemalteco"},
            {"GYD", "Dólar guyanés"},
            {"HKD", "Dólar de Hong Kong"},
            {"HNL", "Lempira hondureño"},
            {"HRK", "Kuna croata"},
            {"HTG", "Gourde haitiano"},
            {"HUF", "Florín húngaro"},
            {"IDR", "Rupia indonesia"},
            {"ILS", "Nuevo Shekel israelí"},
            {"IMP", "Libra de Manx"},
            {"INR", "Rupia india"},
            {"IQD", "Dinar iraquí"},
            {"IRR", "Rial iraní"},
            {"ISK", "Corona islandesa"},
            {"JEP", "Libra de Jersey"},
            {"JMD", "Dólar jamaiquino"},
            {"JOD", "Dinar jordano"},
            {"JPY", "Yen japonés"},
            {"KES", "Chelín keniano"},
            {"KGS", "Kirguistán som"},
            {"KHR", "Riel camboyano"},
            {"KID", "Dólar de Kiribati"},
            {"KMF", "Franco de las Comoras"},
            {"KRW", "Won surcoreano"},
            {"KWD", "Dinar kuwaití"},
            {"KYD", "Dólar de las Islas Caimán"},
            {"KZT", "Tenge kazajo"},
            {"LAK", "Lao Kip"},
            {"LBP", "Libra libanesa"},
            {"LKR", "Rupia de Sri Lanka"},
            {"LRD", "Dólar liberiano"},
            {"LSL", "Lesotho Loti"},
            {"LYD", "Dinar libio"},
            {"MAD", "Dírham marroquí"},
            {"MDL", "Leu moldavo"},
            {"MGA", "Ariary malgache"},
            {"MKD", "Denar macedonio"},
            {"MMK", "Kyat birmano"},
            {"MNT", "Tögrög mongol"},
            {"MOP", "Pataca macaense"},
            {"MRU", "Ouguiya mauritano"},
            {"MUR", "Rupia mauriciana"},
            {"MVR", "Rufiyaa de Maldivas"},
            {"MWK", "Kwacha malauí"},
            {"MXN", "Peso Mexicano"},
            {"MYR", "Ringgit malayo"},
            {"MZN", "Metical mozambiqueño"},
            {"NAD", "Dólar namibio"},
            {"NGN", "Naira nigeriana"},
            {"NIO", "Córdoba nicaragüense"},
            {"NOK", "Corona noruega"},
            {"NPR", "Rupia nepalí"},
            {"NZD", "Dólar neozelandés"},
            {"OMR", "Rial omaní"},
            {"PAB", "Balboa panameño"},
            {"PEN", "Sol Peruano"},
            {"PGK", "Kina de Papúa Nueva Guinea"},
            {"PHP", "Peso filipino"},
            {"PKR", "Rupia pakistaní"},
            {"PLN", "Złoty polaco"},
            {"PYG", "Guaraní paraguayo"},
            {"QAR", "Riyal catarí"},
            {"RON", "Leu rumano"},
            {"RSD", "Dinar serbio"},
            {"RUB", "Rublo ruso"},
            {"RWF", "Franco ruandés"},
            {"SAR", "Riyal saudí"},
            {"SBD", "Dólar de las Islas Salomón"},
            {"SCR", "Rupia de Seychelles"},
            {"SDG", "Libra sudanesa"},
            {"SEK", "Corona sueca"},
            {"SGD", "Dólar de Singapur"},
            {"SHP", "Libra de Santa Elena"},
            {"SLE", "Sierra Leona Leona"},
            {"SOS", "Chelín somalí"},
            {"SRD", "Dólar de Surinam"},
            {"SSP", "Libra sursudanesa"},
            {"STN", "Santo Tomé y Príncipe Dobra"},
            {"SYP", "Libra siria"},
            {"SZL", "Esuatini Lilangeni"},
            {"THB", "Baht tailandés"},
            {"TJS", "Somoni tayiko"},
            {"TMT", "Turkmenistán Manat"},
            {"TND", "Dinar tunecino"},
            {"TOP", "Paʻanga de Tonga"},
            {"TRY", "Lira turca"},
            {"TTD", "Dólar de Trinidad y Tobago"},
            {"TVD", "Dólar de Tuvalu"},
            {"TWD", "Nuevo dólar taiwanés"},
            {"TZS", "Chelín tanzano"},
            {"UAH", "Grivna ucraniana"},
            {"UGX", "Chelín ugandés"},
            {"USD", "Dólar de los Estados Unidos"},
            {"UYU", "Peso Uruguayo"},
            {"UZS", "Uzbeko So'm"},
            {"VES", "Bolívar Soberano venezolano"},
            {"VND", "Đồng vietnamita"},
            {"VUV", "Vanuatu Vatu"},
            {"WST", "Tālā de Samoa"},
            {"XAF", "Franco CFA centroafricano"},
            {"XCD", "Dólar del Caribe Oriental"},
            {"XDR", "Derechos Especiales de Giro"},
            {"XOF", "Franco CFA de África Occidental"},
            {"XPF", "Franco CFP"},
            {"YER", "Rial yemení"},
            {"ZAR", "Rand sudafricano"},
            {"ZMW", "Kwacha zambiano"},
            {"ZWL", "Dólar zimbabuense"}
    };

    //Contructor


    public DVO() {
    }

    public DVO(String base, String target, double rate) {
        this.base = base;
        this.target = target;
        this.rate = rate;
    }

    //Setter & Getter
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getURIErrorMesssage() {
        return URIerrorMesssage;
    }

    public void setURIErrorMesssage(String URIerrorMesssage) {
        this.URIerrorMesssage = URIerrorMesssage;
    }

    public String[][] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[][] currencies) {
        this.currencies = currencies;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
         return "Moneda base: "+ base + "\nmoneda target: " + target + "\ntasa de cambio: " + rate + "\nmonto total: " + total;
    }
}
