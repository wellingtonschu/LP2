package Ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Numeros n = new Numeros();

        System.out.print("Primeiro Número: ");
        n.setNum1(in.nextInt());
        System.out.print("Segundo Número: ");
        n.setNum2(in.nextInt());

        System.out.println(n.txtInvert());

        System.out.println(n.exibNum());

        in.close();

    }

}