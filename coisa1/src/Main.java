class Coisa{
    String nome;

    Coisa(String nome){ // construtor
        this.nome = nome;
    }
}


public class Main {
    public static void main(String[] args) {
        Coisa x; // x é uma variável do tipo coisa
        x = new Coisa("Juca"); // new coisa cria um objeto e x = joga dentro de x
        Coisa y = x;
        System.out.println("x = "+x+" - "+x.nome);
        System.out.println("y = "+y+" - "+y.nome);

        y.nome = "Maria";
        System.out.println("x = "+x+" - "+x.nome);
        System.out.println("y = "+y+" - "+y.nome);

        y = new Coisa("Zeca");
        System.out.println("x = "+x+" - "+x.nome);
        System.out.println("y = "+y+" - "+y.nome);

        y = null;
        System.out.println("x = "+x+" - "+x.nome);
        System.out.println("y = "+y+" - "+y.nome);
    }
}