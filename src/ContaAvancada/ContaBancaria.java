package ContaAvancada;

public class ContaBancaria {

    protected Banco Banco;
    private int agencia;
    private int numeroDaConta;
    private double saldo;
    protected Pessoa correntista;

    public ContaBancaria(int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo, String nome, String endereco) {
        super();
        Banco = new Banco(codigo,nomeBanco,numeroAgencias);
        setAgencia(agencia);
        setNumeroDaConta(numeroDaConta);
        setSaldo(saldo);
        correntista = new Pessoa(nome, endereco);
    }

    public Banco getBanco() {
        return Banco;
    }
    public void setBanco(Banco banco) {
        Banco = banco;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Pessoa getCorrentista() {
        return correntista;
    }
    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }
    public boolean deposito(double valor){
        boolean retorno;
        if(valor > 0){
            retorno = true;
            setSaldo(valor+getSaldo());
        }else
            retorno = false;
        return false;
    }

    public boolean saque(double valor){
        boolean retorno;
        if(valor <= getSaldo()){
            retorno = true;
            setSaldo(getSaldo() - valor);
        }else
            retorno = false;
        return retorno;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaBancaria [Banco=");
        builder.append(Banco);
        builder.append(", agencia=");
        builder.append(agencia);
        builder.append(", numeroDaConta=");
        builder.append(numeroDaConta);
        builder.append(", saldo=");
        builder.append(saldo);
        builder.append(", correntista=");
        builder.append(correntista);
        builder.append("]");
        return builder.toString();
    }

}
