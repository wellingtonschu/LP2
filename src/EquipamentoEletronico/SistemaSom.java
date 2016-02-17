package EquipamentoEletronico;

public class SistemaSom extends EquipamentoEletronico {

    private String marca;
    private String modelo;
    private float potência;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPotência() {
        return potência;
    }

    public void setPotência(float potência) {
        this.potência = potência;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SistemaSom [marca=");
        builder.append(marca);
        builder.append(", modelo=");
        builder.append(modelo);
        builder.append(", potência=");
        builder.append(potência);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}