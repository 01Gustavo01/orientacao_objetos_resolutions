public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }
}

public class Principal{
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Akemi";
        meuAluno.idade = 18;

        meuAluno.exibeInformacoes();
    }
}