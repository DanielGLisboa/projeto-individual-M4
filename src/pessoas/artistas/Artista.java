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

    public void imprime_premiacoes(){
        System.out.println("============= Premiações de " + getNome() + " ==============");
        for(Premiacao premiacao: premiacoes){
            System.out.println("Prêmio: " + premiacao.getTitulo());
            System.out.println("Categoria: " + premiacao.getCategoria());
            System.out.println("Ano: " + premiacao.getAno());
        }
        System.out.println("======================== FIM =========================");
    }
}


