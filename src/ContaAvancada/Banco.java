package ContaAvancada;

public class Banco {

    private int codigo;
    private String nomeBanco;
    private int numeroAgencias;

    public Banco(int codigo, String nomeBanco, int numeroAgencias) {
        super();
        setCodigo(codigo);
        setnomeBanco(nomeBanco);
        setNumeroAgencias(numeroAgencias);
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getnomeBanco() {
        return nomeBanco;
    }
    public void setnomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    public int getNumeroAgencias() {
        return numeroAgencias;
    }
    public void setNumeroAgencias(int numeroAgencias) {
        this.numeroAgencias = numeroAgencias;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Banco [codigo=");
        builder.append(codigo);
        builder.append(", nomeBanco=");
        builder.append(nomeBanco);
        builder.append(", numeroAgencias=");
        builder.append(numeroAgencias);
        builder.append("]");
        return builder.toString();
    }

}