package CarroMotoPessoa;

public class Pessoa {

    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(!"".equals(nome))
            this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        if(!"".equals(endereco))
            this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pessoa - Nome= ");
        builder.append(nome);
        builder.append("\nEndereço= ");
        builder.append(endereco);
        builder.append("\n");
        return builder.toString();
    }

}