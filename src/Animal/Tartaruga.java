package Animal;

public class Tartaruga extends Reptil {

    private String raca;

    public Tartaruga(String nome, int patas, String raca) {
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
        builder.append("Tartaruga [raca=");
        builder.append(raca);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
