package LojaMidias;

public class Vhs extends Midia {

    public Vhs(int codigo, String descricao, String gravadora, float duracao, String titulo) {
        super(codigo, descricao, gravadora, duracao);
        setTitulo(titulo);
    }

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vhs [titulo=");
        builder.append(titulo);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
