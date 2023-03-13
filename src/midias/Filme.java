package midias;
import pessoas.artistas.Ator;
import pessoas.Produtor;
import pessoas.Diretor;
import java.util.ArrayList;

public class Filme extends Midia {

    private double duracao;

    private final String tipo;

    private final ArrayList<Ator> elenco = new ArrayList<>();

    private final Produtor produtor;

    private final Diretor diretor;



    Filme(double duracao, String tipo, String titulo, String genero, int ano, Produtor produtor, Diretor diretor) {
        super(titulo, genero, ano, duracao);
        this.duracao = duracao;
        this.tipo = tipo;
        this.produtor = produtor;
        this.diretor = diretor;
    }


    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }


    public ArrayList<Ator> getElenco() {
        return elenco;
    }

    public void setElenco(Ator elenco) {
        this.elenco.add(elenco);
    }


    public Produtor getProdutor() {
        return produtor;
    }


    public Diretor getDiretor() {
        return diretor;
    }
}
