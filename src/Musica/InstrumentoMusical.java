package Musica;

public class InstrumentoMusical {

    private int cod;
    private String nomeMusico;

    public InstrumentoMusical(int cod, String nomeMusico) {
        super();
        setCod(cod);
        setNomeMusico(nomeMusico);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeMusico() {
        return nomeMusico;
    }

    public void setNomeMusico(String nomeMusico) {
        this.nomeMusico = nomeMusico;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("InstrumentoMusical [cod=");
        builder.append(cod);
        builder.append(", nomeMusico=");
        builder.append(nomeMusico);
        builder.append("]");
        return builder.toString();
    }

}