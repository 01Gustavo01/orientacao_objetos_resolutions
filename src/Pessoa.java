public class Pessoa {
    void saudacao(){
        System.out.println("Olá, mundo!");
    }
}

public class Principal{
    public static void main(String[]args){

        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();
    }
}