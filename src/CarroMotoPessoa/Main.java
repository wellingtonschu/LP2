package CarroMotoPessoa;

public class Main {

    public static void main(String[] args) {

        Carro c = new Carro();

        c.dono.setNome("Alex");
        c.dono.setEndereco("Rua B");
        c.motor.setMarca("AP200");
        c.motor.setPotencia(1200);
        c.motor.setCilindradas(1500);
        c.motor.setCombustivel("Gasolina");
        c.setFabricante("Fiat");
        c.setModelo("Gol");
        c.setCor("Vermelho");
        c.setAno(2007);

        System.out.println(c);

    }

}
