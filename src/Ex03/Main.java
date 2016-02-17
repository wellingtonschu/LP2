package Ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Calculadora c = new Calculadora();

        System.out.println("-Escolha uma opção-");
        System.out.println("1. Soma");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.println("0. Sair");
        System.out.print("Operação: ");

        c.setOpcao(in.nextInt());

        while (c.getOpcao() != 0) {
            System.out.println("Qual o primeiro numero: ");
            c.setNum1(in.nextInt());
            System.out.println("Qual o segundo numero: ");
            c.setNum2(in.nextInt());

            if (c.getOpcao() == 1 ) {
                int operacao = c.som(c.getNum1(), c.getNum2());
                System.out.printf("\nO resultado da soma é: %d\n", operacao);
                break;
            }
            else if (c.getOpcao() == 2) {
                int operacao = c.sub(c.getNum1(), c.getNum2());
                System.out.printf("\nO resultado da subtração é: %d\n", operacao);
                break;
            }
            else if (c.getOpcao() == 3) {
                int operacao = c.mult(c.getNum1(), c.getNum2());
                System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
                break;
            }
            else if (c.getOpcao() == 4) {
                int operacao = c.div(c.getNum1(), c.getNum2());
                System.out.printf("\nO resultado da divisão é: %d\n", operacao);
                break;
            }
            else{
                System.out.println("????");
                break;
            }

        }

        in.close();
    }

}
