package Model;

public class Calculo {
private static final SingletonDVO singletonDVO = SingletonDVO.obtenerInstancia();

public void calculate(double amount, double rate){
    double result = amount * rate;
    singletonDVO.setTotal(result);

}

public String numberFormat(double number){

    return String.format("%.2f", number);
}

}
