package pessoas.artistas;
import pessoas.Pessoa;
import java.util.ArrayList;

public class Artista extends Pessoa{
    
    private final ArrayList<Premiacao> premiacoes = new ArrayList<>();

    Artista(String nome, String dataNascimento, String genero){
        super(nome, dataNascimento, genero);
    }


    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(Premiacao premiacao) {
        this.premiacoes.add(premiacao);
    }
}


