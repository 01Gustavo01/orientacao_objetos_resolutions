public class Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}


public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;

    //construtor e outro métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto){
        precoUnitario -= precoUnitario * (percentualDesconto/100.0);
    }
}


//Serviço
public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    //construtor e outro métodos

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto){
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}