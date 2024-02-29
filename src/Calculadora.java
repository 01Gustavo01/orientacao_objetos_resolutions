public class Calculadora {
    public int dobrarnumero(int numero){
        return numero * 2;
    }
}

public class Principal{
    public satic void main(String[]args){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarnumero(5);
        System.out.println(resultado);
    }
}
