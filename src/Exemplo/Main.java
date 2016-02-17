package Exemplo;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.setNome ("Wellington");
        p.setSobrenome("Schütz");
        p.setIdade(24);

        System.out.println(p);

        System.out.println(p.nomeCompleto());

        System.out.println(p.anoNascimento());

    }

}