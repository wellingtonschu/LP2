package ContaBanco;

public class Main {

    public static void main(String[] args) {

        ContaSimples cs = new ContaSimples("Banco do Brasil", 13793, 1236542, 1250.3, 1323.5);
        ContaEspecial ce = new ContaEspecial("Banco do Brasil", 12342, 143223, 124544.76, 4, 10000.5);

        System.out.println(cs);
        System.out.println(ce);

    }

}