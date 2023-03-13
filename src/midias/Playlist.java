package midias;
import java.util.ArrayList;

public class Playlist {
    
    private final String tituloPlaylist;
    private final ArrayList<Midia> midias = new ArrayList<>();
    private String ordemExecucao;
    private Midia midiaAtual, proximaMidia, midiaAnterior;

    Playlist(String tituloPlaylist, String ordemExecucao){
        this.ordemExecucao = ordemExecucao;
        this.tituloPlaylist = tituloPlaylist;

    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(Midia midias) {
        this.midias.add(midias);
    }

    public Midia getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(Midia midiaAtual) {
        this.midiaAtual = midiaAtual;
    }

    public Midia getProximaMidia() {
        return proximaMidia;
    }

    public void setProximaMidia(Midia proximaMidia) {
        this.proximaMidia = proximaMidia;
    }

    public Midia getMidiaAnterior() {
        return midiaAnterior;
    }

    public void setMidiaAnterior(Midia midiaAnterior) {
        this.midiaAnterior = midiaAnterior;
    }

    public String getTituloPlaylist() {
        return tituloPlaylist;
    }


    public String getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(String ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

}
