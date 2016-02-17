package ContaBanco;

public class ContaSimples extends Conta {

    private double saldoPoupanca;

    public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
        super(banco, agencia, numeroconta, saldo);
        setSaldoPoupanca(saldoPoupanca);
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean saquePoupanca(double valor) {
        if(valor > 0 && saldoPoupanca - valor > 0) {
            setSaldo(saldoPoupanca -= valor);
            return true;
        }
        else
            return false;
    }

    public boolean depositoPoupanca(double valor) {
        if(valor > 0) {
            setSaldo(saldoPoupanca += valor);
            return true;
        }
        else
            return false;
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
