package Ex01;

import java.util.Scanner;
import Exemplo.Pessoa;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Nome: ");
        p.setNome(in.nextLine());
        System.out.print("Sobrenome: ");
        p.setSobrenome(in.nextLine());

        System.out.println("Nome completo: " + p.nomeCompleto());

        in.close();
    }

}
