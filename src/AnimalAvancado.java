public class AnimalAvancado {
    public void emitirSom(){
        System.out.println("Som do animal");
    }
}

public class Cachorro extends AnimalAvancado{
    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando o rabo");
    }
}

public class Gato extends AnimalAvancado{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
    public void arranharMoveis(){
        System.out.println("Gato aranhando movéis");
    }
}


public class TesteAnimais{
    public static void main(String[]args){
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato;
        gato.emitirSom();
        gato.arranharMoveis();
    }
}