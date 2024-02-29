public interface Tabuada {
    void mostrarTabuada(int numero);
}

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero){
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for(int i = i; i<= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

//Teste
public class TesteTabuadaMultiplicacao{
    public static void main(String[]args){
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);
    }
}

