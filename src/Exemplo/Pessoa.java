package Exemplo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String nomeCompleto() {
        StringBuilder builder = new StringBuilder();
        builder.append(getNome());
        builder.append(" ");
        builder.append(getSobrenome());
        return builder.toString();
    }

    public int anoNascimento(){
        Date data = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        String s = "";
        try {
            s = df.format(data);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return (Integer.parseInt(s) - getIdade());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pessoa [nome=");
        builder.append(nome);
        builder.append(", sobrenome=");
        builder.append(sobrenome);
        builder.append(", idade=");
        builder.append(idade);
        builder.append("]");
        return builder.toString();
    }

}