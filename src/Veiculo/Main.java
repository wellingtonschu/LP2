package Veiculo;

public class Main {

    public static void main(String[] args) {

        Caminhao ca = new Caminhao(true, 7);
        Carro cr = new Carro(true, 5);
        Moto mo = new Moto(true, 1200);

        System.out.println(ca);
        System.out.println(cr);
        System.out.println(mo);

    }

}
