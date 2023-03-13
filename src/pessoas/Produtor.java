package pessoas;
import midias.Filme;
import java.util.ArrayList;

public class Produtor extends Pessoa {
    
    private final ArrayList<Filme> filmesProduzidos = new ArrayList<>();

    Produtor(String nome, String dataNascimento, String genero) {
        super(nome, dataNascimento, genero);
    }


    public ArrayList<Filme> getFilmesProduzidos() {
        return filmesProduzidos;
    }

    public void setFilmesProduzidos(Filme filme) {
        this.filmesProduzidos.add(filme);
    }

}
