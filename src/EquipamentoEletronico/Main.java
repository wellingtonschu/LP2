package EquipamentoEletronico;

public class Main {

    public static void main(String[] args) {

        HomeTheather ht = new HomeTheather();

        ht.som.setTensao(220);
        ht.som.setConsumo(1200);
        ht.som.setMarca("JBS");
        ht.som.setModelo("j1");
        ht.som.setPotência(5500);

        SistemaVideo sv = new SistemaVideo();

        sv.setTensao(110);
        sv.setConsumo(550);
        sv.setMarca("LG");
        sv.setModelo("L1");
        sv.setTipo("LED");
        sv.setResolucao("4K");

        ht.setVideo(sv);

        System.out.println(ht);

    }

}
