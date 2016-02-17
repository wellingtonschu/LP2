package Animal;

public class Mamifero extends Animal {

    private int patas;

    public Mamifero(String nome, int patas) {
        super(nome);
        setPatas(patas);;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mamifero [patas=");
        builder.append(patas);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
