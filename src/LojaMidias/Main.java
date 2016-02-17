package LojaMidias;

public class Main {

    public static void main(String[] args) {

        Midia mi = new Midia(12355, "Alguma", "Sony",(float) 123.5);
        CD cd = new CD(98798, "Coisa", "Globo", (float)67.6, 7, "Michael Jackson", "Bad");
        Item it = new Item(767879, "Mortal Kombat");
        Vhs vh = new Vhs(80980, "Macaco", "Herbert", (float)79.3, "Olá Marilene");
        Livro li = new Livro(98709809, "Chato", "Panaca");

        System.out.println(mi);
        System.out.println(cd);
        System.out.println(it);
        System.out.println(vh);
        System.out.println(li);
    }

}
