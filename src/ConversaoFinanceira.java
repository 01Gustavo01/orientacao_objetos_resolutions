public interface ConversaoFinanceira {
    void converterDolarParaReal(double valorDolar);
}

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar){
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}

public class TesteConversorMoeda{
    public static void main(String[]args){
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);
    }
}