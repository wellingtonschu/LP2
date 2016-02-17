package ContaAvancada;

public class CartaoDeCredito{

    private int numero;
    private String operadora;
    private double limiteCartao;
    private String tipoDoCartao;

    public CartaoDeCredito(int numero, String operadora, double limiteCartao, String tipoDoCartao) {
        setNumero(numero);
        setOperadora(operadora);
        setlimiteCartao(limiteCartao);
        setTipoDoCartao(tipoDoCartao);
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getOperadora() {
        return operadora;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    public double getlimiteCartao() {
        return limiteCartao;
    }
    public void setlimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
    public String getTipoDoCartao() {
        return tipoDoCartao;
    }
    public void setTipoDoCartao(String tipoDoCartao) {
        this.tipoDoCartao = tipoDoCartao;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CartaoDeCredito [numero=");
        builder.append(numero);
        builder.append(", operadora=");
        builder.append(operadora);
        builder.append(", limiteCartao=");
        builder.append(limiteCartao);
        builder.append(", tipoDoCartao=");
        builder.append(tipoDoCartao);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}