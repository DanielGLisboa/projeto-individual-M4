package midias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Playlist {

    private final String tituloPlaylist;
    private final ArrayList<Midia> midias = new ArrayList<>();
    private String ordemExecucao;
    private Midia midiaAtual, proximaMidia, midiaAnterior;

    public Playlist(String tituloPlaylist, String ordemExecucao) {
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

    public void reproduzir_midia_atual() {
        if (getOrdemExecucao().equalsIgnoreCase("Normal")) {
            setMidiaAtual(getMidias().get(0));
            System.out.println("Reproduzindo: " + getMidiaAtual().getTitulo());

            setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual()) + 1));
            setMidiaAnterior(null);
        } else if (getOrdemExecucao().equalsIgnoreCase("Inverso") || getOrdemExecucao().equalsIgnoreCase("Inversa")) {
            setMidiaAtual(getMidias().get(getMidias().size() - 1));
            System.out.println("Reproduzindo: " + getMidiaAtual().getTitulo());

            setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual())));
            setMidiaAnterior(getMidias().get(getMidias().indexOf(getMidiaAtual()) - 1));
        } else if (getOrdemExecucao().equalsIgnoreCase("Aleatorio")
                || getOrdemExecucao().equalsIgnoreCase("Aleatoria")) {
            int aleatorio = new Random().nextInt(getMidias().size() - 1);

            setMidiaAtual(getMidias().get(aleatorio));
            System.out.println("Reproduzindo: " + getMidiaAtual().getTitulo());

            if (getMidias().indexOf(getMidiaAtual()) < getMidias().size() - 1
                    && getMidias().indexOf(getMidiaAtual()) > 0) {
                setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual()) + 1));
                setMidiaAnterior(getMidias().get(getMidias().indexOf(getMidiaAtual()) - 1));
            } else if (getMidias().indexOf(getMidiaAtual()) == getMidias().size() - 1) {
                setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual())));
                setMidiaAnterior(getMidias().get(getMidias().indexOf(getMidiaAtual()) - 1));
            } else if (getMidias().indexOf(getMidiaAtual()) == 0) {
                setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual()) + 1));
                setMidiaAnterior(getMidias().get(getMidias().indexOf(getMidiaAtual())));
            }
        }
    }

    public void reproduzir_proxima_midia() {
        boolean finalizar = false;

        while (finalizar == false) {
            if (getMidias().indexOf(getProximaMidia()) >= getMidias().indexOf(getMidiaAtual())) {
                setMidiaAtual(getProximaMidia());
                System.out.println("Reproduzindo : " + getMidiaAtual().getTitulo());

                if ((getMidias().indexOf(getMidiaAtual()) + 1 <= getMidias().size() - 1)) {
                    setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual()) + 1));
                } else {
                    System.out.println("Ultima mídia");
                    System.out.println("Não há proxima mídia");
                }
                setMidiaAnterior(getMidias().get(getMidias().indexOf(getMidiaAtual()) - 1));
                finalizar = true;
            }
        }
    }

    public void reproduzir_midia_anterior() {
        boolean finalizar = false;

        while (finalizar == false) {
            if (getMidiaAnterior() != null) {
                setMidiaAtual(getMidiaAnterior());
                System.out.println("Reproduzindo : " + getMidiaAtual().getTitulo());

                if ((getMidias().indexOf(getMidiaAtual()) > 0)) {
                    setMidiaAnterior(getMidias().get(getMidias().indexOf(getMidiaAtual()) - 1));
                } else {
                    System.out.println("Primeira mídia");
                    System.out.println("Não há mídia anterior");
                }

                setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual()) + 1));
                finalizar = true;
            } else {
                setProximaMidia(getMidias().get(getMidias().indexOf(getMidiaAtual()) + 1));
                System.out.println("Primeira midia");
                System.out.println("Não há mídia anterior");
                finalizar = true;
            }
        }

    }

    public void misturar_midias() {
        Collections.shuffle(midias);

    }

}
