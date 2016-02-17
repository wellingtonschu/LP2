package Musica;

public class Violao extends Cordas {

    private String tipo;

    public Violao(int cod, String nomeMusico, String material, String tipo) {
        super(cod, nomeMusico, material);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Violao [tipo=");
        builder.append(tipo);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
