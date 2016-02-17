package ContaAvancada;

public class ContaSimples extends ContaBancaria {

    private double saldoPoupanca;

    public ContaSimples(int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo,
                        String nome, String endereco, double saldoPoupanca) {
        super(codigo, nomeBanco, numeroAgencias, agencia, numeroDaConta, saldo, nome, endereco);
        setSaldo(saldoPoupanca);
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor){
        boolean retorno;
        if(valor > 0){
            retorno = true;
            setSaldoPoupanca(valor+getSaldoPoupanca());
        }else
            retorno = false;
        return false;
    }

    public boolean saquePoupanca(double valor){
        boolean retorno;
        if(valor <= getSaldoPoupanca()){
            retorno = true;
            setSaldoPoupanca(getSaldoPoupanca() - valor);
        }else
            retorno = false;
        return retorno;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaSimples [saldoPoupanca=");
        builder.append(saldoPoupanca);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}