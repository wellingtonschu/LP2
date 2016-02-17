package Musica;

public class Cordas extends InstrumentoMusical {

    private String material;

    public Cordas(int cod, String nomeMusico, String material) {
        super(cod, nomeMusico);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cordas [material=");
        builder.append(material);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
