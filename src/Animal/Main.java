package Animal;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal an = new Animal("Bojack");
        Mamifero ma = new Mamifero("Peanutbutter", 4);
        Gato ga = new Gato("Carolyn", 4, "Angora");
        Cao ca = new Cao("Todd", 4, "Labrador");
        Reptil re = new Reptil("Zé", 4);
        Tartaruga ta = new Tartaruga("Lerdinha", 4, "Marinha");
        Lagarto la = new Lagarto("Zé Jacaré", 4, "Papo amarelo");

        System.out.println(an);
        System.out.println(ma);
        System.out.println(ga);
        System.out.println(ca);
        System.out.println(re);
        System.out.println(ta);
        System.out.println(la);

    }

}
