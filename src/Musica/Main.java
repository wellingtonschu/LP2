package Musica;

public class Main {

    public static void main(String[] args) {

        InstrumentoMusical im = new InstrumentoMusical(1, "Bojack");
        Metais me = new Metais(2, "Horseman", "Bronze");
        Trompete tr = new Trompete(3, "Todd", "Bronze", "Salpinx");
        Saxofone sa = new Saxofone(4, "Daiane", "Bronze", "Alto");
        Tuba tu = new Tuba(5, "Peanutbutter", "Latão", "Helicon");
        Madeiras ma = new Madeiras(6, "Princess", "Carvalho");
        Fagote fa = new Fagote(7, "Carolyn", "Bordo", "Heckel");
        Cordas co = new Cordas(8, "Herb", "Mapple");
        Violao vi = new Violao(9, "Kazzaz", "Bordo", "Espanhol");
        Piano pi = new Piano(10, "Peter", "Carvalho", "Cauda");
        Percussao pe = new Percussao(11, "Griffin", "Couro");
        Tambor ta = new Tambor(12, "Lois", "Couro", "DunDun");
        Prato pr = new Prato(13, "Brian", "Bronze", "Orquestral");

        System.out.println(im);
        System.out.println(me);
        System.out.println(tr);
        System.out.println(sa);
        System.out.println(tu);
        System.out.println(ma);
        System.out.println(fa);
        System.out.println(co);
        System.out.println(vi);
        System.out.println(pi);
        System.out.println(pe);
        System.out.println(ta);
        System.out.println(pr);

    }

}
