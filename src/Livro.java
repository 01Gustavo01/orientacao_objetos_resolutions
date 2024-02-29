public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String Titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void exibirDestalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}


public class Principal{
    public static void main(String[]args){
        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDestalhes();
        livro2.exibirDestalhes();
    }
}
