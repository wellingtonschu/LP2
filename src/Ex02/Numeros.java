package Ex02;

public class Numeros {

    private int num1;
    private int num2;
    private int numAux;

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String txtInvert() {
        StringBuilder builder = new StringBuilder();
        if (num1 > num2){
            numAux = num1;
            num1 = num2;
            num2 = numAux;
            builder.append("Os valores serão invertidos.");
        }
        return builder.toString();
    }

    public String exibNum() {
        StringBuilder builder = new StringBuilder();
        for (int x = num1; x <= num2; x++) {
            builder.append(x);
            builder.append(" ");
        }
        return builder.toString();
    }
}