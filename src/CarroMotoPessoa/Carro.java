package CarroMotoPessoa;

public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    protected Pessoa dono;
    protected Motor motor;

    public Carro(){
        dono = new Pessoa();
        motor = new Motor();
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        if(!"".equals(fabricante))
            this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if(!"".equals(modelo))
            this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        if(!"".equals(cor))
            this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano > 0)
            this.ano = ano;
    }
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Carro - Fabricante= ");
        builder.append(fabricante);
        builder.append("\nModelo= ");
        builder.append(modelo);
        builder.append("\nCor= ");
        builder.append(cor);
        builder.append("\nAno= ");
        builder.append(ano);
        builder.append("\n");
        builder.append(dono);
        builder.append("\n");
        builder.append(motor);
        builder.append("\n");
        return builder.toString();
    }

}