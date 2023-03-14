package midias;

import pessoas.Usuario;
import java.util.ArrayList;
import java.util.Random;

public class BibliotecaDeMidias {

    private final ArrayList<String> tiposMidia = new ArrayList<>();

    private final ArrayList<Midia> midias = new ArrayList<>();

    private final Usuario usuario;

    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public BibliotecaDeMidias(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<String> getTipoMidia() {
        return this.tiposMidia;
    }

    public void setTipoMidia(String tipoMidia) {
        this.tiposMidia.add(tipoMidia);
    }

    public ArrayList<Midia> getMidias() {
        return this.midias;
    }

    public void setMidias(Midia midia) {
        this.midias.add(midia);
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist playlists) {
        this.playlists.add(playlists);
    }

    public void imprime_midias() {
        String usuarioMidia = getUsuario().getNome();

        System.out.println("======================= Mídias =======================");
        System.out.println("Usuário: " + usuarioMidia);

        for (int i = 0; i < midias.size(); i++) {
            String tipoMidia = getTipoMidia().get(i);
            Midia midia = getMidias().get(i);

            int numeroMidia = i + 1;
            System.out.printf("- Mídia%d( Tipo: %s) => %s | \n", numeroMidia, tipoMidia, midia.imprime_midia());

        }
        System.out.println("======================== FIM =========================");
    }

    public void reproduzir_playlist(Playlist playlist) {
        System.out.println("=============== Reproduzindo " + playlist.getTituloPlaylist() + "================");
        ArrayList<Midia> reproduzir = playlist.getMidias();
        String ordemExecucao = playlist.getOrdemExecucao();

        if (ordemExecucao.equalsIgnoreCase("Normal")) {
            for (int i = 0; i < reproduzir.size(); i++) {
                System.out.println("Música: " + reproduzir.get(i).getTitulo() + " ---- Reproduzindo ");
            }
        } else if (ordemExecucao.equalsIgnoreCase("Inversa") || ordemExecucao.equalsIgnoreCase("Inverso")) {
            for (int i = reproduzir.size() - 1; i >= 0; i--) {
                System.out.println("Música: " + reproduzir.get(i).getTitulo() + " ---- Reproduzindo ");
            }
        } else if (ordemExecucao.equalsIgnoreCase("Aleatorio") || ordemExecucao.equalsIgnoreCase("Aleatoria")) {
            int guardaAleatorio = -1;
            for (int i = reproduzir.size() - 1; i >= 0; i--) {
                int aleatorio = new Random().nextInt(reproduzir.size());

                if (aleatorio == guardaAleatorio) {
                    if (aleatorio < reproduzir.size() - 1) {
                        System.out.println(
                                "Música: " + reproduzir.get(aleatorio + 1).getTitulo() + " ---- Reproduzindo ");
                    } else {
                        System.out.println(
                                "Música: " + reproduzir.get(aleatorio - 1).getTitulo() + " ---- Reproduzindo ");
                    }
                } else {
                    System.out.println("Música: " + reproduzir.get(aleatorio).getTitulo() + " ---- Reproduzindo ");
                    guardaAleatorio = aleatorio;
                }
            }
        }
        System.out.println("======================== FIM =========================");
    }
}
