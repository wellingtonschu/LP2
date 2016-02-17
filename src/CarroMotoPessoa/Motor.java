package CarroMotoPessoa;

public class Motor {

    private String marca;
    private float potencia;
    private int cilindradas;
    private String combustivel;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if(!"".equals(marca))
            this.marca = marca;
    }
    public float getPotencia() {
        return potencia;
    }
    public void setPotencia(float potencia) {
        if(potencia > 0)
            this.potencia = potencia;
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        if(cilindradas > 0)
            this.cilindradas = cilindradas;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        if(!"".equals(combustivel))
            this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Motor - Marca= ");
        builder.append(marca);
        builder.append("\nPotência= ");
        builder.append(potencia);
        builder.append("\nCilindradas= ");
        builder.append(cilindradas);
        builder.append("\nCombustível= ");
        builder.append(combustivel);
        builder.append("\n");
        return builder.toString();
    }

}