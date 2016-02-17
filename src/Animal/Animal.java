package Animal;

public class Animal {

    private String nome;

    public Animal(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Animal [nome=");
        builder.append(nome);
        builder.append("]");
        return builder.toString();
    }

}