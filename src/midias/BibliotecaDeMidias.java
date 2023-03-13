package midias;
import pessoas.Usuario;
import java.util.ArrayList;

public class BibliotecaDeMidias {
    
    private final ArrayList<String> tiposMidia = new ArrayList<>();

    private final ArrayList<Midia> midias = new ArrayList<>();

    private final  Usuario  usuario;

    private final ArrayList<Playlist> playlists = new ArrayList<>();

    BibliotecaDeMidias(Usuario usuario){
        this.usuario = usuario;
    }
    public ArrayList<String>getTipoMidia() {
        return this.tiposMidia;
    }

    public void setTipoMidia(String tipoMidia) {
            this.tiposMidia.add(tipoMidia);
    }

    public ArrayList<Midia> getMidias( ) {
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
}
