package Model;

public class Conversion {

    public void amountExchanged(double rate, double amount) {
        DVO dvo = new DVO();
        System.out.println(dvo.getRate());
        System.out.println(dvo.getAmount());

        //dvo.setTotal(rate*amount);
    }

}
