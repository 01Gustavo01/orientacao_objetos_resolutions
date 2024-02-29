public interface Calculavel {
    double calculavelPrecoFinal();
}

public class Livro extends Produto implements Calculavel{
    private String autor;

    public double calcularPrecoFinal(){
        return preco * 0.9;
    }
}

public class ProdutoFisico extends Produto implements Calculavel{
    public double calcularPrecoFinal(){
        return preco * 1.05;
    }
}