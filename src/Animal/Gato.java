package Animal;

public class Gato extends Mamifero {

    private String raca;

    public Gato(String nome, int patas, String raca) {
        super(nome, patas);
        setRaca(raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gato [raca=");
        builder.append(raca);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
