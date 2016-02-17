package EquipamentoEletronico;

public class HomeTheather {

    protected SistemaSom som;
    protected SistemaVideo video;

    public HomeTheather() {
        som = new SistemaSom();
        video = new SistemaVideo();
    }

    public SistemaSom getSom() {
        return som;
    }

    public void setSom(SistemaSom som) {
        this.som = som;
    }

    public SistemaVideo getVideo() {
        return video;
    }

    public void setVideo(SistemaVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("HomeTheather [som=");
        builder.append(som);
        builder.append(", video=");
        builder.append(video);
        builder.append("]");
        return builder.toString();
    }

}