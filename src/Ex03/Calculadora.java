package Ex03;

public class Calculadora {

    private int num1;
    private int num2;
    private int opcao;

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

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int som(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2){
        return num1 - num2;
    }

    public int div(int num1,int num2){
        return num1 / num2;
    }

    public int mult(int num1, int num2){
        return num1 * num2;
    }

}
